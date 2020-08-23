package com.example.mygallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class imageAdapter extends RecyclerView.Adapter<imageAdapter.MyViewHolder> {


    //Context context;

    public imageAdapter(Context context) {
       // this.context = context;
    }

    @NonNull
    @Override
    public imageAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.my_image_row,parent,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull imageAdapter.MyViewHolder holder, int position) {

        holder.imageView.setImageResource(R.drawable.ic_spider);


    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

           imageView = itemView.findViewById(R.id.imageViewId);
           textView = itemView.findViewById(R.id.textViewId);

        }
    }
}
