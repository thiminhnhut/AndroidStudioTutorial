package com.desktop.minhnhut.hoctabhostjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtA, txtB;
    Button btnCong;
    TabHost tabHost;

    ArrayList<String> dsCong;
    ArrayAdapter<String> adapterCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        tabHost = findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("t1");
        tab1.setContent(R.id.tab1);
        tab1.setIndicator("1. Phép cộng");
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("t2");
        tab2.setContent(R.id.tab2);
        tab2.setIndicator("2. Lịch sử");
        tabHost.addTab(tab2);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);

        btnCong = findViewById(R.id.btnCong);

        ListView lvLichSu = findViewById(R.id.lvLichSu);
        dsCong = new ArrayList<String>();
        adapterCong = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,dsCong);
        lvLichSu.setAdapter(adapterCong);

    }

    private void addEvents() {
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xulyPhepCong();
            }
        });
    }

    private void xulyPhepCong() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a + b;
        dsCong.add(a + "+" + b + "=" + c);
        adapterCong.notifyDataSetChanged();
        txtA.setText("");
        txtB.setText("");
    }
}
