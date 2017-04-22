package com.palfi.games.screens.question.model;

class CorrectChoice implements Choice {
    private final String value;

    CorrectChoice(String value) {
        this.value = value;
    }

    @Override
    public String text() {
        return value;
    }

    @Override
    public boolean isCorrect() {
        return true;
    }
}
