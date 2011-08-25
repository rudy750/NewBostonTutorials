package com.play.youtube;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewBostonTutorialsActivity extends Activity {
    /** Called when the activity is first created. */
	
	int counter;
	Button add,sub;
	TextView display;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //initialize
        counter =0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSubtract);
        display = (TextView) findViewById(R.id.tvDisplay);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
    }
}