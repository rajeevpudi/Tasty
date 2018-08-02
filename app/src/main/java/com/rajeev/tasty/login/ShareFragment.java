package com.rajeev.tasty.login;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.rajeev.tasty.R;

public class ShareFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.activity_share, container, false);

        Button btshare = layout.findViewById(R.id.bt_share);
        btshare.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"share button clicked", Toast.LENGTH_SHORT).show();
    }
}
