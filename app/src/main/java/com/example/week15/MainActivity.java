package com.example.week15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FlyBanner banner_1;
    private FlyBanner banner_2;
    private String[] mImagesUrl = {
            "https://ws1.sinaimg.cn/large/0065oQSqly1fvexaq313uj30qo0wldr4.jpg",
        "https://ws1.sinaimg.cn/large/0065oQSqly1fv5n6daacqj30sg10f1dw.jpg",
        "https://ws1.sinaimg.cn/large/0065oQSqly1fuo54a6p0uj30sg0zdqnf.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diyi1();
        diyi2();
    }
    //加载本地
    private void diyi1() {
        banner_1 = findViewById(R.id.banner_1);
        List<Integer> list=new ArrayList<>();
        list.add(R.drawable.a);
        list.add(R.drawable.b);
        list.add(R.drawable.c);
        list.add(R.drawable.d);
        list.add(R.drawable.e);
        banner_1.setImages(list);
    }
    //加载网页
    private void diyi2() {
        banner_2 = findViewById(R.id.banner_2);
        List<String> list=new ArrayList<>();
        for (int i = 0; i <mImagesUrl.length ; i++) {
            list.add(mImagesUrl[i]);
        }
        banner_2.setImagesUrl(list);
    }
}
