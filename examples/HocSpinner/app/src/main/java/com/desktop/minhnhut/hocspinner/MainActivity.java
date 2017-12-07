package com.desktop.minhnhut.hocspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.desktop.minhnhut.model.NhanVien;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtTen, txtSoNgayCongTac;
    Spinner spThu;
    Button btnXacNhan;

    ArrayList<String> dsThu;
    ArrayAdapter<String> adapterThu;

    int lastSelected = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        txtTen = findViewById(R.id.txtTen);
        txtSoNgayCongTac = findViewById(R.id.txtSoNgayCongTac);

        btnXacNhan = findViewById(R.id.btnXacNhan);

        spThu = findViewById(R.id.spThu);
        dsThu = new ArrayList<>();
        dsThu.add("Thứ 2");
        dsThu.add("Thứ 3");
        dsThu.add("Thứ 4");
        dsThu.add("Thứ 5");
        dsThu.add("Thứ 6");
        dsThu.add("Thứ 7");
        dsThu.add("Chủ nhật");

        adapterThu = new ArrayAdapter<String>(
                    MainActivity.this,
                    android.R.layout.simple_spinner_item,
                    dsThu);
        adapterThu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spThu.setAdapter(adapterThu);
    }

    private void addEvents() {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXacNhanCongTac();
            }
        });

        spThu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Bạn chọn " + dsThu.get(i), Toast.LENGTH_LONG).show();
                lastSelected = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void xuLyXacNhanCongTac() {
        if (lastSelected == -1) {
            Toast.makeText(MainActivity.this, "Chua chon", Toast.LENGTH_LONG).show();
        } else {
            NhanVien nv = new NhanVien();
            nv.setTenNhanVien(txtTen.getText().toString());
            nv.setThuBatDauCongTac(dsThu.get(lastSelected));
            nv.setSoNgayCongTacDuKien(Integer.parseInt(txtSoNgayCongTac.getText().toString()));

            Toast.makeText(MainActivity.this, nv.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
