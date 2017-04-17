package com.palfi.games.screens.question;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;

class ChoicesBox extends Actor {
    private static final int HEIGHT_PADDING = 10;

    private final ChoiceBox topLeft;
    private final ChoiceBox bottomLeft;
    private final ChoiceBox topRight;
    private final ChoiceBox bottomRight;

    ChoicesBox(Choices choices, int stageWidth) {
        Texture choiceTexture = new Texture("answer_box.png");

        int textureHeight = choiceTexture.getHeight();
        int textureWidth = choiceTexture.getWidth();

        int widthPadding = (stageWidth - textureWidth * 2) / 3;

        topLeft = new ChoiceBox(choiceTexture,
                widthPadding,
                textureHeight + HEIGHT_PADDING * 2,
                choices.get(0));
        bottomLeft = new ChoiceBox(choiceTexture,
                widthPadding,
                HEIGHT_PADDING,
                choices.get(1));
        topRight = new ChoiceBox(choiceTexture,
                textureWidth + widthPadding * 2,
                textureHeight + HEIGHT_PADDING * 2,
                choices.get(2));
        bottomRight = new ChoiceBox(choiceTexture,
                textureWidth + widthPadding * 2,
                HEIGHT_PADDING,
                choices.get(3));
    }

    boolean clickedCorrectChoice() {
        Choice clickedChoice = clickedChoice();
        if (clickedChoice == null) {
            throw new NullPointerException("No choice has been chosen");
        }
        return clickedChoice.isCorrect();
    }

    boolean hasChosen() {
        return clickedChoice() != null;
    }

    private Choice clickedChoice() {
        if (isClicked(topLeft)) {
            return topLeft.choice();
        }
        if (isClicked(topRight)) {
            return topRight.choice();
        }
        if (isClicked(bottomLeft)) {
            return bottomLeft.choice();
        }
        if (isClicked(bottomRight)) {
            return bottomRight.choice();
        }
        return null;
    }

    private boolean isClicked(ChoiceBox choice) {
        Vector3 point = getStage().getCamera().unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
        return choice.isAtPoint(point.x, point.y);
    }
}
