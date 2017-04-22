package com.palfi.games.screens.question.ui;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.palfi.games.Screen;
import com.palfi.games.screens.question.model.Question;
import com.palfi.games.screens.question.model.Questions;

public class QuestionScreen extends Screen {

    public QuestionScreen(Game game, Questions questions) {
        super(game);
        Question question = questions.random();
        stage.addActor(new Image(new TextureRegion(new Texture("question_background.png"))));
        ChoicesBox choicesBox = new ChoicesBox(question.choices(), stage, game);
        stage.addActor(choicesBox);
        stage.addActor(new QuestionBox(question.questionText()));
        addTimeleftBox(choicesBox);
    }

    private void addTimeleftBox(ChoicesBox choicesBox) {
        float seconds = 10f;
        int width = (int) (WIDTH * 0.8f);
        float y = choicesBox.getY() + 30;
        int x = WIDTH / 2 - width / 2;
        stage.addActor(new TimeleftBox(x, y, seconds, width));
    }
}
