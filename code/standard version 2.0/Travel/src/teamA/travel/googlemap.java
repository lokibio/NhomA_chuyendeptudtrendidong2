package teamA.travel;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback;

import android.app.Activity;
import android.app.ProgressDialog;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

public class googlemap extends Activity {

	// Khai báo đối tượng Google Map
	GoogleMap map;

	// Khai báo Progress Bar dialog để làm màn hình chờ
	ProgressDialog myProgress;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.googlemap);

//		// Tạo Progress Bar
//		myProgress = new ProgressDialog(this);
//		myProgress.setTitle("Đang tải Map ...");
//		myProgress.setMessage("Vui lòng chờ...");
//		myProgress.setCancelable(true);
//
//		// Hiển thị Progress Bar
//		myProgress.show();
//
//		// Lấy đối tượng Google Map ra:
//		map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//
//		// thiết lập sự kiện đã tải Map thành công
//		map.setOnMapLoadedCallback(new OnMapLoadedCallback() {
//
//			@Override
//			public void onMapLoaded() {
//				// Đã tải thành công thì tắt Dialog Progress đi
//				myProgress.dismiss();
//			}
//		});
//
//		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//		map.getUiSettings().setZoomControlsEnabled(true);
//		map.setMyLocationEnabled(true);
//		
//		//Thêm dòng lệnh này
//		TuiDangODau();
	}

//	private void TuiDangODau() {
//
//		LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
//		Criteria criteria = new Criteria();
//
//		Location lastLocation = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));
//		if (lastLocation != null) {
//			map.animateCamera(CameraUpdateFactory
//					.newLatLngZoom(new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude()), 13));
//
//			CameraPosition cameraPosition = new CameraPosition.Builder()
//					.target(new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude())) // Sets the center of the map to location user
//					.zoom(15) // Sets the zoom
//					.bearing(90) // Sets the orientation of the camera to east
//					.tilt(40) // Sets the tilt of the camera to 30 degrees
//					.build(); // Creates a CameraPosition from the builder
//			map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
//			//BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET);
//		}
//	}

}
