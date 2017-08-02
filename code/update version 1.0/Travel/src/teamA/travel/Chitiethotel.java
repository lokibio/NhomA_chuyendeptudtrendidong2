package teamA.travel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Chitiethotel extends Activity {
	TextView textViewten, textViewdc, textViewsdt, textViewemail, textViewweb, textViewmota;
	ImageView imagesieuthi;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chitiet);
		
		textViewdc = (TextView) findViewById(R.id.textViewdc);
		textViewsdt = (TextView) findViewById(R.id.textViewsdt);
		textViewten = (TextView) findViewById(R.id.textViewten);
		textViewemail = (TextView) findViewById(R.id.textViewemail);
		textViewweb = (TextView) findViewById(R.id.textViewweb);
		textViewmota = (TextView) findViewById(R.id.textViewmota);
		imagesieuthi = (ImageView) findViewById(R.id.imagesieuthi);
		
		
		Bundle b = getIntent().getExtras();
		if(b != null) {
			Hotel st = (Hotel) b.getSerializable("ct_st");
			
			String ten = st.getName();
			textViewten = (TextView)findViewById(R.id.textViewten);
			textViewten.setText(ten);			
			
			String diachi = st.getDiachi();
			textViewdc = (TextView)findViewById(R.id.textViewdc);
			textViewdc.setText(diachi);
			
			String sdt = st.getSdt();
			textViewsdt = (TextView)findViewById(R.id.textViewsdt);
			textViewsdt.setText(sdt);
			
			String email = st.getEmail();
			textViewemail = (TextView)findViewById(R.id.textViewemail);
			textViewemail.setText(email);
			
			String web = st.getWeb();
			textViewweb = (TextView)findViewById(R.id.textViewweb);
			textViewweb.setText(web);
			
			String mota = st.getMota();
			textViewmota = (TextView)findViewById(R.id.textViewmota);
			textViewmota.setText(mota);
		}
	}
}