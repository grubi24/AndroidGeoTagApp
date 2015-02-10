package hr.pmf.math.android.geotagging;

import hr.pmf.math.android.geotagging.dao.DAO;
import hr.pmf.math.android.geotagging.dao.DAOProvider;
import android.R;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class AddActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
	
	public void addImageClick(View view){
		
		
	}
	
	public void okButtonClick(View view){
		DAO dao = DAOProvider.getDAO(this);
		EditText t ;
		EditText d ;
		dao.addEntry(t.getText(), d.getText(), path);
		this.finish();
	}
	
	public void cancelButtonClick(View view){
		this.finish();
		
	}
}
