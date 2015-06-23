package com.liangfeizc.flowlayout.sample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.support.v7.app.ActionBarActivity;
import com.liangfeizc.flowlayout.FlowLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addChildTo(((FlowLayout) findViewById(R.id.flow_layout)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private static final String[] BUTTON_TITLES = new String[] {
            "Acid Green", "Aero", "Aero Blue", "African Violet", "Air Force Blue (RAF)",
            "Bulgarian Rose", "Cyan Cornflower Blue", "Dark Terra Cotta", "Donkey Brown",
            "Fuchsia", "Fluorescent Yellow", "Flame", "Fandango", "Electric Yellow", "Eerie Black"
    };

    private void addChildTo(FlowLayout flowLayout) {
        for (int i = 0; i < BUTTON_TITLES.length; i++) {
            Button btn = new CheckableButton(this);
            btn.setTextColor(getResources().getColorStateList(R.color.checkable_text_color));
            btn.setBackgroundResource(R.drawable.checkable_background);
            btn.setText(BUTTON_TITLES[i]);
            flowLayout.addView(btn);
        }
    }
}
