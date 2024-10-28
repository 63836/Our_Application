
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		points_earned
	 *	@date 		Monday 28th of October 2024 06:31:16 PM
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

public class points_earned_activity extends Activity {

	
	private View _bg__points_earned;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private TextView welcome_back_leo_;
	private TextView __226_90;
	private View rectangle_16;
	private TextView s;
	private TextView t;
	private TextView t_ek1;
	private TextView m;
	private TextView w;
	private TextView f;
	private TextView s_ek1;
	private View rectangle_17;
	private View rectangle_20;
	private View rectangle_22;
	private View rectangle_19;
	private View rectangle_23;
	private View rectangle_21;
	private View rectangle_24;
	private View rectangle_18;
	private TextView month;
	private ImageView vector_2;
	private TextView total_points_earned;
	private TextView _472_55;
	private TextView trash_deposited;
	private View ellipse_5;
	private TextView points_balance;
	private ImageView vector_ek4;
	private View active_indicator;
	private ImageView ___color;
	private ImageView __color;
	private ImageView ___color_ek1;
	private View border_bottom;
	private View rectangle_25;
	private ImageView vector_ek5;
	private View rectangle_26;
	private ImageView vector_ek6;
	private View _rectangle_27;
	private ImageView union;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.points_earned);

		
		_bg__points_earned = (View) findViewById(R.id._bg__points_earned);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		welcome_back_leo_ = (TextView) findViewById(R.id.welcome_back_leo_);
		__226_90 = (TextView) findViewById(R.id.__226_90);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		s = (TextView) findViewById(R.id.s);
		t = (TextView) findViewById(R.id.t);
		t_ek1 = (TextView) findViewById(R.id.t_ek1);
		m = (TextView) findViewById(R.id.m);
		w = (TextView) findViewById(R.id.w);
		f = (TextView) findViewById(R.id.f);
		s_ek1 = (TextView) findViewById(R.id.s_ek1);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		rectangle_22 = (View) findViewById(R.id.rectangle_22);
		rectangle_19 = (View) findViewById(R.id.rectangle_19);
		rectangle_23 = (View) findViewById(R.id.rectangle_23);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		rectangle_18 = (View) findViewById(R.id.rectangle_18);
		month = (TextView) findViewById(R.id.month);
		vector_2 = (ImageView) findViewById(R.id.vector_2);
		total_points_earned = (TextView) findViewById(R.id.total_points_earned);
		_472_55 = (TextView) findViewById(R.id._472_55);
		trash_deposited = (TextView) findViewById(R.id.trash_deposited);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		points_balance = (TextView) findViewById(R.id.points_balance);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		active_indicator = (View) findViewById(R.id.active_indicator);
		___color = (ImageView) findViewById(R.id.___color);
		__color = (ImageView) findViewById(R.id.__color);
		___color_ek1 = (ImageView) findViewById(R.id.___color_ek1);
		border_bottom = (View) findViewById(R.id.border_bottom);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		_rectangle_27 = (View) findViewById(R.id._rectangle_27);
		union = (ImageView) findViewById(R.id.union);
	
		
		_rectangle_27.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), artisan_section_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	