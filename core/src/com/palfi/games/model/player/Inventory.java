package com.palfi.games.model.player;

import com.palfi.games.model.question.QuestionCategory;

public class Inventory {

    private final Chest chest;
    private final Helm helm;

    public Inventory(Chest chest, Helm helm) {
        this.chest = chest;
        this.helm = helm;
    }

    int chanceToConvert(QuestionCategory category) {
        return chest.chanceToConvert(category) + helm.chanceToConvert(category);
    }
}
