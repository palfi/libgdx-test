package com.palfi.games.model.question;

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
