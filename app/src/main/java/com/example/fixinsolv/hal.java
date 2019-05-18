package com.example.fixinsolv;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link hal.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link hal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class hal extends Fragment {
    static final String TAG = hal.class.getSimpleName();
    public static final String EXTRAS = "extras";

    public hal() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hal, container, false);

        TextView textView = view.findViewById(R.id.tv_fragment);

        String halaman = getArguments().getString(EXTRAS);
        textView.setText(halaman);

        Log.e(TAG, "onCreateView: halaman fragment " + halaman);
        return view;
    }
}