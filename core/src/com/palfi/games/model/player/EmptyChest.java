package com.palfi.games.model.player;

import com.palfi.games.model.question.QuestionCategory;

public class EmptyChest implements Chest {
    @Override
    public int chanceToConvert(QuestionCategory category) {
        return 0;
    }
}
