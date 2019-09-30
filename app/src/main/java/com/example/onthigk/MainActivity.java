package com.example.onthigk;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv_l;
    Button chon,luu;
    EditText soban;
    ArrayList<String>list=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_l = (TextView) findViewById(R.id.tv_loai);
        chon = (Button) findViewById(R.id.bt_chon);
        luu = (Button) findViewById(R.id.bt_luu);
        soban = (EditText) findViewById(R.id.ed_sb);
        chon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,activity2.class);
                intent.putExtra("ds",list);
                startActivity(intent);

            }
        });
        luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String filename=soban.getText().toString();
                String p=null;
                list.add(filename);
                try {
                    FileOutputStream fout = openFileOutput(filename, Context.MODE_PRIVATE);
                    fout.write(tv_l.toString().getBytes());
                    fout.close();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,"Loi luu file", Toast.LENGTH_SHORT);
                }
            }
        });

    }
}
