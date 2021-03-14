package com.example.fragmentexercise;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Inflater;


public class FragmentActivity extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

        //        int someInt = requireArguments().getInt("int1");
//        int someIntTwo = requireArguments().getInt("int2");
//        int someIntThree = requireArguments().getInt("int3");

        LinearLayout layout = view.findViewById(R.id.fragment_layout);

        ArrayList num = getArguments().getIntegerArrayList("mynumData");
        Iterator iterator = num.iterator();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity, container, false);
    }




    }