package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_a = findViewById(R.id.et_a);
        EditText et_b = findViewById(R.id.et_b);
        EditText et_ketqua = findViewById(R.id.et_ketqua);
        Button btn_tong = findViewById(R.id.btn_tong);
        Button btn_hieu = findViewById(R.id.btn_hieu);
        Button btn_tich = findViewById(R.id.btn_tich);
        Button btn_thuong = findViewById(R.id.btn_thuong);
        Button btn_uscln = findViewById(R.id.btn_uscln);
        Button btn_thoat = findViewById(R.id.btn_thoat);

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et_a.getText().toString());
                int b = Integer.parseInt(et_b.getText().toString());
                int ketqua = a+b;
                et_ketqua.setText(Integer.toString(ketqua));
            }
        });
        btn_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et_a.getText().toString());
                int b = Integer.parseInt(et_b.getText().toString());
                int ketqua = a-b;
                et_ketqua.setText(Integer.toString(ketqua));
            }
        });
        btn_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et_a.getText().toString());
                int b = Integer.parseInt(et_b.getText().toString());
                int ketqua = a*b;
                et_ketqua.setText(Integer.toString(ketqua));
            }
        });
        btn_thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Integer.parseInt(et_a.getText().toString());
                float b = Integer.parseInt(et_b.getText().toString());
                float ketqua = a/b;
                et_ketqua.setText(Float.toString(ketqua));
            }
        });
        btn_uscln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et_a.getText().toString());
                int b = Integer.parseInt(et_b.getText().toString());
                USCLN kq = new USCLN();
                int ketqua = kq.TimUSCLN(a,b);
                et_ketqua.setText(Integer.toString(ketqua));
            }
        });
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}