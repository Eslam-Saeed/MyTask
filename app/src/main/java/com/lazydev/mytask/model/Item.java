package com.lazydev.mytask.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by eslam on 3/23/17.
 */

public class Item implements Serializable{

    /*"id":145,
            "name":"ايفون 7 بلس 128GB",
            "desc":"",
            "current":1500,
            "entering":100,
            "image":"1477326501116.png",
            "started":false,
            "finished":false,
            "cname":"No Bidding",
            "idnumber":"-",
            "datetype":"4",
            "enddate":34*/
    @SerializedName("id")
    private int mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("desc")
    private String mDesc;
    @SerializedName("current")
    private String mCurrent;
    @SerializedName("entering")
    private String mEntering;
    @SerializedName("image")
    private String mImage;
    @SerializedName("started")
    private boolean mStarted;
    @SerializedName("finished")
    private boolean mFinished;
    @SerializedName("cname")
    private String mCname;
    @SerializedName("idnumber")
    private String mIdNumber;
    @SerializedName("datetype")
    private int mDateType;
    @SerializedName("enddate")
    private int mEndDate;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDesc() {
        return mDesc;
    }

    public void setDesc(String desc) {
        mDesc = desc;
    }

    public String getCurrent() {
        return mCurrent;
    }

    public void setCurrent(String current) {
        mCurrent = current;
    }

    public String getEntering() {
        return mEntering;
    }

    public void setEntering(String entering) {
        mEntering = entering;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public boolean isStarted() {
        return mStarted;
    }

    public void setStarted(boolean started) {
        mStarted = started;
    }

    public boolean isFinished() {
        return mFinished;
    }

    public void setFinished(boolean finished) {
        mFinished = finished;
    }

    public String getCname() {
        return mCname;
    }

    public void setCname(String cname) {
        mCname = cname;
    }

    public String getIdNumber() {
        return mIdNumber;
    }

    public void setIdNumber(String idNumber) {
        mIdNumber = idNumber;
    }

    public int getDateType() {
        return mDateType;
    }

    public void setDateType(int dateType) {
        mDateType = dateType;
    }

    public int getEndDate() {
        return mEndDate;
    }

    public void setEndDate(int endDate) {
        mEndDate = endDate;
    }
}
