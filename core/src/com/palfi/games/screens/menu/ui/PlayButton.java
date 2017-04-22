package com.palfi.games.screens.menu.ui;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.palfi.games.screens.question.model.FileQuestions;
import com.palfi.games.screens.question.QuestionScreen;

class PlayButton extends ImageButton {

    PlayButton(float x, float y, Game game) {
        super(new TextureRegionDrawable(new TextureRegion(new Texture("start_game_button.png"))));
        setPosition(x - getWidth() / 2, y - getHeight() / 2);
        addListener(new Listener(game));
    }

    private class Listener extends ChangeListener {
        private final Game game;

        private Listener(Game game) {
            this.game = game;
        }

        @Override
        public void changed(ChangeEvent event, Actor actor) {
            new QuestionScreen(this.game, new FileQuestions("questions.txt")).activate();
        }
    }
}
