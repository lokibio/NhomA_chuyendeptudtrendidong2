/**
 * 
 */
package teamA.travel;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Administrator
 *
 */
public class RestaurantAdapter extends ArrayAdapter<Restaurant>{
	
	Context mContext;
	ArrayList<Restaurant> mListAdapter = new ArrayList<Restaurant>();

	public RestaurantAdapter(Context context, int resource, List<Restaurant> objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
		
		this.mContext = context;
		this.mListAdapter = new ArrayList<Restaurant>(objects);
	}
	
	@Override
	public Restaurant getItem(int position) {
		return mListAdapter.get(position);
	}
	
	@Override
	public long getItemId(int position) {
		return position;
	}
	
	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View rowView = convertView;
		ViewHolder viewHolder;
		if(rowView == null){
			LayoutInflater inflate = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflate.inflate(R.layout.item_restaurant, null);
			viewHolder = new ViewHolder();
			viewHolder.txtName = (TextView) rowView.findViewById(R.id.txtName);
			viewHolder.txtAddress = (TextView) rowView.findViewById(R.id.txtAddress);
			viewHolder.imgLogo = (ImageView) rowView.findViewById(R.id.imgLogo);
			viewHolder.imgDetail = (ImageView) rowView.findViewById(R.id.imgDetail);
			rowView.setTag(viewHolder);
		}
		else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		Restaurant restaurant = mListAdapter.get(position);
		viewHolder.txtName.setText(restaurant.getName());
		viewHolder.txtAddress.setText(restaurant.getAddress());
		viewHolder.imgLogo.setImageResource(restaurant.getLogo());
		viewHolder.imgDetail.setImageResource(restaurant.getDetail());
		
	rowView.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(mContext, SingleItemView.class);
			// Pass all data rank
			intent.putExtra("name",(mListAdapter.get(position).getName()));
			// Pass all data country
			intent.putExtra("Address",(mListAdapter.get(position).getAddress()));
			// Pass all data population
			intent.putExtra("Detail",(mListAdapter.get(position).getDetail()));
			
			intent.putExtra("flag",(mListAdapter.get(position).getLogo()));
			// Pass all data flag
			// Start SingleItemView Class
			mContext.startActivity(intent);
			
		}
	});
		return rowView;		
		
	}
	
	

	static class ViewHolder{
		TextView txtName;
		TextView txtAddress;
		ImageView imgLogo;
		ImageView imgDetail;
	}

}
