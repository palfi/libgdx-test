package com.palfi.games.screens.question;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.palfi.games.screens.menu.MainMenuScreen;

class ChoiceButton extends TextButton {

    ChoiceButton(int x, int y, Choice choice, Game game) {
        super(choice.text(), style());
        setY(y);
        setX(x);
        addListener(new Listener(game, choice));
    }

    private static TextButtonStyle style() {
        Drawable drawable = new TextureRegionDrawable(new TextureRegion(new Texture("answer_box.png")));
        return new TextButtonStyle(drawable, drawable, drawable, new BitmapFont());
    }

    private class Listener extends ChangeListener {
        private final Game game;
        private final Choice choice;

        Listener(Game game, Choice choice) {
            this.game = game;
            this.choice = choice;
        }

        @Override
        public void changed(ChangeEvent event, Actor actor) {
            if (choice.isCorrect()) {
                new QuestionScreen(game, new FileQuestions("questions.txt")).activate();
            } else {
                new MainMenuScreen(game).activate();
            }
        }
    }
}
