package com.palfi.games.screens.question;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;

class QuestionBox extends Actor {
    private final Texture texture;
    private final BitmapFont font;
    private final String text;

    QuestionBox(String text) {
        this.text = text;
        this.font = new BitmapFont();
        this.texture = new Texture("question_box.png");
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        float viewportHeight = getStage().getHeight();
        float viewportWidth = getStage().getWidth();
        batch.draw(texture, (viewportWidth - texture.getWidth()) / 2,
                viewportHeight - texture.getHeight() - viewportHeight / 40);
        font.draw(batch, text, (viewportWidth - texture.getWidth()) / 2 + viewportWidth / 20,
                viewportHeight - viewportHeight / 20);
    }
}
