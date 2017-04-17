package com.palfi.games.screens.question;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

class TimeleftBox extends Actor {

    private final ProgressBar progressBar;
    private float progress = 0f;

    TimeleftBox(int seconds) {
        Skin skin = new Skin();
        Pixmap pixmap = new Pixmap(10, 10, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.WHITE);
        pixmap.fill();
        skin.add("white", new Texture(pixmap));

        ProgressBar.ProgressBarStyle barStyle = new ProgressBar.ProgressBarStyle(skin.newDrawable("white", Color.DARK_GRAY), null);
        progressBar = new ProgressBar(0, seconds, 1f, false, barStyle);
        progressBar.setPosition(100, 350);
      //  stage.addActor(progressBar);
      //  progressBar.setSize(290, progressBar.getPrefHeight());
       // progressBar.setAnimateDuration(2);
    }

    void render(SpriteBatch batch, float delta) {
        progress += delta;
        progressBar.setValue(progress);
    //    progressBar.draw(batch, 1);
        System.out.println(progressBar.getValue());
    }

    void dispose() {

    }
}
