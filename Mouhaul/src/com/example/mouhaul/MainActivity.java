package com.example.mouhaul;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText cant = (EditText) findViewById(R.id.inpCant);
        final EditText inch = (EditText) findViewById(R.id.inpInche);
        
        final Button button = (Button) findViewById(R.id.bConvert);
        
        
        
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					double cante = Double.valueOf(cant.getText().toString());
					double inches = cante * 0.393701;
					inch.setText(String.valueOf(inches));
				}
				catch(Exception e){
					System.out.print("you can't do that!");
				}

			}
		});
        
        final Button buttonI = (Button) findViewById(R.id.bConvertI);
        
        buttonI.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					double inches = Double.valueOf(inch.getText().toString());
					double cante = inches * 2.54;
					cant.setText(String.valueOf(cante));	
				
				}
				catch(Exception e){
					System.out.print("you can't do that!");
					
				}
			}});
    
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
}
