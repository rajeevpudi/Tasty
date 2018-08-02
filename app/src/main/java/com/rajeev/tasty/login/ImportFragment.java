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

public class ImportFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_import, container,false);

        return layout;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(),"Import Fragment Button Clicked",Toast.LENGTH_SHORT).show();
    }
}
