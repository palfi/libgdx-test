package com.palfi.games.model.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Choices {
    private final List<Choice> choices;

    Choices(String correct, String false1, String false2, String false3) {
        this.choices =  Arrays.asList(new CorrectChoice(correct),
                new FalseChoice(false1), new FalseChoice(false2), new FalseChoice(false3));
        Collections.shuffle(choices);
    }

    public Choice get(int i) {
        return choices.get(i);
    }
}
