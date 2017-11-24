package com.desktop.minhnhut.hoclistviewnangcao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.desktop.minhnhut.adapter.DanhBaAdapter;
import com.desktop.minhnhut.model.DanhBa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvDanhBa;
    ArrayList<DanhBa> dsDanhBa;
    DanhBaAdapter danhBaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        lvDanhBa = findViewById(R.id.lvDanhBa);
        dsDanhBa = new ArrayList<DanhBa>();
        dsDanhBa.add(new DanhBa(1, "Nguyen Van A", "123456789"));
        dsDanhBa.add(new DanhBa(2, "Nguyen Van B", "213456789"));
        danhBaAdapter = new DanhBaAdapter(MainActivity.this, R.layout.item, dsDanhBa);
        lvDanhBa.setAdapter(danhBaAdapter);

    }

    private void addEvents() {
    }
}
