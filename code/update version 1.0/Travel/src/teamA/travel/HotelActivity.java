package teamA.travel;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class HotelActivity extends Activity {

	Adapter adapter;
	ListView listViewsieuthi;
	private ArrayList<Hotel> listData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotel_layout);

		// TextView tv=new TextView(this);
		// tv.setTextSize(25);
		// tv.setGravity(Gravity.CENTER_VERTICAL);
		// tv.setText(“This Is Tab3 Activity”);
		//
		// setContentView(tv);

		listViewsieuthi = (ListView) findViewById(R.id.listViewsieuthi);
		createData();
		adapter = new Adapter(this, listData);
		listViewsieuthi.setAdapter(adapter);
		adapter.notifyDataSetChanged();
		listViewsieuthi.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent i1 = new Intent(getApplicationContext(),
						Chitiethotel.class);
				Hotel st = (Hotel) parent.getItemAtPosition(position);
				Bundle b = new Bundle();
				b.putSerializable("ct_st", st);
				i1.putExtras(b);
				startActivity(i1);
			}
		});
	}

	private void createData() {
		listData = new ArrayList<Hotel>();
		listData.add(new Hotel(
				0,
				"Khách Sạn Long Xuyên",
				"19-Nguyễn Văn Cư-Mỹ Long-An Giang",
				"076.3841927 - 3941427 - 911927",
				"longxuyenhotel@hcm.vnn.vn",
				"http://www.longxuyenhotel.com",
				"30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. 30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. "));
		listData.add(new Hotel(
				1,
				"Khách Sạn Long Xuyên",
				"19-Nguyễn Văn Cư-Mỹ Long-An Giang",
				"076.3841927 - 3941427 - 911927",
				"longxuyenhotel@hcm.vnn.vn",
				"http://www.longxuyenhotel.com",
				"30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. 30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. "));
		listData.add(new Hotel(
				2,
				"Khách Sạn Long Xuyên",
				"19-Nguyễn Văn Cư-Mỹ Long-An Giang",
				"076.3841927 - 3941427 - 911927",
				"longxuyenhotel@hcm.vnn.vn",
				"http://www.longxuyenhotel.com",
				"30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. 30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. "));
		listData.add(new Hotel(
				3,
				"Khách Sạn Long Xuyên",
				"19-Nguyễn Văn Cư-Mỹ Long-An Giang",
				"076.3841927 - 3941427 - 911927",
				"longxuyenhotel@hcm.vnn.vn",
				"http://www.longxuyenhotel.com",
				"30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. 30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. "));
		listData.add(new Hotel(
				4,
				"Khách Sạn Long Xuyên",
				"19-Nguyễn Văn Cư-Mỹ Long-An Giang",
				"076.3841927 - 3941427 - 911927",
				"longxuyenhotel@hcm.vnn.vn",
				"http://www.longxuyenhotel.com",
				"30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. 30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. "));
		listData.add(new Hotel(
				5,
				"Khách Sạn Long Xuyên",
				"19-Nguyễn Văn Cư-Mỹ Long-An Giang",
				"076.3841927 - 3941427 - 911927",
				"longxuyenhotel@hcm.vnn.vn",
				"http://www.longxuyenhotel.com",
				"30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. 30 Phòng tiêu chuẩn 5 sao, trang thiết bị trong phòng: máy điều hòa, mini bar, tivi cable, nước nóng, bồn tắm, điện thoại IDD, Wifi ... Khách sạn tọa lạc ngay trung tâm thành phố Long Xuyên, đối diện siêu thị Coop Mart, gần Long Xuyên rất thuận tiện cho việc mua sắm, tham quan. "));
	}
}
