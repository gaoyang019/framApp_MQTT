package com.example.administrator.framandroid;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Administrator on 2018/1/2.
 */

public class Fram {
    private UUID mId;
    private String mTitle;
    private String mWendu;
    private String mKshidu;
    private String mTshidu;
    private String mCo;
    private String mDaodian;
    private String mYanfen;
    private Date mDate;



    private FramSwitch mFramSwitch;

    public Fram(){

        mId = UUID.randomUUID();
        mDate = new Date();
        mWendu = "15度";
        //mTitle = mId.toString();
        mFramSwitch = new FramSwitch(mId);
    }

    public FramSwitch getmFramSwitch() {
        return mFramSwitch;
    }

    public Date getmDate() {
        return mDate;
    }
    public void setmDate(Date mDate) {
        mDate = mDate;
    }

    public UUID getmId() {
        return mId;
    }

    public String getmKshidu() {
        return mKshidu;
    }
    public void setmKshidu(String mKshidu) {
        this.mKshidu = mKshidu;
    }

    public String getmTshidu() {
        return mTshidu;
    }
    public void setmTshidu(String mTshidu) {
        this.mTshidu = mTshidu;
    }

    public String getmCo() {
        return mCo;
    }
    public void setmCo(String mCo) {
        this.mCo = mCo;
    }

    public String getmDaodian() {
        return mDaodian;
    }
    public void setmDaodian(String mDaodian) {
        this.mDaodian = mDaodian;
    }

    public String getmYanfen() {
        return mYanfen;
    }
    public void setmYanfen(String mYanfen) {
        this.mYanfen = mYanfen;
    }

    public String getmWendu() {
        return mWendu;
    }
    public void setmWendu(String mWendu) {
        this.mWendu = mWendu;
    }
    public String getmTitle() {
        return mTitle;
    }
    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
