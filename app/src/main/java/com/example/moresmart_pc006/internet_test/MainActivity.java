package com.example.moresmart_pc006.internet_test;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private static final String PATH = "http://192.168.1.92:8080/news/news.xml";

    /*联网超时*/
    private static final int TIME_OUT = 5000;
    private ListView lv;

    /*用于存储新闻条目的集合*/

    private  ArrayList<News> al = new ArrayList<News>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
