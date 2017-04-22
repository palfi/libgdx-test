package com.palfi.games.screens.question.model;

public class Question {
    private final String questionText;
    private final Choices choices;

    Question(String questionText, Choices choices) {
        this.questionText = questionText;
        this.choices = choices;
    }

    public Choices choices() {
        return choices;
    }

    public String questionText() {
        return questionText;
    }
}
