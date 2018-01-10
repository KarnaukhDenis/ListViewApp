package com.example.denis.listviewapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.denis.listviewapp.R;
import com.example.denis.listviewapp.adapter.PhoneModelAdapter;
import com.example.denis.listviewapp.pojo.PhoneModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        //List<String> item  = initData();
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());
        listView.setAdapter(adapter);
    }

    private List<PhoneModel> initData() {
        List<PhoneModel> list = new ArrayList<PhoneModel>();
        list.add(new PhoneModel(1,"iPhone",1000));
        list.add(new PhoneModel(2,"HTC",600));
        list.add(new PhoneModel(3,"Samsung",900));
        list.add(new PhoneModel(4,"LG",600));
        list.add(new PhoneModel(5,"Xiaomi",500));
        return list;

    }
}
