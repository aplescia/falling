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
import java.lang.Thread;

public class MyGdxGame implements ApplicationListener {
		private Texture texture;
	    private SpriteBatch batch;
	    private BitmapFont font;
	    
	    //sprites
	    private Sprite start_sprite;
	    private Sprite blue_sprite;
	    private Sprite purple_sprite;
	    
	    //different colored circles
	    private Texture texturetwo;
	    private Texture texturethree;
	    private Texture texturefour;
	    private Texture texturefive;
	    
	    
	    @Override
	    public void create() {        
	        batch = new SpriteBatch();    
	        font = new BitmapFont();
	        /*two textures just to test, one for red circle and one for purple circle*/
	        texture = new Texture(Gdx.files.internal("redcircle.png"));
	        texturetwo = new Texture(Gdx.files.internal("purpcircle.png"));
	        texturethree = new Texture(Gdx.files.internal("greencircle.png"));
	        texturefour = new Texture(Gdx.files.internal("bluecircle.png"));
	        
	        //probably an easier way to randomly generate a sprite...not that far yet. might need to use an atlas/spritemap
	        start_sprite = new Sprite(texture);
	        blue_sprite = new Sprite(texturefour);
	        
	        
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
	        
	        start_sprite.draw(batch);
	        
	        //centers initial sprite in middle of screen
	        start_sprite.setPosition(Gdx.graphics.getWidth()/2 - texture.getWidth()/2, Gdx.graphics.getHeight()/2 - texture.getHeight()/2);
	     
	        
	        try{
	        	Thread.sleep(3000);
	        }catch(Exception e){
	        	System.out.println("CAN'T SLEEP");
	        }
	        
	        //generate a second sprite after 3 seconds...not familiar with drawing multiple objects so it is buggy
	        blue_sprite.draw(batch);
	        blue_sprite.setPosition(120, 120);
	        
	 
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

