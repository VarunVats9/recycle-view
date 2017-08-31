package com.example.vvats.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vvats on 09/03/17.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    String[] s1, s2;
    int[] img;
    Context context;

    public MyAdapter(String s1[], String s2[], int[] img, Context context) {
        this.context = context;
        this.s1 = s1;
        this.s2 = s2;
        this.img = img;
    }

    @Override
    public MyAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyHolder holder, int position) {
        holder.t1.setText(s1[position]);
        holder.t2.setText(s2[position]);
        holder.imageView.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView t1, t2;
        ImageView imageView;
        public MyHolder(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.txt1);
            t2 = (TextView) itemView.findViewById(R.id.txt2);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
