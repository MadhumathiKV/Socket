package com.example.socketprogramming;

import com.example.socketprogramming.R;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button) findViewById(R.id.b1);
		Button b3 = (Button) findViewById(R.id.b3);

		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
		
				startActivity(new Intent("android.intent.action.TUTORIALONE"));	
				
			}
		});
		
		b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
		
				startActivity(new Intent("android.intent.action.TUTORIALTHREE"));	
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
