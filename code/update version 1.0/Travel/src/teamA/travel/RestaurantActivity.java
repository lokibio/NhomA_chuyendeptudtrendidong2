package teamA.travel;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class RestaurantActivity extends Activity implements OnItemClickListener{

	ArrayList<Restaurant> mListRestaurant = new ArrayList<Restaurant>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurant_layout);
		
		doCreateFakeData();
		ListView listView = (ListView) findViewById(R.id.listView1);
		RestaurantAdapter adapter = new RestaurantAdapter(RestaurantActivity.this, R.layout.item_restaurant, mListRestaurant);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(RestaurantActivity.this);
	}
	
	public void doCreateFakeData() {

		// Nhà hàng 1
		Restaurant p1 = new Restaurant();
		p1.setName("Nhà hàng 1");
		p1.setAddress("Địa chỉ nhà hàng 1");
		p1.setLogo(R.drawable.mot);
		p1.setDetail(R.drawable.details);

		// Nhà hàng 2
		Restaurant p2 = new Restaurant();
		p2.setName("Nhà hàng 2");
		p2.setAddress("Địa chỉ nhà hàng 2");
		p2.setLogo(R.drawable.hai);
		p2.setDetail(R.drawable.details);

		// Nhà hàng 3
		Restaurant p3 = new Restaurant();
		p3.setName("Nhà hàng 3");
		p3.setAddress("Địa chỉ nhà hàng 3");
		p3.setLogo(R.drawable.ba);
		p3.setDetail(R.drawable.details);

		mListRestaurant.add(p1);
		mListRestaurant.add(p2);
		mListRestaurant.add(p3);
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch (arg2) {
		case 0:
			Toast.makeText(RestaurantActivity.this, "Nhà hàng 1 được chọn", Toast.LENGTH_LONG).show();
			break;
		case 1:
			Toast.makeText(RestaurantActivity.this, "Nhà hàng 2 được chọn", Toast.LENGTH_LONG).show();
			break;
		case 2:
			Toast.makeText(RestaurantActivity.this, "Nhà hàng 3 được chọn", Toast.LENGTH_LONG).show();
			break;
		default:
			Toast.makeText(RestaurantActivity.this, "Greater than 3 Option Clicked", Toast.LENGTH_LONG).show();
			break;
		}
	}
}
