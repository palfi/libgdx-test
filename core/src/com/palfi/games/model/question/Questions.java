package com.palfi.games.model.question;

import com.badlogic.gdx.Gdx;
import com.palfi.games.model.player.Character;

import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Questions {

    private final Random random = new Random();
    private Map<QuestionCategory, List<Question>> questions;

    protected abstract Map<QuestionCategory,List<Question>> loadQuestions();

    public Question random(Character character) {
        QuestionCategory category = rollCategory();

        if (random.nextInt(100) + character.chanceToConvert(category) > 100) {
            Gdx.app.debug("Questions", "Rerolling question with category " + category.name());
            return random(character);
        }

        if (this.questions == null) {
            questions = loadQuestions();
        }

        List<Question> questionsInCategory = this.questions.get(category);
        return questionsInCategory.get(random.nextInt(questionsInCategory.size()));
    }

    private QuestionCategory rollCategory() {
        QuestionCategory[] values = QuestionCategory.values();
        return values[random.nextInt(values.length)];
    }
}
