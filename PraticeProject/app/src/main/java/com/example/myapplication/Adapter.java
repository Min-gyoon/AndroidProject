package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter{

    ArrayList<Data> list = new ArrayList<>();

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlistview,parent,false);
            holder = new ViewHolder();

            holder.imageView = v.findViewById(R.id.imageview);
            holder.textView = v.findViewById(R.id.textview1);
            holder.textview2  = v.findViewById(R.id.textview2);
            v.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }

        Data data = list.get(position);

        holder.imageView.setImageResource(data.getPictureNumber());
        holder.textView.setText(data.getText1());
        holder.textview2.setText(data.getText2());

        return v;
    }
    public class ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView textview2;

    }
    public void addItem(Data data){
        list.add(data);
    }
}