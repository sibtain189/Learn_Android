package com.example.passdatafragmenttofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    private Button mBtnData;
    private EditText mEtMessages;
    private FragmentCommunicationListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mEtMessages = view.findViewById(R.id.etMessages);
        mBtnData = view.findViewById(R.id.btnData);
        mBtnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    String data = mEtMessages.getText().toString();
                    listener.launchFragmentByPassingData(data);
                }
            }
        });
    }

    public void setListener(FragmentCommunicationListener fragmentCommunicationListener) {
        listener = fragmentCommunicationListener;
    }
}