package com.rajeev.tasty.login;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.rajeev.tasty.R;

public class SlideshowFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.activity_slideshow, container,false);

        ImageView imageView = layout.findViewById(R.id.bt_slideshow);
        //imageView.setOnClickListener(this);

        return layout;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"SlideShow Button Clicked",Toast.LENGTH_SHORT).show();

    }
}
