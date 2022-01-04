package com.example.retrofitfetchdata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitfetchdata.model.ResponseModel;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<ResponseModel> data;

    public MyAdapter(List<ResponseModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv1.setText(data.get(position).getUserId());
        holder.tv2.setText(data.get(position).getId());
        holder.tv3.setText(data.get(position).getTitle());
        holder.tv4.setText(data.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv1, tv2, tv3, tv4;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.textView1Id);
            tv2 = itemView.findViewById(R.id.textView2Id);
            tv3 = itemView.findViewById(R.id.textView3Id);
            tv4 = itemView.findViewById(R.id.textView4Id);
        }
    }
}
