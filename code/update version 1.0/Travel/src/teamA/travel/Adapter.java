package teamA.travel;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
	ArrayList<Hotel> listData;
	LayoutInflater inflater;

	// Hàm tạo của custom
	public Adapter(Context context, ArrayList<Hotel> listData) {
		this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.listData = listData;
	}

	@Override
	public int getCount() {
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {	
				Hotel item = listData.get(position);		
				TextView txtten, txtdiachi;		
				if (convertView == null) {
					convertView = inflater.inflate(R.layout.activity_list_row, parent, false);
					}
				txtten = (TextView) convertView.findViewById(R.id.txtten);
				txtdiachi = (TextView) convertView.findViewById(R.id.txtdiachi);			
				txtten.setText(item.getName());
				txtdiachi.setText(item.getDiachi());
				return convertView;
	}
}
