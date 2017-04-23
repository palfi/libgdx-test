package com.palfi.games.model.player;

import com.palfi.games.model.question.QuestionCategory;

interface InventoryItem {
    int chanceToConvert(QuestionCategory category);
}
