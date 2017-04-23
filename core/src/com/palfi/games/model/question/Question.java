package com.palfi.games.model.question;

public class Question {
    private final String questionText;
    private final Choices choices;
    private final QuestionCategory category;

    Question(String questionText, Choices choices, QuestionCategory category) {
        this.questionText = questionText;
        this.choices = choices;
        this.category = category;
    }

    public Choices choices() {
        return choices;
    }

    public String questionText() {
        return questionText;
    }

    QuestionCategory category() {
        return category;
    }
}
