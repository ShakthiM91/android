package com.boston.shakthi;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
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
		TextView results = (TextView)findViewById(R.id.txt_result);
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
	}

}
