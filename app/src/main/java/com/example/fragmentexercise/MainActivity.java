package com.example.fragmentexercise;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransact = getSupportFragmentManager().beginTransaction();
        fragmentTransact.add(R.id.fragment_container_view, FragmentActivity.class, insertData());
        fragmentTransact.commit();
    }

    public Bundle insertData(){
        ArrayList <Integer> myNumList = new ArrayList<>();
        Bundle bundle = new Bundle();

        for (int i = 0; i<5; i++){
            bundle.putInt("int0", 0);
            bundle.putInt("int1", 1);
            bundle.putInt("int2", 2);
        }


        bundle.putIntegerArrayList("mynumData", myNumList);
        return bundle;
    }
}