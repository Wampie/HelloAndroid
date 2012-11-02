package com.example.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloActivity extends Activity {
	
	
	private TextView hello;
	private EditText text;
	private Button submit;
	
	private OnClickListener list;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        
        hello = (TextView)findViewById(R.id.hello);
        text = (EditText)findViewById(R.id.texter);
        submit = (Button)findViewById(R.id.submitButton);
        
        list = new OnClickListener() {
			
			public void onClick(View v) {
				
				Intent next = new Intent(getApplicationContext(), SecondActivity.class);
				next.putExtra("name", text.getText().toString());
				startActivity(next);
				
//				hello.setText("Hello " + text.getText().toString());
			}
		};
		
		submit.setOnClickListener(list);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hello, menu);
        return true;
    }
}
