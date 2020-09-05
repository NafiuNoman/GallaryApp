package com.example.mygallery;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import java.util.ArrayList;

public class ImageGallery {

    public static ArrayList<String> FetchAllImage(Context context)

    {


        Uri uri;
        Cursor cursor;
        int column_index_data;
        ArrayList<String> listOfAllImages = new ArrayList<>();

        String absolutePathOfImage;
        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String[] projection = {MediaStore.MediaColumns.DATA,MediaStore.Images.Media.BUCKET_DISPLAY_NAME};

        cursor = context.getContentResolver().query(uri,projection,null,null,null);

        column_index_data = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);

        while (cursor.moveToNext())
        {
            absolutePathOfImage = cursor.getString(column_index_data);
            listOfAllImages.add(absolutePathOfImage);

        }


        return listOfAllImages;
    }



    public static ArrayList<String> FetchAllVideo(Context context)

    {


        Uri uri;
        Cursor cursor;
        int column_index_data;
        ArrayList<String> listOfAllVideo = new ArrayList<>();

        String absolutePathOfVideo;
        uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        String[] projection = {MediaStore.MediaColumns.DATA,MediaStore.Video.Media.BUCKET_DISPLAY_NAME};


        cursor = context.getContentResolver().query(uri,projection,null,null,null);

        column_index_data = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);

        while (cursor.moveToNext())
        {
            absolutePathOfVideo = cursor.getString(column_index_data);
            listOfAllVideo.add(absolutePathOfVideo);

        }


        return listOfAllVideo;
    }
}