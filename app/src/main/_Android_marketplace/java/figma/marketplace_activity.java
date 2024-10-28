
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		marketplace
	 *	@date 		Monday 28th of October 2024 06:31:34 PM
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

public class marketplace_activity extends Activity {

	
	private View _bg__marketplace;
	private View ellipse_;
	private ImageView image_34;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private View ellipse__ek1;
	private ImageView icon_ek1;
	private TextView home_ek1;
	private ImageView icon_ek3;
	private ImageView icon_ek5;
	private ImageView icon_ek7;
	private View rectangle_91;
	private View home_indicator;
	private TextView provide_the_best_food_for_you;
	private TextView find_by_category;
	private TextView see_all;
	private ImageView rectangle_961;
	private TextView burger_ek1;
	private ImageView image_22;
	private TextView taco_ek1;
	private ImageView image_23;
	private TextView drink_ek1;
	private ImageView image_24;
	private TextView pizza_ek1;
	private ImageView image_ek1;
	private TextView ordinary_burgers;
	private ImageView star_6;
	private TextView _4_9;
	private ImageView icon_ek9;
	private TextView _190m;
	private TextView sda_;
	private ImageView icon_ek11;
	private ImageView ___color;
	private View active_indicator_ek1;
	private ImageView __color;
	private ImageView ___color_ek1;
	private View border_bottom;
	private View rectangle_25;
	private ImageView vector_ek4;
	private View rectangle_26;
	private ImageView vector_ek5;
	private View _rectangle_27;
	private ImageView union;
	private TextView points_exchange;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.marketplace);

		
		_bg__marketplace = (View) findViewById(R.id._bg__marketplace);
		ellipse_ = (View) findViewById(R.id.ellipse_);
		image_34 = (ImageView) findViewById(R.id.image_34);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		ellipse__ek1 = (View) findViewById(R.id.ellipse__ek1);
		icon_ek1 = (ImageView) findViewById(R.id.icon_ek1);
		home_ek1 = (TextView) findViewById(R.id.home_ek1);
		icon_ek3 = (ImageView) findViewById(R.id.icon_ek3);
		icon_ek5 = (ImageView) findViewById(R.id.icon_ek5);
		icon_ek7 = (ImageView) findViewById(R.id.icon_ek7);
		rectangle_91 = (View) findViewById(R.id.rectangle_91);
		home_indicator = (View) findViewById(R.id.home_indicator);
		provide_the_best_food_for_you = (TextView) findViewById(R.id.provide_the_best_food_for_you);
		find_by_category = (TextView) findViewById(R.id.find_by_category);
		see_all = (TextView) findViewById(R.id.see_all);
		rectangle_961 = (ImageView) findViewById(R.id.rectangle_961);
		burger_ek1 = (TextView) findViewById(R.id.burger_ek1);
		image_22 = (ImageView) findViewById(R.id.image_22);
		taco_ek1 = (TextView) findViewById(R.id.taco_ek1);
		image_23 = (ImageView) findViewById(R.id.image_23);
		drink_ek1 = (TextView) findViewById(R.id.drink_ek1);
		image_24 = (ImageView) findViewById(R.id.image_24);
		pizza_ek1 = (TextView) findViewById(R.id.pizza_ek1);
		image_ek1 = (ImageView) findViewById(R.id.image_ek1);
		ordinary_burgers = (TextView) findViewById(R.id.ordinary_burgers);
		star_6 = (ImageView) findViewById(R.id.star_6);
		_4_9 = (TextView) findViewById(R.id._4_9);
		icon_ek9 = (ImageView) findViewById(R.id.icon_ek9);
		_190m = (TextView) findViewById(R.id._190m);
		sda_ = (TextView) findViewById(R.id.sda_);
		icon_ek11 = (ImageView) findViewById(R.id.icon_ek11);
		___color = (ImageView) findViewById(R.id.___color);
		active_indicator_ek1 = (View) findViewById(R.id.active_indicator_ek1);
		__color = (ImageView) findViewById(R.id.__color);
		___color_ek1 = (ImageView) findViewById(R.id.___color_ek1);
		border_bottom = (View) findViewById(R.id.border_bottom);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		_rectangle_27 = (View) findViewById(R.id._rectangle_27);
		union = (ImageView) findViewById(R.id.union);
		points_exchange = (TextView) findViewById(R.id.points_exchange);
	
		
		_rectangle_27.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), artisan_section_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	