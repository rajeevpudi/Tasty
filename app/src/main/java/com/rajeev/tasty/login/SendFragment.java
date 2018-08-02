package com.rajeev.tasty.login;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.rajeev.tasty.R;

public class SendFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.activity_send, container, false);

        Button btsend = layout.findViewById(R.id.bt_send);

        btsend.setOnClickListener(this);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"Send Button Clicked",Toast.LENGTH_SHORT).show();

    }
}
