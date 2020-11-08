package com.example.mygallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.MyViewHolder> {

    public List<String> videos;
    public Context context;


    public VideoAdapter(@NonNull List<String> videos , Context context) {
        this.videos = videos;
        this.context = context;
    }

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.video_row,parent,false);

        MyViewHolder myViewHolder  = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MediaController mediaController = new MediaController(context);
        mediaController.setAnchorView(holder.videoView);

        holder.videoView.setMediaController(mediaController);

        holder.videoView.setVideoPath(videos.get(position));

        holder.videoView.start();

        //Glide.with(context).load(videos.get(position)).into(holder.videoView);






    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        VideoView videoView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             videoView = itemView.findViewById(R.id.videoViewId);


        }
    }
}
