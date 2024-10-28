
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		artisan_section
	 *	@date 		Monday 28th of October 2024 06:31:52 PM
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

public class artisan_section_activity extends Activity {

	
	private View _bg__artisan_section;
	private ImageView mapsicle_map;
	private ImageView vector;
	private View ellipse_2;
	private View ellipse_3;
	private View ellipse_1;
	private View rectangle_1;
	private TextView tracking;
	private View ellipse_4;
	private View ellipse_5;
	private View ellipse_6;
	private TextView mister_whisker;
	private TextView online;
	private TextView _0_2m;
	private TextView _1_2km;
	private TextView _0_2m_ek1;
	private TextView lauri_s_keys;
	private TextView offline___last_location;
	private TextView lauri;
	private TextView online_ek1;
	private View ellipse_7;
	private View line_1;
	private ImageView ___color;
	private ImageView __color;
	private View active_indicator_ek2;
	private ImageView ___color_ek1;
	private View border_bottom;
	private View rectangle_25;
	private ImageView vector_ek1;
	private View _rectangle_26;
	private ImageView vector_ek2;
	private View _rectangle_27;
	private ImageView union;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.artisan_section);

		
		_bg__artisan_section = (View) findViewById(R.id._bg__artisan_section);
		mapsicle_map = (ImageView) findViewById(R.id.mapsicle_map);
		vector = (ImageView) findViewById(R.id.vector);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		tracking = (TextView) findViewById(R.id.tracking);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		mister_whisker = (TextView) findViewById(R.id.mister_whisker);
		online = (TextView) findViewById(R.id.online);
		_0_2m = (TextView) findViewById(R.id._0_2m);
		_1_2km = (TextView) findViewById(R.id._1_2km);
		_0_2m_ek1 = (TextView) findViewById(R.id._0_2m_ek1);
		lauri_s_keys = (TextView) findViewById(R.id.lauri_s_keys);
		offline___last_location = (TextView) findViewById(R.id.offline___last_location);
		lauri = (TextView) findViewById(R.id.lauri);
		online_ek1 = (TextView) findViewById(R.id.online_ek1);
		ellipse_7 = (View) findViewById(R.id.ellipse_7);
		line_1 = (View) findViewById(R.id.line_1);
		___color = (ImageView) findViewById(R.id.___color);
		__color = (ImageView) findViewById(R.id.__color);
		active_indicator_ek2 = (View) findViewById(R.id.active_indicator_ek2);
		___color_ek1 = (ImageView) findViewById(R.id.___color_ek1);
		border_bottom = (View) findViewById(R.id.border_bottom);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		_rectangle_26 = (View) findViewById(R.id._rectangle_26);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		_rectangle_27 = (View) findViewById(R.id._rectangle_27);
		union = (ImageView) findViewById(R.id.union);
	
		
		_rectangle_26.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), marketplace_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_27.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), artisan_section_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	