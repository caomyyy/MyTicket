package com.example.myticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class DangKyActivity extends AppCompatActivity implements View.OnFocusChangeListener {
     EditText edtNgaySinh, edtSDT, edtHoTen, edtCMT,edtMatKhau ;
     RadioGroup rgGioiTinh;
     Button btnOKDK,  btnDangNhapDK;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_dangky);

        edtNgaySinh =(EditText) findViewById (R.id.edtNgaySinh);
        edtCMT =(EditText) findViewById (R.id.edtCMT);
        edtHoTen =(EditText) findViewById (R.id.edtHoTen);
        edtSDT =(EditText) findViewById (R.id.edtSDT);
        edtMatKhau =(EditText) findViewById (R.id.edtMatKhau);
        rgGioiTinh = (RadioGroup) findViewById (R.id.rgGioiTinh);
        btnOKDK = (Button) findViewById (R.id.btnOKDK);
        btnDangNhapDK = (Button) findViewById (R.id.btnDangNhapDK);


        edtNgaySinh.setOnFocusChangeListener (this);
        btnDangNhapDK.setOnClickListener (new View.OnClickListener ( ) {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent (DangKyActivity.this , DangNhapActivity.class);
                startActivity (intent);
            }
        });



    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        int id  = v.getId ();
        switch (id) {
            case R.id.edtNgaySinh :
                if(hasFocus){
                    DatePickerFragment datePickerFragment = new DatePickerFragment ();
                    datePickerFragment.show(getSupportFragmentManager (),"Ngày Sinh");
                }
        }
        }
    }


