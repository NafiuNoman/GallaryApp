package com.example.mygallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class imageAdapter extends RecyclerView.Adapter<imageAdapter.MyViewHolder> {


    Context context;
    List<String> AllImage;

    public imageAdapter(Context context,List<String> AllImage) {
        this.context = context;
        this.AllImage = AllImage;
    }

    @NonNull
    @Override
    public imageAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.my_image_row,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull imageAdapter.MyViewHolder holder, int position) {

        Glide.with(context).load(AllImage.get(position)).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return AllImage.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

           imageView = itemView.findViewById(R.id.imageViewId);

        }
    }
}
