package com.example.mygallery;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link videoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class videoFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Context context;

    public List<String> videos;

    public RecyclerView recyclerView;

    public videoFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment videoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static videoFragment newInstance(String param1, String param2) {
        videoFragment fragment = new videoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {






               View view = inflater.inflate(R.layout.fragment_video, container, false);

               recyclerView = view.findViewById(R.id.recyclerId);


               ImageGallery imageGallery = new ImageGallery();

               videos =  imageGallery.FetchAllVideo(context);

              VideoAdapter videoAdapter = new VideoAdapter(videos,context);

        recyclerView.setHasFixedSize(true);


        recyclerView.setAdapter(videoAdapter);

               return view;


    }
}