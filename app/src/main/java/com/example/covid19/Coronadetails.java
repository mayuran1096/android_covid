package com.example.covid19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.covid19.Model.Data;
import com.example.covid19.Model.Feed;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Coronadetails extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView totalcase, activecase, datetime, newcase, deaths, recovered, invidujual;

    private static final String BASE_URL = "https://hpb.health.gov.lk/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coronadetails);
        ImageView btnGetData = (ImageView) findViewById(R.id.btnGetData);
        totalcase = (TextView) findViewById(R.id.totalcase);
        activecase = (TextView) findViewById(R.id.activecase);
        newcase = (TextView) findViewById(R.id.newcase);
        deaths = (TextView) findViewById(R.id.deaths);
        datetime = (TextView) findViewById(R.id.datetime);
        recovered = (TextView) findViewById(R.id.recovered);
        invidujual = (TextView) findViewById(R.id.invidual);


        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                //creating the api interface
                Api redditAPI = retrofit.create(Api.class);
                Call<Feed> call = redditAPI.getFeed();
                call.enqueue(new Callback<Feed>() {
                    @Override
                    public void onResponse(Call<Feed> call, Response<Feed> response) {
                        Log.d(TAG, "onResponse: Server Response: " + response.toString());
                        Log.d(TAG, "onResponse: received information: " + response.body().toString());

                        Data datalist = response.body().getData();
//                Log.d("respone for data", String.valueOf(datalist));
                        totalcase.setText(datalist.getLocal_total_cases());
                        activecase.setText(datalist.getLocal_active_cases());
                        newcase.setText(datalist.getLocal_new_cases());
                        deaths.setText(datalist.getLocal_deaths());
                        recovered.setText(datalist.getLocal_recovered());
                        datetime.setText(datalist.getUpdate_date_time());
                        invidujual.setText(datalist.getLocal_total_number_of_individuals_in_hospitals());


                        Log.d(TAG, "onResponse values: \n" +
                                "Date And time of the last update: " + datalist.getUpdate_date_time() + "\n" +
                                "Total Number Of cases: " + datalist.getLocal_total_cases() + "\n" +
                                "Number Of Active Cases: " + datalist.getLocal_active_cases() + "\n" +
                                "New cases:" + datalist.getLocal_new_cases() + "\n" +
                                "Total number of individuals in hospitals:" + datalist.getLocal_total_number_of_individuals_in_hospitals() + "\n" +
                                "Recovered & Discharged :" + datalist.getLocal_recovered() + "\n" +
                                "Deaths:" + datalist.getLocal_deaths() + "\n" +


                                "-------------------------------------------------------------------------\n\n");

                    }

                    @Override
                    public void onFailure(Call<Feed> call, Throwable t) {
                        Log.e(TAG, "onFailure: Something went wrong: " + t.getMessage());
                        Toast.makeText(Coronadetails.this, "Something went wrong", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }
}
