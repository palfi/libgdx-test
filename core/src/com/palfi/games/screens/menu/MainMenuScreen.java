package com.palfi.games.screens.menu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.palfi.games.Screen;

public class MainMenuScreen extends Screen {

    public MainMenuScreen(Game game) {
        super(game);
        stage.addActor(new Image(new TextureRegion(new Texture("question_background.png"))));
        ImageButton imageButton = new PlayButton(stage.getWidth() / 2,
                stage.getHeight() / 2, this).toImageButton();
        stage.addActor(imageButton);
    }


   /* @Override
    protected Screen switchTo() {
        if (startButtonIsPressed()) {
            return new QuestionScreen(game, new FileQuestions("questions.txt"), camera);
        }
        return null;
    }

    @Override
    protected void renderScreen(float delta, SpriteBatch batch) {
        batch.draw(background, 0, 0);
        batch.draw(startGameBtn, startButtonX(), startButtonY());
    }

    private float startButtonY() {
        return camera.viewportHeight / 2;
    }

    private float startButtonX() {
        return camera.viewportWidth / 2 - startGameBtn.getWidth() / 2;
    }

    @Override
    public void hide() {
        background.dispose();
        startGameBtn.dispose();
    }

    private boolean startButtonIsPressed() {
        return Gdx.input.isTouched() && touchedStartButton();
    }

    private boolean touchedStartButton() {
        Vector3 point = camera.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));

        return point.x >= startButtonX() && point.x <= startButtonX() + startGameBtn.getWidth() &&
                point.y >= startButtonY() && point.y <= startButtonY() + startGameBtn.getHeight();
    }*/
}
