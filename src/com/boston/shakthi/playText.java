package com.boston.shakthi;

import android.app.Activity;
import android.os.Bundle;
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
		ToggleButton mkPass = (ToggleButton)findViewById(R.id.tb_password);
		EditText cmd = (EditText)findViewById(R.id.et_commands);
		TextView results = (TextView)findViewById(R.id.txt_result);
	}

}
