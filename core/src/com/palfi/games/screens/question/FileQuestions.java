package com.palfi.games.screens.question;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileQuestions implements Questions {
    private final List<Question> questions = new ArrayList<>();
    private final Random random = new Random();

    public FileQuestions(String file) {
        FileHandle fileHandle = Gdx.files.internal(file);

        String content = fileHandle.readString();

        String[] lines = content.split("\\n");

        for (String line : lines) {
            questions.add(createQuestion(line));
        }
    }

    private Question createQuestion(String line) {
        String[] split = line.split(";");
        String questionText = split[0];
        return new Question(questionText, new Choices(split[1], split[2],
                split[3], split[4]));
    }

    @Override
    public Question random() {
        return questions.get(random.nextInt(questions.size()));
    }
}
