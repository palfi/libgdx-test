package com.palfi.games;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public abstract class Screen extends ScreenAdapter {

    protected final Stage stage;
    private final Game game;

    protected Screen(Game game) {
        OrthographicCamera camera = new OrthographicCamera();
        camera.setToOrtho(false, 480, 800);
        this.stage = new Stage(new ScreenViewport(camera));
        Gdx.input.setInputProcessor(this.stage);
        this.game = game;
    }

    public Screen(Screen previous) {
        this(previous.game());
    }

    private Game game() {
        return game;
    }

    @Override
    public void render(float delta) {
        stage.act(Gdx.graphics.getDeltaTime());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
    }

    public void activate() {
        game.setScreen(this);
    }
}
