package com.huangbryant.test;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;


public class TestPartUpdateActivity extends AppCompatActivity {

    private PartUpdateAdapter mAdpter;
    private RecyclerView mRecyclerView;
    private List<Bean> mData, mData1;
    private int a;
    private Handler mHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_update);
        getData();

        mRecyclerView = findViewById(R.id.rv);
        mHandler = new Handler();

        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(manager);

        mAdpter = new PartUpdateAdapter(this, mData);
        mRecyclerView.setAdapter(mAdpter);
    }

    private void getData() {
        mData = Arrays.asList(new Bean("Java", "1000+")
                , new Bean("Android", "1200+")
                , new Bean("C", "100+")
                , new Bean("C++", "99+")
                , new Bean("PHP", "20+")
                , new Bean("C#", "200+")
                , new Bean("Scala", "20+")
                , new Bean("Go", "50+")
                , new Bean("JS", "1000+")
                , new Bean("Python", "500+")
                , new Bean("IOS", "900+")
                , new Bean("MySQL", "2000+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+"));

        mData1 = Arrays.asList(new Bean("Java", "1000+")
                , new Bean("Android", "1200+")
                , new Bean("C", "100+")
                , new Bean("C++", "99+")
                , new Bean("PHP", "20+")
                , new Bean("C#", "200+")
                , new Bean("Scala", "20+")
                , new Bean("Go", "50+")
                , new Bean("JS", "1000+")
                , new Bean("Python", "500+")
                , new Bean("IOS", "900+")
                , new Bean("MySQL", "2000+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+")
                , new Bean("Groovy", "300+"));
    }

    private Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            a++;
            Log.e("====", "-----" + a);
            for (int i = 0; i < mData.size(); i++) {
                if (i % 2 == 0) {
                    mData1.get(i).setStar(1000 + a * i + "");
                }
            }

            DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new ItemDiffCallBack(mData, mData1), true);
            diffResult.dispatchUpdatesTo(mAdpter);

            mAdpter.setData(mData1);

            mHandler.postDelayed(mRunnable, 1000);
        }
    };

    public void change(View view) {
        mHandler.removeCallbacks(mRunnable);
        mHandler.post(mRunnable);
    }

    class Bean implements Serializable {
        private String name;
        private String star;

        public Bean(String name, String star) {
            this.name = name;
            this.star = star;
        }

        public String getName() {
            return name;
        }

        public String getStar() {
            return star;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setStar(String star) {
            this.star = star;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHandler.post(mRunnable);
    }
}
