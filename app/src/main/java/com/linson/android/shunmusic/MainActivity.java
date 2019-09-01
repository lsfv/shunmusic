package com.linson.android.shunmusic;

import android.Manifest;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amitshekhar.DebugDB;

import java.io.IOException;

import app.lslibrary.androidHelper.LSContentResolver;
import app.lslibrary.androidHelper.LSLog;
import app.lslibrary.network.LSOKHttp;
import app.model.Book;
import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity
{
    public static Context appContext;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        appContext=getApplicationContext();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        this.finish();
    }
}