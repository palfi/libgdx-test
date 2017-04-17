package com.palfi.games.screens.question;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;

class ChoiceBox extends Actor {

    private final Texture texture;
    private final int x;
    private final int y;
    private final Choice choice;
    private final BitmapFont font;

    ChoiceBox(Texture texture, int x, int y, Choice choice) {
        this.texture = texture;
        this.x = x;
        this.y = y;
        this.choice = choice;
        this.font = new BitmapFont();
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, x, y);
        font.draw(batch, choice.text(), x + 10, y + texture.getHeight() / 2);
    }

    boolean isAtPoint(float x, float y) {
        return x <= this.x + texture.getWidth() && x >= this.x &&
                y <= this.y + texture.getHeight() && y >= this.y;
    }

    Choice choice() {
        return choice;
    }
}
