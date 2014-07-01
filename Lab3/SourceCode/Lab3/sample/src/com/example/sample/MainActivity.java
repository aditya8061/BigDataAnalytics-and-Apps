package com.example.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends Activity {

	Button collect;
	Button stopCollect;
	Button create;
	Button insert;
	Button retrive;
	Button delete;
	String url;
	int counter=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		collect = (Button)findViewById(R.id.button1);
		stopCollect = (Button)findViewById(R.id.button2);
	    final Intent servicecall = new Intent(this,ConnectionService.class); 
		
		collect.setOnClickListener(new View.OnClickListener() {
			
			

			@Override
			public void onClick(View v) {
				
				startService(servicecall);
				//stopService(servicecall);
				counter++;
				
				
			}
		});
		
		stopCollect.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//stopService(servicecall);
				//unbindService(servicecall);
				//stopSelf(servicecall);				
				//ConnectionService.stop();
				
			}
		});
		
		
		
		create = (Button)findViewById(R.id.button3);
		create.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				url ="http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseCreate/testtable_aditya8061/GeoLocation:Date:Accelerometer";				
				WebView webview = new WebView(MainActivity.this);
				setContentView(webview);
				webview.loadUrl(url);
			}
		});
		
		insert = (Button)findViewById(R.id.button4);
		insert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseInsert/testtable_aditya8061/-home-cloudera-aditya8061.txt/GeoLocation:Date:Accelerometer";
				WebView webview = new WebView(MainActivity.this);
				setContentView(webview);
				webview.loadUrl(url);
			}
		});
		
		retrive = (Button)findViewById(R.id.button5);
		retrive.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				url ="http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/testtable_aditya8061";
				WebView webview = new WebView(MainActivity.this);
				setContentView(webview);
				webview.loadUrl(url);
			}
		});
		
		delete = (Button)findViewById(R.id.button6);
		delete.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbasedeletel/testtable_aditya8061";
				WebView webview = new WebView(MainActivity.this);
				setContentView(webview);
				webview.loadUrl(url);
			}
		});
		
		//startService(new Intent(this,ConnectionService.class));
		
		
		//stopService(new Intent(this,ConnectionService.class));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	

}
