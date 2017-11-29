package com.example.shibo.myapplication;

import android.support.v4.util.LogWriter;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;

import android.app.Activity;

import android.graphics.Color;

import android.view.View;

import android.widget.TextView;

import android.widget.Toast;;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textViewCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCompat = (TextView) findViewById(R.id.textView);
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://rest-service.guides.spring.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();

        GetGreeting getGreeting = retrofit.create(GetGreeting.class);
        Call<Greeting> x = getGreeting.getObject();
        x.enqueue(new Callback<Greeting>() {
            @Override
            public void onResponse(Call<Greeting> call, Response<Greeting> response) {
                Greeting greeting=response.body();
                textViewCompat.setText(greeting
                        .getContent());
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>." + greeting
                .getContent());
            }

            @Override
            public void onFailure(Call<Greeting> call, Throwable t) {
                textViewCompat.setText("error");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.error ");
            }
        });

    }


}
