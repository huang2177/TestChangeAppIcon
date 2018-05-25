package com.huangbryant.test;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

class PartUpdateAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<TestPartUpdateActivity.Bean> mData;

    public PartUpdateAdapter(Context context, List<TestPartUpdateActivity.Bean> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tvStar.setText(mData.get(position).getStar());
        viewHolder.tvName.setText(mData.get(position).getName());
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position, List payloads) {
        //判断数据更改是否为空，说明是新增的，直接去绑定数据
        if (payloads == null || payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }

        ViewHolder viewHolder = (ViewHolder) holder;
        Bundle bundle = (Bundle) payloads.get(0);
        TestPartUpdateActivity.Bean bean = (TestPartUpdateActivity.Bean) bundle.getSerializable("bean");
        if (bean == null) {
            return;
        }
        viewHolder.tvName.setText(bean.getName());
        viewHolder.tvStar.setText(bean.getStar());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setData(List<TestPartUpdateActivity.Bean> data) {
        mData = data;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvStar;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.item_name);
            tvStar = itemView.findViewById(R.id.item_star);
        }
    }
}
