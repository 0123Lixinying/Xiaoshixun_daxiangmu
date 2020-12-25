package com.example.xiaoshixun_daxiangmu;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.youth.banner.Banner;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout clMain;
    private ConstraintLayout clMain2;
    private ImageView ivSearch;
    private TextView tvSearch;
    private Banner bannerMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        clMain = findViewById(R.id.cl_main);
        clMain2 = findViewById(R.id.cl_main2);
        ivSearch = findViewById(R.id.iv_search);
        tvSearch = findViewById(R.id.tv_search);
        bannerMain = findViewById(R.id.banner_main);
    }
}