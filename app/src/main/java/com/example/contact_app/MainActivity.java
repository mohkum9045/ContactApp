package com.example.contact_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<contactModel> arrayList;
    String[] userName = new String[]{"Mohit Kumar", "Ankit Kumar", "Ravi Kumar", "Gaurav Kumar", "Rishab Kumar","Mohit Kumar", "Ankit Kumar", "Ravi Kumar", "Gaurav Kumar", "Rishab Kumar","Mohit Kumar", "Ankit Kumar", "Ravi Kumar", "Gaurav Kumar", "Rishab Kumar"};
    String[] userMobileNumber = new String[]{"7456961957", "7456961957", "7456961957", "7456961957", "7456961957","7456961957", "7456961957", "7456961957", "7456961957", "7456961957","7456961957", "7456961957", "7456961957", "7456961957", "7456961957"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();

        for (int i = 0; i < userName.length; i++) {
            contactModel model = new contactModel();
            model.setName(userName[i]);
            model.setNumber(userMobileNumber[i]);
            arrayList.add(model);
        }

        recyclerView = (RecyclerView)findViewById(R.id.rcvView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new contactAppAdapter(arrayList));


    }
}