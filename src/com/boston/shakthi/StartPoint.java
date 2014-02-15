package com.boston.shakthi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartPoint extends Activity {

	int num1 = 1, num2 = 1, num = 0;
	Button add, sub;
	TextView display;
	EditText no1, no2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_point);

		add = (Button) findViewById(R.id.button1);
		sub = (Button) findViewById(R.id.button2);
		display = (TextView) findViewById(R.id.textView2);
		no1 = (EditText) findViewById(R.id.no1);
		no2 = (EditText) findViewById(R.id.no2);

		// num1 = Integer.parseInt(no1.toString());
		// num2 = Integer.parseInt(no2.toString());

		add.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				num = num1 + num2;
				display.setText("" + num);
			}
		});
		sub.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				num = num1 - num2;
				display.setText("" + num);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_point, menu);
		return true;
	}

}
