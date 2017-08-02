/**
 * 
 */
package teamA.travel;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<Object> {

	
	private final Activity context;	
	private final Integer[] imageIDarray;	
	private final String[] nameArray;	
	private final String[] infoArray;
	private final String[] detailinfoArray;
	private final String[] footerArray;

	public CustomListAdapter(Activity context, String[] nameArrayParam,
			String[] infoArrayParam, Integer[] imageIDArrayParam, String[] detailinfoArray, String[] footerArray) {

		super(context, R.layout.listview_row, nameArrayParam);

		this.context = context;
		this.imageIDarray = imageIDArrayParam;
		this.nameArray = nameArrayParam;
		this.infoArray = infoArrayParam;
		this.detailinfoArray = detailinfoArray; // khai bao mang cho layout chi tiet
		this.footerArray = footerArray;
	}

	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.listview_row, null, true);

		// this code gets references to objects in the listview_row.xml file
		TextView nameTextField = (TextView) rowView
				.findViewById(R.id.nameTextViewID);
		TextView infoTextField = (TextView) rowView
				.findViewById(R.id.infoTextViewID);
		ImageView imageView = (ImageView) rowView
				.findViewById(R.id.imageView1ID);

		// this code sets the values of the objects to values from the arrays
		nameTextField.setText(nameArray[position]);
		infoTextField.setText(infoArray[position]);
		imageView.setImageResource(imageIDarray[position]);

		return rowView;

	}

	public String[] getDetailinfoArray() {
		return detailinfoArray;
	}

	public String[] getFooterArray() {
		return footerArray;
	};

}
