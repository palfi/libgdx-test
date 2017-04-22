package com.palfi.games.screens.question.model;

class FalseChoice implements Choice {
    private final String value;

    FalseChoice(String value) {

        this.value = value;
    }

    @Override
    public String text() {
        return value;
    }

    @Override
    public boolean isCorrect() {
        return false;
    }
}
