package teamA.travel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class HospitalActivity extends Activity{
	
	ListView listView;
	String[] nameArray = { "Benh Vien 1", "Benh Vien 2", "Benh Vien 3",
			"Benh Vien 4", "Benh Vien 5", "Benh Vien 6" };

	String[] infoArray = { "Dia Chi Benh Vien 1", "Dia Chi Benh Vien 2",
			"Dia Chi Benh Vien 3", "Dia Chi Benh Vien 4",
			"Dia Chi Benh Vien 5", "Dia Chi Benh Vien 6" };

	Integer[] imageArray = { R.drawable.mot, R.drawable.hai, R.drawable.ba,
			R.drawable.bon, R.drawable.nam, R.drawable.sau };

	String[] detailinfoArray = { "Chi Tiet Benh Vien 1",
			"Chi Tiet Benh Vien 2", "Chi Tiet Benh Vien 3",
			"Chi Tiet Benh Vien 4", "Chi Tiet Benh Vien 5",
			"Chi Tiet Benh Vien 6" };

	String[] footerArray = { "Footer 1", "Footer 2", "Footer 3", "Footer 4",
			"Footer 5", "Footer 6" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hospital_layout);
		
		CustomListAdapter whatever = new CustomListAdapter(this, nameArray,
				infoArray, imageArray, detailinfoArray, footerArray);
		listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter(whatever);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HospitalActivity.this,
						DetailActivity.class);
				String textName = nameArray[position];
				intent.putExtra("ten_benhvien", textName);

				Integer imgDetail = imageArray[position];
				intent.putExtra("hinh_benhvien", imgDetail);

				String textDetail = detailinfoArray[position];
				intent.putExtra("mota_benhvien", textDetail);

				String textFooter = footerArray[position];
				intent.putExtra("lienhe_benhvien", textFooter);

				startActivity(intent);
			}

		});
	}
}
