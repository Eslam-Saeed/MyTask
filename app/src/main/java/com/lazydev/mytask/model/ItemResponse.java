package com.lazydev.mytask.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eslam on 3/23/17.
 */

public class ItemResponse implements Serializable {

    @SerializedName(value="500", alternate={"1000", "1500","2000","2500","3000","3500","4000","4500","5000"})
    private ArrayList<Item> mList;

    public ArrayList<Item> getList() {
        return mList;
    }

    public void setList(ArrayList<Item> list) {
        mList = list;
    }
}
