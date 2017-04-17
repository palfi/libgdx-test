package com.palfi.games.screens.question;

class Question {
    private final String questionText;
    private final Choices choices;

    Question(String questionText, Choices choices) {
        this.questionText = questionText;
        this.choices = choices;
    }

    Choices choices() {
        return choices;
    }

    String questionText() {
        return questionText;
    }
}
