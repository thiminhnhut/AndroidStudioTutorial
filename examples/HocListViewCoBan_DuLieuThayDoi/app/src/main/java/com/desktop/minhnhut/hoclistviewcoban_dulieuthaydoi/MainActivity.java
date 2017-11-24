package com.desktop.minhnhut.hoclistviewcoban_dulieuthaydoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrTen;
    ArrayAdapter<String> adapterTen;
    ListView lvTen;
    EditText txtTen;
    Button btnLuuDuLieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        txtTen = findViewById(R.id.txtTen);
        btnLuuDuLieu = findViewById(R.id.btnLuuDuLieu);
        lvTen = findViewById(R.id.lvTen);

        arrTen = new ArrayList<String>();
        adapterTen = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrTen);
        lvTen.setAdapter(adapterTen);
    }

    private void addEvents() {
        btnLuuDuLieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyLuuDuLieu();
            }
        });

        lvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Bạn chọn [" + arrTen.get(i) + "]", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void xuLyLuuDuLieu() {
        String ten = txtTen.getText().toString();
        arrTen.add(ten);
        adapterTen.notifyDataSetChanged();
        txtTen.setText("");
        txtTen.requestFocus();
    }
}
