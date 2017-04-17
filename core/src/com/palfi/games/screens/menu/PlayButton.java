package com.palfi.games.screens.menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.palfi.games.Screen;
import com.palfi.games.screens.question.FileQuestions;
import com.palfi.games.screens.question.QuestionScreen;

class PlayButton {
    private final float x;
    private final float y;
    private final Texture texture;
    private final Screen parent;

    PlayButton(float x, float y, Screen parent) {
        this.parent = parent;
        texture = new Texture("start_game_button.png");
        this.x = x - texture.getWidth() / 2;
        this.y = y - texture.getHeight() / 2;
    }

    ImageButton toImageButton() {
        TextureRegionDrawable image = new TextureRegionDrawable(new TextureRegion(texture));
        ImageButton button = new ImageButton(image);
        button.setY(y);
        button.setX(x);
        EventListener listener = new Listener(parent);
        button.addListener(listener);
        return button;
    }

    private class Listener extends ChangeListener {
        private final Screen parent;

        private Listener(Screen parent) {
            this.parent = parent;
        }

        @Override
        public void changed(ChangeEvent event, Actor actor) {
            new QuestionScreen(this.parent, new FileQuestions("questions.txt")).activate();
        }
    }
}
