package com.play.youtube;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;

public class Splash extends Activity {
	MediaPlayer robo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		robo =  MediaPlayer.create(Splash.this,R.raw.crash);
		robo.start();
		Thread timer = new Thread(){
			public void run(){
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.play.youtube.MENU");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		robo.release();
	}
	
	
	
}
