package com.palfi.games;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.palfi.games.model.player.Character;
import com.palfi.games.model.player.EmptyChest;
import com.palfi.games.model.player.EmptyHelm;
import com.palfi.games.model.player.Inventory;
import com.palfi.games.screens.menu.MainMenuScreen;

public class MyGame extends Game {

    private Character character = new Character(new Inventory(new EmptyChest(), new EmptyHelm()));

    @Override
	public void create () {
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        setScreen(new MainMenuScreen(this));
    }

    public Character character() {
        return character;
    }
}
