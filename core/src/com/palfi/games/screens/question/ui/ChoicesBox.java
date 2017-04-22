package com.palfi.games.screens.question.ui;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.palfi.games.screens.question.model.Choices;

class ChoicesBox extends Actor {
    private static final int HEIGHT_PADDING = 10;

    ChoicesBox(Choices choices, Stage stage, Game game) {
        Texture choiceTexture = new Texture("answer_box.png");

        int textureHeight = choiceTexture.getHeight();
        int textureWidth = choiceTexture.getWidth();

        int padding = (int) ((stage.getWidth() - textureWidth * 2) / 3);

        ChoiceButton topLeft = new ChoiceButton(
                padding,
                textureHeight + HEIGHT_PADDING * 2,
                choices.get(0), game);
        stage.addActor(topLeft);

        ChoiceButton bottomLeft = new ChoiceButton(
                padding,
                HEIGHT_PADDING,
                choices.get(1), game);
        stage.addActor(bottomLeft);

        ChoiceButton topRight = new ChoiceButton(
                textureWidth + padding * 2,
                textureHeight + HEIGHT_PADDING * 2,
                choices.get(2), game);
        stage.addActor(topRight);

        ChoiceButton bottomRight = new ChoiceButton(
                textureWidth + padding * 2,
                HEIGHT_PADDING,
                choices.get(3), game);
        stage.addActor(bottomRight);

        setY(textureHeight * 2);
    }
}
