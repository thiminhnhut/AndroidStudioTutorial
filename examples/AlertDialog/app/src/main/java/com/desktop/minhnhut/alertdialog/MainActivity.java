package com.desktop.minhnhut.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrMonHoc;
    ArrayAdapter<String> adapterMonHoc;
    ListView lvMonHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        lvMonHoc = findViewById(R.id.lvMonHoc);
        arrMonHoc = new ArrayList<String>();
        addMonHoc();
        adapterMonHoc = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrMonHoc);
        lvMonHoc.setAdapter(adapterMonHoc);
    }

    private void addMonHoc() {
        arrMonHoc.add("Android");
        arrMonHoc.add("iOS");
        arrMonHoc.add("PHP");
        arrMonHoc.add("NodeJS");
        arrMonHoc.add("Python");
        arrMonHoc.add("C/C++");
        arrMonHoc.add("Java");
    }

    private void xacNhanXoa(final int ma) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("Thông báo");
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("Bạn có muốn xóa môn học [" + arrMonHoc.get(ma) + "] không?");

        alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrMonHoc.remove(ma);
                adapterMonHoc.notifyDataSetChanged();
            }
        });

        alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }

    private void addEvents() {
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                xacNhanXoa(i);
            }
        });
    }
}
