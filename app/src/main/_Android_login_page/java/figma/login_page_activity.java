
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login_page
	 *	@date 		Monday 28th of October 2024 06:29:49 PM
	 *	@title 		Page 1 (Screens)
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class login_page_activity extends Activity {

	
	private View _bg__login_page;
	private ImageView rectangle_2;
	private ImageView rectangle_10;
	private View rectangle_7;
	private View rectangle_8;
	private View rectangle_9;
	private TextView login;
	private View line_1;
	private View line_3;
	private ImageView vector;
	private TextView email;
	private ImageView vector_ek1;
	private TextView password;
	private View _rectangle_11;
	private View rectangle_12;
	private TextView remember_me;
	private TextView forgot_password_;
	private ImageView vector_ek2;
	private TextView login_ek1;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private TextView _don_t_have_an_account___sign_up;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);

		
		_bg__login_page = (View) findViewById(R.id._bg__login_page);
		rectangle_2 = (ImageView) findViewById(R.id.rectangle_2);
		rectangle_10 = (ImageView) findViewById(R.id.rectangle_10);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		rectangle_9 = (View) findViewById(R.id.rectangle_9);
		login = (TextView) findViewById(R.id.login);
		line_1 = (View) findViewById(R.id.line_1);
		line_3 = (View) findViewById(R.id.line_3);
		vector = (ImageView) findViewById(R.id.vector);
		email = (TextView) findViewById(R.id.email);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		password = (TextView) findViewById(R.id.password);
		_rectangle_11 = (View) findViewById(R.id._rectangle_11);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		remember_me = (TextView) findViewById(R.id.remember_me);
		forgot_password_ = (TextView) findViewById(R.id.forgot_password_);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		login_ek1 = (TextView) findViewById(R.id.login_ek1);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		_don_t_have_an_account___sign_up = (TextView) findViewById(R.id._don_t_have_an_account___sign_up);
	
		
		_rectangle_11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), points_earned_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_don_t_have_an_account___sign_up.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_2_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	