package com.example.administrator.framandroid;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2018/1/4.
 */

public class FramLab {
    private static FramLab sFramLab;
    private List<Fram> mFrams;



    private FramLab(Context context) {
        mFrams = new ArrayList<>();

        for (int i=1 ; i<25 ; i++){
            Fram fram = new Fram();
            fram.setmTitle(i+"号大棚");
            mFrams.add(fram);
        }
    }
    public static FramLab getsFramLab(Context context){
        if (sFramLab == null){
            sFramLab = new FramLab(context);
        }
        return sFramLab;
    }


    public List<Fram> getmFrams(){
        return mFrams;
    }
    public Fram getFram(UUID uuid){
        for (Fram fram : mFrams){
            if (fram.getmId().equals(uuid)){
                return fram;
            }
        }
        return null;
    }






}
