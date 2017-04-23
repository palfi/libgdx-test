package com.palfi.games.model.player;

import com.palfi.games.model.question.QuestionCategory;

public class Character {

    private final Inventory inventory;

    public Character(Inventory inventory) {
        this.inventory = inventory;
    }

    public int chanceToConvert(QuestionCategory category) {
        return inventory.chanceToConvert(category);
    }
}
