package com.boston.shakthi;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class playText extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		Button checkCommand = (Button)findViewById(R.id.btn_checkCommand);
		final ToggleButton mkPass = (ToggleButton)findViewById(R.id.tb_password);
		final EditText cmd = (EditText)findViewById(R.id.et_commands);
		final TextView results = (TextView)findViewById(R.id.txt_result);
		mkPass.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(mkPass.isChecked()){
					cmd.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}
				else{
					cmd.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
		checkCommand.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String check = cmd.getText().toString();
				
				if(check.contentEquals("left")){
					results.setGravity(Gravity.LEFT);
					cmd.setText("");
					results.setText("Left");
				}else if(check.contentEquals("right")){
					results.setGravity(Gravity.RIGHT);
					cmd.setText("");
					results.setText("Right");
				}else if(check.contentEquals("center")){
					results.setGravity(Gravity.CENTER);
					cmd.setText("");
					results.setText("Center");
				}else if(check.contentEquals("rand")){
					Random ran = new Random();
					results.setTextSize(ran.nextInt(75));
				}else{
					results.setText("WTF!!!!");
					results.setTextColor(Color.RED);
					cmd.setText("");
				}
			}
		});
	}
	

}
