package com.desktop.minhnhut.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.desktop.minhnhut.hoclistviewnangcao.MainActivity;
import com.desktop.minhnhut.hoclistviewnangcao.R;
import com.desktop.minhnhut.model.DanhBa;

import java.util.List;

/**
 * Created by minhnhut on 11/23/17.
 */

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
    Activity context;
    int resource;
    List<DanhBa> objects;
    public DanhBaAdapter(@Nullable Activity context, int resource, @Nullable List<DanhBa> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource, null);
        TextView txtTen = row.findViewById(R.id.txtTen);
        TextView txtPhone = row.findViewById(R.id.txtPhone);

        ImageButton btnCall = row.findViewById(R.id.btnCall);
        ImageButton btnSms = row.findViewById(R.id.btnSms);
        ImageButton btnInfo = row.findViewById(R.id.btnInfo);

        final DanhBa danhBa = this.objects.get(position);
        txtTen.setText(danhBa.getTen());
        txtPhone.setText(danhBa.getPhone());

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyInfo(danhBa);
            }
        });

        return row;
    }

    private void xuLyInfo(DanhBa danhBa) {
        Toast.makeText(this.context, "Ban chon: " + danhBa.getTen(), Toast.LENGTH_SHORT).show();
    }
}
