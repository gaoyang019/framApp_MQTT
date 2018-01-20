package com.example.administrator.framandroid;

import java.util.UUID;

/**
 * Created by Administrator on 2018/1/8.
 */

public class FramSwitch {
    private UUID mId;
    private Boolean mDcf;
    private Boolean mHlfj;
    private Boolean mZmd;
    private Boolean mZyw;
    private Boolean mCjm;
    private Boolean mDjm;

    public FramSwitch(UUID framid){
        mId = framid;
        mDcf = true;
    }

    public UUID getmId() {
        return mId;
    }

    public Boolean getmDjm() {
        return mDjm;
    }
    public void setmDjm(Boolean mDjm) {
        this.mDjm = mDjm;
    }

    public Boolean getmCjm() {
        return mCjm;
    }
    public void setmCjm(Boolean mCjm) {
        this.mCjm = mCjm;
    }

    public Boolean getmZyw() {
        return mZyw;
    }
    public void setmZyw(Boolean mZyw) {
        this.mZyw = mZyw;
    }

    public Boolean getmZmd() {
        return mZmd;
    }
    public void setmZmd(Boolean mZmd) {
        this.mZmd = mZmd;
    }

    public Boolean getmHlfj() {
        return mHlfj;
    }
    public void setmHlfj(Boolean mHlfj) {
        this.mHlfj = mHlfj;
    }

    public Boolean getmDcf() {
        return mDcf;
    }
    public void setmDcf(Boolean mDcf) {
        this.mDcf = mDcf;
    }

}
