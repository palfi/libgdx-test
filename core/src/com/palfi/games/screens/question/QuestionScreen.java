package com.palfi.games.screens.question;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.palfi.games.Screen;

public class QuestionScreen extends Screen {

    public QuestionScreen(Game game, Questions questions) {
        super(game);
        Question question = questions.random();
        stage.addActor(new Image(new TextureRegion(new Texture("question_background.png"))));
        stage.addActor(new ChoicesBox(question.choices(), stage, game));
        stage.addActor(new QuestionBox(question.questionText()));
       // stage.addActor(new TimeleftBox(10));
    }
}
