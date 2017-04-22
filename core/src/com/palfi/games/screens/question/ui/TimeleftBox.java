package com.palfi.games.screens.question.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

class TimeleftBox extends ProgressBar {
    private float progress;

    TimeleftBox(float x, float y, float seconds, float width) {
        super(0, seconds, 0.1f, false, style());
        setWidth(width);
        setPosition(x, y);
        this.progress = seconds;
    }

    @Override
    public void act(float delta) {
        if (progress > 0) {
            super.act(delta);
            updateProgress(delta);
        }
    }

    private void updateProgress(float delta) {
        progress -= delta;
        setValue(progress);
    }

    private static ProgressBarStyle style() {
        Skin skin = new Skin();
        Pixmap pixmap = new Pixmap(10, 10, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.WHITE);
        pixmap.fill();
        skin.add("loading", new Texture(pixmap));
        return new ProgressBarStyle(skin.newDrawable("loading", Color.DARK_GRAY),
                skin.newDrawable("loading", Color.CORAL));
    }
}
