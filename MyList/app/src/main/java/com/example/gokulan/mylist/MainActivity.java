package com.example.gokulan.mylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Match> matchList = new ArrayList<>();
    RecyclerView recyclerView;
    MatchAdapter matchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        matchList.add(new Match("RCB", "SRH", 0));
        matchList.add(new Match("DD", "RR", 1));

        recyclerView = findViewById(R.id.recyclerview);
        matchAdapter = new MatchAdapter(matchList);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(matchAdapter);

    }
}
