package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSegitiga, btnPersegi, btnLingkaran;
    EditText edtpjg, edtlebar;
    TextView tvHasilLuas, tvHasilKeliling;
    private double p, l, luas,keliling;
    private String panjang, lebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtpjg = findViewById(R.id.edtpjg);
        edtlebar = findViewById(R.id.edtlebar);
        btnSegitiga = findViewById(R.id.btnsegitiga);
        btnPersegi = findViewById(R.id.btnpersegi);
        btnLingkaran = findViewById(R.id.btnlingkatan);
        tvHasilLuas = findViewById(R.id.tvhasilluas);
        tvHasilKeliling =findViewById(R.id.tvhasilkeliling);

        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = edtpjg.getText().toString();
                lebar =edtlebar.getText().toString();

                p=Double.parseDouble(panjang);


                luas = p*p;
                keliling = 4*p;
                tvHasilLuas.setText("Hasil : "+luas);
                tvHasilKeliling.setText("Hasil : "+keliling);
                edtpjg.getText().clear();
                edtlebar.getText().clear();
            }
        });

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = edtpjg.getText().toString();
                lebar =edtlebar.getText().toString();

                p=Double.parseDouble(panjang);
                l=Double.parseDouble(lebar);

                luas = 0.5*p*l;
                keliling = 3*p;
                tvHasilLuas.setText("Hasil : "+luas);
                tvHasilKeliling.setText("Hasil : "+keliling);
                edtpjg.getText().clear();
                edtlebar.getText().clear();

            }
        });

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = edtpjg.getText().toString();
                lebar =edtlebar.getText().toString();

                p=Double.parseDouble(panjang);

                luas = 0.25*3.14*p*p;
                keliling = 3.14*p;
                tvHasilLuas.setText("Hasil : "+luas);
                tvHasilKeliling.setText("Hasil : "+keliling);
                edtpjg.getText().clear();
                edtlebar.getText().clear();
            }
        });
    }
}