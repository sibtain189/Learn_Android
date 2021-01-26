package com.example.passdatafragmenttofragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    private TextView mTvMessage;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvMessage=view.findViewById(R.id.tvMessages);
getDataFromBundle();
    }

    private void getDataFromBundle() {
        Bundle bundle=getArguments();
        if(bundle!=null){
            String dataFromFragmentA=bundle.getString("data");
            mTvMessage.setText(dataFromFragmentA);
        }
    }

//    public void getArguments(Bundle bundle) {
//    }
////
//    public void getArguments(Bundle bundle) {
//    }
}