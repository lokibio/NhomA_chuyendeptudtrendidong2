package teamA.travel;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class SupermarketActivity extends Activity {

	SieuthiAdapter adapter;
	ListView listViewsieuthi;
	private ArrayList<sieuthi> listData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.supermarket_layout);

		listViewsieuthi = (ListView) findViewById(R.id.listViewsieuthi);
		createData();
		adapter = new SieuthiAdapter(this, listData);
		listViewsieuthi.setAdapter(adapter);
		adapter.notifyDataSetChanged();
		listViewsieuthi.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				Intent i1 = new Intent(getApplicationContext(), chitiet.class);
				sieuthi st = (sieuthi) parent.getItemAtPosition(position);
				Bundle b = new Bundle();
				b.putSerializable("ct_st", st);
				i1.putExtras(b);
				startActivity(i1);
			}
		});

	}

	private void createData() {
		listData = new ArrayList<sieuthi>();
		listData.add(new sieuthi(
				0,
				"SiÃªu Thá»‹ BigC Miá»�n Ä�Ã´ng",
				"138A TÃ´ Hiáº¿n ThÃ nh, P.15, Q.10, TP.HCM ( NgÃ£ ba TÃ´ Hiáº¿n ThÃ nh - SÆ° Váº¡n Háº¡nh)",
				"02838632990",
				"cskh@bigc-vietnam.com",
				"http://www.bigc.vn/",
				"BÃ£i Ä‘áº­u xe: - Xe mÃ¡y: 2.000Ä‘/xe. - Xe Ä‘áº¡p: 1.000Ä‘/xe. - HoÃ n tiá»�n gá»­i xe 2.000Ä‘ cho KhÃ¡ch hÃ ng cÃ³ hÃ³a Ä‘Æ¡n tá»« 250.000Ä‘ trá»Ÿ lÃªn. Giao hÃ ng: Miá»…n phÃ­ giao hÃ ng trong pháº¡m vi 6km vá»›i hoÃ¡ Ä‘Æ¡n tá»« 200.000Ä‘ trá»Ÿ lÃªn"));
		listData.add(new sieuthi(
				1,
				"SiÃªu Thá»‹ BigC An Láº¡c",
				"Quáº­n 6, TP.HCM",
				"02838632990",
				"cskh@bigc-vietnam.com",
				"http://www.bigc.vn/",
				"BÃ£i Ä‘áº­u xe: - Xe mÃ¡y: 2.000Ä‘/xe. - Xe Ä‘áº¡p: 1.000Ä‘/xe. - HoÃ n tiá»�n gá»­i xe 2.000Ä‘ cho KhÃ¡ch hÃ ng cÃ³ hÃ³a Ä‘Æ¡n tá»« 1.000.000Ä‘ trá»Ÿ lÃªn. Giao hÃ ng: Miá»…n phÃ­ giao hÃ ng trong pháº¡m vi 6km vá»›i hoÃ¡ Ä‘Æ¡n tá»« 300.000Ä‘ trá»Ÿ lÃªn"));
		listData.add(new sieuthi(
				2,
				"Há»‡ thá»‘ng siÃªu thá»‹ Co.opmart",
				"Trá»¥ sá»Ÿ chÃ­nh táº¡i 199-205 Nguyá»…n ThÃ¡i Há»�c, PhÆ°á»�ng Pháº¡m NgÅ© LÃ£o, Quáº­n 1, Tp.HCM",
				"1900.5555.68",
				"chamsockhachhang@coopmart.vn",
				"http://www.co-opmart.com.vn/",
				"Khá»Ÿi nghiá»‡p tá»« nÄƒm 1989, sau Ä‘áº¡i há»™i Ä�áº£ng láº§n thá»© VI, ná»�n kinh táº¿ Ä‘áº¥t nÆ°á»›c chuyá»ƒn tá»« cÆ¡ cháº¿ bao cáº¥p sang ná»�n kinh táº¿ thá»‹ trÆ°á»�ng theo Ä‘á»‹nh hÆ°á»›ng XHCN, mÃ´ hÃ¬nh kinh táº¿ HTX kiá»ƒu cÅ© tháº­t sá»± khÃ³ khÄƒn vÃ  lÃ¢m vÃ o tÃ¬nh tháº¿ khá»§ng hoáº£ng pháº£i giáº£i thá»ƒ hÃ ng loáº¡t. Trong bá»‘i cáº£nh nhÆ° tháº¿, ngÃ y 12/5/1989 - UBND ThÃ nh phá»‘ Há»“ ChÃ­ Minh cÃ³ chá»§ trÆ°Æ¡ng chuyá»ƒn Ä‘á»•i Ban Quáº£n lÃ½ HTX Mua BÃ¡n ThÃ nh phá»‘ trá»Ÿ thÃ nh LiÃªn hiá»‡p HTX Mua bÃ¡n ThÃ nh phá»‘ Há»“ ChÃ­ Minh - Saigon Co.op vá»›i 2 chá»©c nÄƒng trá»±c tiáº¿p kinh doanh vÃ  tá»• chá»©c váº­n Ä‘á»™ng phong trÃ o HTX. Saigon Co.op lÃ  tá»• chá»©c kinh táº¿ HTX theo nguyÃªn táº¯c xÃ¡c láº­p sá»Ÿ há»¯u táº­p thá»ƒ, hoáº¡t Ä‘á»™ng sáº£n xuáº¥t kinh doanh tá»± chá»§ vÃ  tá»± chá»‹u trÃ¡ch nhiá»‡m.\n\nTá»« nÄƒm 1992 - 1997, cÃ¹ng vá»›i sá»± phÃ¡t triá»ƒn cá»§a ná»�n kinh táº¿ Ä‘áº¥t nÆ°á»›c, cÃ¡c nguá»“n vá»‘n Ä‘áº§u tÆ° nÆ°á»›c ngoÃ i vÃ o Viá»‡t Nam lÃ m cho cÃ¡c Doanh nghiá»‡p pháº£i nÄƒng Ä‘á»™ng vÃ  sÃ¡ng táº¡o Ä‘á»ƒ náº¯m báº¯t cÃ¡c cÆ¡ há»™i kinh doanh, há»�c há»�i kinh nghiá»‡m quáº£n lÃ½ tá»« cÃ¡c Ä‘á»‘i tÃ¡c nÆ°á»›c ngoÃ i. Saigon Co.op Ä‘Ã£ khá»Ÿi Ä‘áº§u báº±ng viá»‡c liÃªn doanh liÃªn káº¿t vá»›i cÃ¡c cÃ´ng ty nÆ°á»›c ngoÃ i Ä‘á»ƒ gia tÄƒng thÃªm nguá»“n lá»±c cho hÆ°á»›ng phÃ¡t triá»ƒn cá»§a mÃ¬nh. LÃ  má»™t trong sá»‘ Ã­t Ä‘Æ¡n vá»‹ cÃ³ giáº¥y phÃ©p XNK trá»±c tiáº¿p cá»§a ThÃ nh phá»‘, hoáº¡t Ä‘á»™ng XNK phÃ¡t triá»ƒn máº¡nh máº½ mang láº¡i hiá»‡u quáº£ cao, gÃ³p pháº§n xÃ¡c láº­p uy tÃ­n, vá»‹ tháº¿ cá»§a Saigon Co.op trÃªn thá»‹ trÆ°á»�ng trong vÃ  ngoÃ i nÆ°á»›c.\n\nSá»± kiá»‡n ná»•i báº­t nháº¥t lÃ  sá»± ra Ä‘á»�i siÃªu thá»‹ Ä‘áº§u tiÃªn cá»§a há»‡ thá»‘ng siÃªu thá»‹ Co.opmart lÃ  Co.opmart Cá»‘ng Quá»³nh vÃ o ngÃ y 09/02/1996, vá»›i sá»± giÃºp Ä‘á»¡ cá»§a cÃ¡c phong trÃ o HTX quá»‘c táº¿ Ä‘áº¿n tá»« Nháº­t, Singapore vÃ  Thá»¥y Ä�iá»ƒn. Tá»« Ä‘áº¥y loáº¡i hÃ¬nh kinh doanh bÃ¡n láº» má»›i, vÄƒn minh phÃ¹ há»£p vá»›i xu hÆ°á»›ng phÃ¡t triá»ƒn cá»§a ThÃ nh phá»‘ Há»“ ChÃ­ Minh Ä‘Ã¡nh dáº¥u cháº·ng Ä‘Æ°á»�ng má»›i cá»§a Saigon Co.op."));
	}

}
