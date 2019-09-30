package com.example.onthigk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private List<country> data;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomAdapter(Context aContext,  List<country> listData) {
        this.context = aContext;
        this.data = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      //  ViewHolder holder;
        return null;
    }
}
