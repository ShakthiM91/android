package com.boston.shakthi;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{

	MediaPlayer sound; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		sound = MediaPlayer.create(this,R.raw.sound);
		sound.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(6300);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent window = new Intent("android.intent.action.Menu");
					startActivity(window);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		sound.release();
		finish();
	}
	
}
