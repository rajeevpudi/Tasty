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

public class GalleryFragment extends Fragment implements View.OnClickListener {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_gallery,container, false );

        Button btgallery = layout.findViewById(R.id.bt_gallery);
        btgallery.setOnClickListener(this);


        return layout;
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getActivity(),"gallery button selected", Toast.LENGTH_SHORT).show();


    }
}
