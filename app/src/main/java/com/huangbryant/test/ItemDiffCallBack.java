package com.huangbryant.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.text.TextUtils;
import android.util.Log;

import java.util.List;


public class ItemDiffCallBack extends DiffUtil.Callback {

    private List<TestPartUpdateActivity.Bean> mOldList;
    private List<TestPartUpdateActivity.Bean> mNewList;

    public ItemDiffCallBack(List<TestPartUpdateActivity.Bean> oldList, List<TestPartUpdateActivity.Bean> newList) {
        mOldList = oldList;
        mNewList = newList;
    }

    @Override
    public int getOldListSize() {
        return mOldList == null ? 0 : mOldList.size();
    }

    @Override
    public int getNewListSize() {
        return mNewList == null ? 0 : mNewList.size();
    }

    /**
     * 被DiffUtil调用，用来判断 两个对象是否是相同的Item。
     * 例如，如果你的Item有唯一的id字段，这个方法就 判断id是否相等。
     * 本例判断id字段是否一致
     */
    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        String oldName = mOldList.get(oldItemPosition).getName();
        String newName = mNewList.get(newItemPosition).getName();
        return TextUtils.equals(oldName, newName);
    }


    /**
     * 被DiffUtil调用，用来检查 两个item是否含有相同的数据
     * 这个方法仅仅在areItemsTheSame()返回true时，才调用。
     */
    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        String oldName = mOldList.get(oldItemPosition).getName();
        String newName = mNewList.get(newItemPosition).getName();
        String oldStar = mOldList.get(oldItemPosition).getStar();
        String newStar = mNewList.get(newItemPosition).getStar();
        return TextUtils.equals(oldName, newName) && TextUtils.equals(oldStar, newStar);
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        Bundle bundle = new Bundle();
        String oldName = mOldList.get(oldItemPosition).getName();
        String newName = mNewList.get(newItemPosition).getName();
        String oldStar = mOldList.get(oldItemPosition).getStar();
        String newStar = mNewList.get(newItemPosition).getStar();

        if (!TextUtils.equals(oldStar, newStar)) {
            bundle.putSerializable("bean", mNewList.get(newItemPosition));
        }
        return bundle;
    }
}
