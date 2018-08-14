package com.rahmahnajiyahimtihan.popup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    Button buttonPopup;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPopup = (Button) findViewById(R.id.button);
        txtHasil = (TextView) findViewById(R.id.textView);

        buttonPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
                popupMenu.setOnMenuItemClickListener(MainActivity.this);
                popupMenu.inflate(R.menu.menu_main);
                popupMenu.show();

            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.alpukat:
                txtHasil.setText("Alpukat");
                return true;
            case R.id.apel:
                txtHasil.setText("Apel");
                return true;
            case R.id.ceri:
                txtHasil.setText("Ceri");
                return true;
            case R.id.durian:
                txtHasil.setText("Durian");
                return true;
            case R.id.jambuair:
                txtHasil.setText("Jambu Air");
                return true;
            case R.id.manggis:
                txtHasil.setText("Manggis");
                return true;
            case R.id.strawberry:
                txtHasil.setText("Strawberry");
                return true;
        }
        return true;
    }
}
