package com.rajeev.tasty.login;

import android.Manifest;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.rajeev.tasty.R;

public class ManageFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.activity_manage, container, false);

        Button btmanage = layout.findViewById(R.id.bt_manage);
        btmanage.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"manage button clicked",Toast.LENGTH_SHORT).show();

    }
}
