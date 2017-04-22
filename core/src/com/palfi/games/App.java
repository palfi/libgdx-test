package com.palfi.games;

import com.badlogic.gdx.Game;
import com.palfi.games.screens.menu.ui.MainMenuScreen;

public class App extends Game {

    @Override
	public void create () {
        setScreen(new MainMenuScreen(this));
    }
}
