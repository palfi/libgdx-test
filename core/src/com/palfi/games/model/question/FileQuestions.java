package com.palfi.games.model.question;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileQuestions extends Questions {
    private final String file;

    public FileQuestions(String file) {
        super();
        this.file = file;
    }

    private Question createQuestion(String line) {
        String[] split = line.split(";");
        String questionText = split[0];
        QuestionCategory category = QuestionCategory.valueOf(split[5].trim());
        return new Question(questionText, new Choices(split[1], split[2],
                split[3], split[4]), category);
    }

    @Override
    protected Map<QuestionCategory, List<Question>> loadQuestions() {
        FileHandle fileHandle = Gdx.files.internal(file);

        String content = fileHandle.readString();

        String[] lines = content.split("\\n");

        Map<QuestionCategory, List<Question>> questions = new HashMap<>();
        for (String line : lines) {
            Question question = createQuestion(line);
            QuestionCategory category = question.category();
            if (questions.get(category) == null) {
                questions.put(category, new ArrayList<Question>());
            }
            questions.get(category).add(question);
        }
        return questions;
    }
}
