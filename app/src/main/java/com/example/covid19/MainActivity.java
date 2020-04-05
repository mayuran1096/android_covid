package com.example.covid19;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.covid19.Model.Data;
import com.example.covid19.Model.Feed;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private ImageView im,im1,im2,im3;

    private static final String TAG = "MainActivity";

    private static final String BASE_URL = "https://hpb.health.gov.lk/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = (ImageView) findViewById(R.id.aboutDetails);
        ImageView im1 = (ImageView) findViewById(R.id.serviceDetails);
        ImageView im2 = (ImageView) findViewById(R.id.contactDetails);
        ImageView im3 = (ImageView) findViewById(R.id.covidDetails);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityAbout();
            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityService();
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityContact();
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityCorona();
            }
        });






                //Creating a retrofit object




    }
    public void activityAbout(){
        Intent intent =new Intent(this,Abousus.class);
        startActivity(intent);

    }
    public void activityService(){
        Intent intent =new Intent(this,Service.class);
        startActivity(intent);

    }
    public  void activityContact(){
        Intent intent =new Intent(this,Contactus.class);
        startActivity(intent);

    }
    public  void activityCorona(){
        Intent intent =new Intent(this,Coronadetails.class);
        startActivity(intent);

    }

}
