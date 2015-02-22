package com.falling.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.lang.Math;

public class MyGdxGame implements ApplicationListener {
		private Texture texture;
	    private SpriteBatch batch;
	    private BitmapFont font;
	    private Sprite sprite;
	    private Texture texturetwo;
	    
	    @Override
	    public void create() {        
	        batch = new SpriteBatch();    
	        font = new BitmapFont();
	        /*two textures just to test, one for red circle and one for purple circle*/
	        texture = new Texture(Gdx.files.internal("redcircle.png"));
	        texturetwo = new Texture(Gdx.files.internal("purpcircle.png"));
	        
	      //probably an easier way to randomly generate a sprite...not that far yet. might need to use an atlas/spritemap
	        double theRandom = Math.random();
	        sprite = new Sprite(texture);
	    }

	    @Override
	    public void dispose() {
	        batch.dispose();
	        font.dispose();
	    }

	    @Override
	    public void render() {        
	        Gdx.gl.glClearColor(1, 1, 1, 1);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        
	        batch.begin();
	        sprite.draw(batch);
	        
	        //we need to be able to center an initial sprite. My main goal right now is to get a single circle in the middle of the device. iOS uses
	        //percentages, but I'm not sure how to do this in libGDX
	        sprite.setCenter(120,120);
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
	}

