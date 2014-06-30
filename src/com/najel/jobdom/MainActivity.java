package com.najel.jobdom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button titleBtnLeft,titleBtnRight,loginBtn,loginFaceBook;
	ImageView titleImage,mainImage;
	EditText editId,editPassword;
	CheckBox loginCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        init();

    }

	private void init() {
		ClickLister listener = new ClickLister();
		titleBtnLeft = (Button) findViewById(R.id.titleBtnLeft);
		titleBtnLeft.setOnClickListener(listener);
		
		titleBtnRight = (Button) findViewById(R.id.titleBtnRight);
		titleBtnRight.setOnClickListener(listener);
		
		loginBtn = (Button) findViewById(R.id.loginBtn);
		loginBtn.setOnClickListener(listener);
		
		loginFaceBook = (Button) findViewById(R.id.loginFaceBook);
		loginFaceBook.setOnClickListener(listener);
	}
	
	private class ClickLister implements View.OnClickListener{
		@Override
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.titleBtnLeft:
				Toast.makeText(getApplication(), "This is Menu Button", Toast.LENGTH_SHORT).show();
				break;
				
			case R.id.titleBtnRight:
				Toast.makeText(getApplication(), "This is Alarm Button", Toast.LENGTH_SHORT).show();
				break;
				
			case R.id.loginBtn : 
				Toast.makeText(getApplication(), "This is Login Button", Toast.LENGTH_SHORT).show();
				break;
				
			case R.id.loginFaceBook : 
				Toast.makeText(getApplication(), "This is FaceBook Login Button", Toast.LENGTH_SHORT).show();
				break;				
			}			
		}		
	}
	

    
    
    
    
}
