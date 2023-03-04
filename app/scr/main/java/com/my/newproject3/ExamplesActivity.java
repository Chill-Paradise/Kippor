package com.my.newproject3;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
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
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class ExamplesActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private ScrollView vscroll2;
	private LinearLayout linear3;
	private MaterialButton materialbutton1;
	private MaterialButton materialbutton2;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private MaterialButton materialbutton6;
	private MaterialButton materialbutton7;
	private MaterialButton materialbutton3;
	private TextView textview1;
	private MaterialButton materialbutton4;
	private MaterialButton materialbutton5;
	
	private AlertDialog.Builder Modal;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.examples);
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
		materialbutton1 = findViewById(R.id.materialbutton1);
		materialbutton2 = findViewById(R.id.materialbutton2);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		materialbutton6 = findViewById(R.id.materialbutton6);
		materialbutton7 = findViewById(R.id.materialbutton7);
		materialbutton3 = findViewById(R.id.materialbutton3);
		textview1 = findViewById(R.id.textview1);
		materialbutton4 = findViewById(R.id.materialbutton4);
		materialbutton5 = findViewById(R.id.materialbutton5);
		Modal = new AlertDialog.Builder(this);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton1.startAnimation(fade_in);
				Modal.setTitle("Title");
				Modal.setMessage("Message");
				Modal.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Modal.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Modal.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Modal.create().show();
			}
		});
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton2.startAnimation(fade_in);
				SketchwareUtil.showMessage(getApplicationContext(), "Example toast");
			}
		});
		
		materialbutton6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton6.startAnimation(fade_in);
				finish();
			}
		});
		
		materialbutton7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton7.startAnimation(fade_in);
				finishAffinity();
			}
		});
		
		materialbutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton3.startAnimation(fade_in);
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", "Hello world"));
				SketchwareUtil.showMessage(getApplicationContext(), "Copied to clipboard");
			}
		});
		
		materialbutton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton4.startAnimation(fade_in);
				SketchwareUtil.showKeyboard(getApplicationContext());
			}
		});
		
		materialbutton5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ScaleAnimation fade_in = new ScaleAnimation(0.9f, 1f, 0.9f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.7f);
				fade_in.setDuration(300);
				fade_in.setFillAfter(true);
				materialbutton5.startAnimation(fade_in);
				SketchwareUtil.hideKeyboard(getApplicationContext());
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Examples");
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