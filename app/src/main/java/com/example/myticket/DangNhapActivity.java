package com.example.myticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhapActivity extends AppCompatActivity {
    Button btnDangKyDN, btnDangNhapDN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_dangnhap);


        btnDangKyDN = (Button) findViewById (R.id.btnDangKyDN);
        btnDangNhapDN = (Button) findViewById (R.id.btnDangNhapDN);


       btnDangKyDN.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (DangNhapActivity.this, DangKyActivity.class);
                startActivity (intent);
            }
        });

       btnDangNhapDN.setOnClickListener (new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent ( DangNhapActivity.this, TimKiemActivity.class);
               startActivity (intent);
           }
       });
    }
}
