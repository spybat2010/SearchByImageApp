package com.manishm.imagefinder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static com.manishm.imagefinder.R.id.parent;

/**
 * Created by manish on 6/17/2017.
 */

public class UrlAdapter extends RecyclerView.Adapter<UrlAdapter.MyViewHolder> {


    Context mContext;
    ArrayList<String> urlList;

    public UrlAdapter(Context context, ArrayList<String> urlList
    )
    {
        this.mContext = context;
        this.urlList = urlList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_url_list, parent, false);

        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(UrlAdapter.MyViewHolder holder, int position) {
        holder.url.setText(urlList.get(position));
    }

    @Override
    public int getItemCount() {
        return urlList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView url;

        public MyViewHolder(View view) {
            super(view);
            url = (TextView) view.findViewById(R.id.tv_url_list);

        }
    }
}
