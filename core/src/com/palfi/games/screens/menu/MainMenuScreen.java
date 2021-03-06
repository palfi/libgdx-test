package com.palfi.games.screens.menu;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.palfi.games.MyGame;
import com.palfi.games.Screen;

public class MainMenuScreen extends Screen {

    public MainMenuScreen(MyGame game) {
        super(game);
        stage.addActor(new Image(new TextureRegion(new Texture("question_background.png"))));
        PlayButton playButton = new PlayButton(Screen.WIDTH / 2, Screen.HEIGHT / 2, game);
        stage.addActor(playButton);
    }
}
