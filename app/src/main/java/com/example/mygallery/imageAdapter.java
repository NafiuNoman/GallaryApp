package com.example.mygallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    public void onBindViewHolder(@NonNull imageAdapter.MyViewHolder holder, final int position) {

        Glide.with(context).load(AllImage.get(position)).into(holder.imageView);


        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,ActImageView.class);

//              int value = Integer.parseInt(AllImage.get(position));

                String pic = AllImage.get(position);

                intent.putExtra("picture",pic);

//                intent.putExtra("picture",AllImage.get(position));

                context.startActivity(intent);


//                Toast.makeText(context, "hi", Toast.LENGTH_SHORT).show();


            }
        });


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
