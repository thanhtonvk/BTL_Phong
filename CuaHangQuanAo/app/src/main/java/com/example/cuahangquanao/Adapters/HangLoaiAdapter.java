package com.example.cuahangquanao.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.cuahangquanao.R;

import java.util.List;
import java.util.Random;

public class HangLoaiAdapter extends ArrayAdapter<String> {
    Context context;
    List<String> list;
    String[] color;

    public HangLoaiAdapter(@NonNull Context context, List<String> list) {
        super(context, 0, list);
        this.context = context;
        this.list = list;
        color = new String[]{"#FFBB86FC", "#FF6200EE", "#FF3700B3", "#FF03DAC5", "#FF018786", "#FF000000", "#F57C00", "#689F38", "#0097A7", "#D32F2F"};
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_hang_loai, parent, false);
        }
        TextView tv_ten = convertView.findViewById(R.id.tv_ten);
        tv_ten.setTextColor(Color.parseColor(color[new Random().nextInt(10)]));
        String tv = list.get(position);
        tv_ten.setText(tv);

        return convertView;
    }
}
