package com.lazydev.mytask.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lazydev.mytask.R;
import com.lazydev.mytask.model.Item;

import java.util.ArrayList;

/**
 * Created by eslam on 3/23/17.
 */

public class ItemAdapter extends BaseAdapter {
    Activity mActivity;
    LayoutInflater mInflater;
    ArrayList<Item> mList;

    public ItemAdapter(Activity activity, ArrayList<Item> list) {
        this.mActivity = activity;
        this.mInflater = activity.getLayoutInflater();
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view != null) {
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = mInflater.inflate(R.layout.item_data , null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }

        viewHolder.title.setText(mList.get(position).getName());
        return view;
    }

    public class ViewHolder {
        private TextView title;

        public ViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.textView_title);
        }
    }
}
