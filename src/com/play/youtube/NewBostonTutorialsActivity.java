package com.play.youtube;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        display = (TextView) findViewById(R.id.tvDisplayCount);
        add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				counter ++;
				display.setText(Integer.toString(counter));
				Toast.makeText(display.getContext(), "added " + counter,Toast.LENGTH_SHORT).show();
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter --;
				display.setText(Integer.toString(counter));
			}
		});
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	counter = 0;
    	display.setText(Integer.toString(0));
    	
    }
}