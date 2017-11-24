package com.desktop.minhnhut.dialogcustom;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn;
    EditText txtUser, txtPassword;
    Button btnDongY, btnKhongDongY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {
        btnSignIn = findViewById(R.id.btnSignIn);
    }

    private void addEvents() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogSignIn();
            }
        });
    }

    private void DialogSignIn() {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_custom);
        dialog.setCanceledOnTouchOutside(false);

        addControls_Dialog(dialog);
        addEvents_Dialog(dialog);

        dialog.show();
    }

    private void addControls_Dialog(Dialog dialog) {
        txtUser = dialog.findViewById(R.id.txtUser);
        txtPassword = dialog.findViewById(R.id.txtPassword);
        btnDongY = dialog.findViewById(R.id.btnDongY);
        btnKhongDongY = dialog.findViewById(R.id.btnKhongDongY);
    }

    private void addEvents_Dialog(final Dialog dialog) {
        btnDongY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUser.getText().toString().trim();
                String password = txtPassword.getText().toString().trim();

                if (username.equals("thiminhnhut") && password.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnKhongDongY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }


}
