package com.example.marcio.trocadetela;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Tela1Activity extends ActionBarActivity {

    Button btnTela1;
    Button btnTela2;

    View.OnClickListener btnTela1Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setContentView(R.layout.activity_tela1);

            btnTela2 = (Button) findViewById(R.id.btnTela2);
            btnTela2.setOnClickListener(btnTela2Click);

        }
    };

    View.OnClickListener btnTela2Click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setContentView(R.layout.activity_tela2);

            btnTela1 = (Button) findViewById(R.id.btnTela1);
            btnTela1.setOnClickListener(btnTela1Click);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        btnTela2 = (Button) findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(btnTela2Click);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tela1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
