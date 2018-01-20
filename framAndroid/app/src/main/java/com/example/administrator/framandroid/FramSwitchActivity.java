package com.example.administrator.framandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by Administrator on 2018/1/8.
 */

public class FramSwitchActivity extends SingleFragmentActivity{
    private static final String EXTRA_FRAM_ID = "com.bignerdranch.android.framlintent.fram_id";
    public static Intent newIntent(Context packageContext, UUID framid){
        Intent intent = new Intent(packageContext,FramSwitchActivity.class);
        intent.putExtra(EXTRA_FRAM_ID,framid);
        return intent;
    }
    @Override
    protected Fragment createFragment(){
        UUID framswitchId = (UUID)getIntent().getSerializableExtra(EXTRA_FRAM_ID);
        return FramSwitchFragment.newIntance(framswitchId);
    }
}
