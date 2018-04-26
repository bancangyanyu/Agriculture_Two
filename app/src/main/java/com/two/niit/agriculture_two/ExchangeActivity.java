package com.two.niit.agriculture_two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class ExchangeActivity extends AppCompatActivity {
private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
        lv=(ListView)findViewById(R.id.lv);
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,getData(),R.layout.item,new String[]{"img","tv"},new int[]{R.id.img,R.id.tv});

        lv.setAdapter(simpleAdapter);
    }



}
