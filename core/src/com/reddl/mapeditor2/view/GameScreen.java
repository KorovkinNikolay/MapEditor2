package com.reddl.mapeditor2.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.reddl.mapeditor2.model.Tile;

/**
 * Created by Николай on 06.05.2017.
 */
public class GameScreen implements Screen {

    private Texture texture;
    private SpriteBatch batch;
    private Tile tile;
    @Override
    public void show() {
        batch = new SpriteBatch(); // отрисовщик
        texture = new Texture(Gdx.files.internal("Green.bmp"));
        tile = new Tile(texture, 0,0,30,30);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1); // очистка экрана. Фоновый цвет- черный.
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
          tile.Draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        texture.dispose();
        batch.dispose();
    }
}
