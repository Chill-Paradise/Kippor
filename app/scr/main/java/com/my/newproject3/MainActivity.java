package com.my.newproject3;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.*;
import de.hdodenhof.circleimageview.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll2;
	private LinearLayout linear3;
	private MaterialButton materialbutton2;
	private TextView textview1;
	private EditText edittext1;
	private AutoCompleteTextView autocomplete1;
	private MultiAutoCompleteTextView multiautocomplete1;
	private Button button1;
	private LinearLayout linear4;
	private ImageView imageview1;
	private CircleImageView circleimageview1;
	private CheckBox checkbox1;
	private RadioButton radiobutton1;
	private Switch switch1;
	private SeekBar seekbar1;
	private ProgressBar progressbar1;
	private ProgressBar progressbar2;
	private RatingBar ratingbar1;
	private SearchView searchview1;
	private AnalogClock analogclock1;
	private DigitalClock digitalclock1;
	private CalendarView calendarview1;
	private DatePicker datepicker1;
	private TimePicker timepicker1;
	private MaterialButton materialbutton3;
	private MaterialButton materialbutton4;
	
	private Intent Inten = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		vscroll2 = findViewById(R.id.vscroll2);
		linear3 = findViewById(R.id.linear3);
		materialbutton2 = findViewById(R.id.materialbutton2);
		textview1 = findViewById(R.id.textview1);
		edittext1 = findViewById(R.id.edittext1);
		autocomplete1 = findViewById(R.id.autocomplete1);
		multiautocomplete1 = findViewById(R.id.multiautocomplete1);
		button1 = findViewById(R.id.button1);
		linear4 = findViewById(R.id.linear4);
		imageview1 = findViewById(R.id.imageview1);
		circleimageview1 = findViewById(R.id.circleimageview1);
		checkbox1 = findViewById(R.id.checkbox1);
		radiobutton1 = findViewById(R.id.radiobutton1);
		switch1 = findViewById(R.id.switch1);
		seekbar1 = findViewById(R.id.seekbar1);
		progressbar1 = findViewById(R.id.progressbar1);
		progressbar2 = findViewById(R.id.progressbar2);
		ratingbar1 = findViewById(R.id.ratingbar1);
		searchview1 = findViewById(R.id.searchview1);
		analogclock1 = findViewById(R.id.analogclock1);
		digitalclock1 = findViewById(R.id.digitalclock1);
		calendarview1 = findViewById(R.id.calendarview1);
		datepicker1 = findViewById(R.id.datepicker1);
		timepicker1 = findViewById(R.id.timepicker1);
		materialbutton3 = findViewById(R.id.materialbutton3);
		materialbutton4 = findViewById(R.id.materialbutton4);
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton2.startAnimation(fade_in);
				Inten.setClass(getApplicationContext(), ExamplesActivity.class);
				startActivity(Inten);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		materialbutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton3.startAnimation(fade_in);
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}