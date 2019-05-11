package com.example.school.cougarcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddClassActivityActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_class_activity);
//        listView = (ExpandableListView) findViewById(R.id.classesList);
//        //initData();
//        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
//        listView.setAdapter(listAdapter);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(AddClassActivityActivity.this ,
                                            android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names ));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);



    }

    public void initData(){
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Hi");
        listDataHeader.add("you");
        listDataHeader.add("got");
        listDataHeader.add("no");
        listDataHeader.add("jams");

        List<String> jams = new ArrayList<>();
        jams.add("This is expandable list view");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Expandable ListView");
        androidStudio.add("Uncle Google");
        androidStudio.add("chitter chat");
        androidStudio.add("firebase");


        List<String> you = new ArrayList<>();
        you.add("Expandable ListView");
        you.add("Uncle Google");
        you.add("chitter chat");
        you.add("firebase");

        List<String> got = new ArrayList<>();
        got.add("Expandable ListView");
        got.add("Uncle Google");
        got.add("chitter chat");
        got.add("firebase");

        listHash.put(listDataHeader.get(0), jams);
        listHash.put(listDataHeader.get(1), androidStudio);
        listHash.put(listDataHeader.get(2), you);
        listHash.put(listDataHeader.get(3), got);










    }
}
