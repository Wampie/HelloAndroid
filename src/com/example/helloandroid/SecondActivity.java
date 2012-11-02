package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
 
        TextView txtName = (TextView) findViewById(R.id.txtName);
        Button btnClose = (Button) findViewById(R.id.btnClose);
        
        Intent i = getIntent();
        
        txtName.setText("Hello there " + i.getStringExtra("name"));
        
        btnClose.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				finish();
				
			}
		});
	}

}
