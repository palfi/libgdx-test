package com.palfi.games.screens.question;

import com.palfi.games.Screen;

public class QuestionScreen extends Screen {

    public QuestionScreen(Screen previous, Questions questions) {
        super(previous);
        Question question = questions.random();
       // stage.addActor(new Image(new Texture("question_background.png")));
        stage.addActor(new ChoicesBox(question.choices(), (int) stage.getWidth()));
        stage.addActor(new QuestionBox(question.questionText()));
       // stage.addActor(new TimeleftBox(10));
    }

    /*@Override
    protected Screen switchTo() {
        if (Gdx.input.justTouched() && choicesBox.hasChosen()) {
            if (choicesBox.clickedCorrectChoice()) {
                return new MainMenuScreen();
            } else {
                return new QuestionScreen(game, questions, camera);
            }
        }
        return null;
    }

    @Override
    public void renderScreen(float delta, SpriteBatch batch) {
        batch.draw(background, 0, 0);
        choicesBox.render(batch);
        questionBox.render(batch);
        timeleft.render(batch, delta);
    }

    @Override
    public void hide() {
        choicesBox.dispose();
        questionBox.dispose();
        timeleft.dispose();
        background.dispose();
    }*/
}
