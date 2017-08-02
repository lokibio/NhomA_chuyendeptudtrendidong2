package teamA.travel;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		String savetextView1 = getIntent().getStringExtra("ten_benhvien");
		TextView tv1 = (TextView) findViewById(R.id.textView1);
		tv1.setText(savetextView1);
		
		Integer saveImage1 = getIntent().getIntExtra("hinh_benhvien", 0);		
		ImageView img1 = (ImageView) findViewById(R.id.imageView1);		
		img1.setImageResource(saveImage1);
		
		String savetextView2 = getIntent().getStringExtra("mota_benhvien");		
		TextView tv2 = (TextView) findViewById(R.id.textView2);		
		tv2.setText(savetextView2);
		
		String savetextView3 = getIntent().getStringExtra("lienhe_benhvien");		
		TextView tv3 = (TextView) findViewById(R.id.textView3);		
		tv3.setText(savetextView3);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
