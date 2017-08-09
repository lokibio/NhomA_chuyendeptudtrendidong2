package teamA.travel;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.support.v4.widget.SlidingPaneLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

public class MainActivity extends TabActivity {

	private TabHost tabHost;
	private int currentTab = 2;
	private int lastTab = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TabHost tabHost = getTabHost();

		//
		TabSpec hotelSpec = tabHost.newTabSpec("Hotel");
		hotelSpec.setIndicator("",
				getResources().getDrawable(R.drawable.ic_hotel));
		Intent hotelIntent = new Intent(this, HotelActivity.class);
		hotelSpec.setContent(hotelIntent);

		TabSpec restaurantSpec = tabHost.newTabSpec("Restaurant");
		restaurantSpec.setIndicator("",
				getResources().getDrawable(R.drawable.ic_restaurant));
		Intent restaurantIntent = new Intent(this, RestaurantActivity.class);
		restaurantSpec.setContent(restaurantIntent);

		TabSpec informationSpec = tabHost.newTabSpec("Information");
		informationSpec.setIndicator("",
				getResources().getDrawable(R.drawable.ic_information));
		Intent informationIntent = new Intent(this, InformationActivity.class);
		informationSpec.setContent(informationIntent);

		TabSpec hospitalSpec = tabHost.newTabSpec("Hospital");
		hospitalSpec.setIndicator("",
				getResources().getDrawable(R.drawable.ic_hospital));
		Intent hospitalIntent = new Intent(this, HospitalActivity.class);
		hospitalSpec.setContent(hospitalIntent);

		TabSpec supermarketSpec = tabHost.newTabSpec("Supermarket");
		supermarketSpec.setIndicator("",
				getResources().getDrawable(R.drawable.ic_supermarket));
		Intent supermarketIntent = new Intent(this, SupermarketActivity.class);
		supermarketSpec.setContent(supermarketIntent);

		//
		tabHost.addTab(hotelSpec);
		tabHost.addTab(restaurantSpec);
		tabHost.addTab(informationSpec);
		tabHost.addTab(hospitalSpec);
		tabHost.addTab(supermarketSpec);
		
		//#35b587
		getTabHost().setOnTabChangedListener(new OnTabChangeListener() {
			public void onTabChanged(String tabId) {
				currentTab = getTabHost().getCurrentTab();

				setCurrentTabColor();

				lastTab = currentTab;
			}
		});

		getTabWidget().getChildAt(lastTab).setBackgroundColor(
				Color.rgb(145, 220, 90));

	}

	public void setCurrentTabColor() {
//		getTabWidget().getChildAt(currentTab).setBackgroundColor(
//				Color.rgb(53, 181, 135));
		getTabWidget().getChildAt(currentTab).setBackgroundColor(
				Color.rgb(145, 220, 90));
//		getTabWidget().getChildAt(lastTab).setBackgroundColor(
//				Color.parseColor("#91dc5a"));
		getTabWidget().getChildAt(lastTab).setBackgroundColor(
				Color.parseColor("#35b587"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
