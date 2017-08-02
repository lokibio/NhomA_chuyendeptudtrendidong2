package teamA.travel;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SingleItemView extends Activity {
	// Declare Variables
	TextView txtrank;
	TextView txtcountry;
	TextView txtpopulation;
	TextView txtpopulationtext;
	ImageView imgflag;
	String rank;
	String country;
	String population;
	String populationtext;
	int flag;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singleitemview);
		// Get the intent from ListViewAdapter
		Intent i = getIntent();
		// Get the results of rank
		rank = i.getStringExtra("rank");
		// Get the results of country
		country = i.getStringExtra("country");
		// Get the results of population
		population = i.getStringExtra("population");
		
		populationtext = i.getStringExtra("populationtext");
		// Get the results of flag
		flag = i.getIntExtra("flag", flag);
 
		// Locate the TextViews in singleitemview.xml
		txtrank = (TextView) findViewById(R.id.rank);
		txtcountry = (TextView) findViewById(R.id.country);
		txtpopulation = (TextView) findViewById(R.id.population);
		txtpopulationtext = (TextView) findViewById(R.id.populationtext);
 
		// Locate the ImageView in singleitemview.xml
		imgflag = (ImageView) findViewById(R.id.flag);
 
		// Load the results into the TextViews
		txtrank.setText(rank);
		txtcountry.setText(country);
		txtpopulation.setText(population);
		txtpopulationtext.setText(populationtext);
 
		// Load the image into the ImageView
		imgflag.setImageResource(flag);
	}
}