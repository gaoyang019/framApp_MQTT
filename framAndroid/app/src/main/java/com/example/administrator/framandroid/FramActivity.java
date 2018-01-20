package com.example.administrator.framandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class FramActivity extends SingleFragmentActivity {
    private static final String EXTRA_CRIMA_ID = "com.bignerdranch.android.framintent.fram_id";
    public static Intent newIntent(Context packageContext, UUID framid){
        Intent intent = new Intent(packageContext,FramActivity.class);
        intent.putExtra(EXTRA_CRIMA_ID,framid);
        return intent;
    }

    @Override
    protected Fragment createFragment(){
        UUID framid = (UUID)getIntent().getSerializableExtra(EXTRA_CRIMA_ID);
        return FramFragment.newInstance(framid);
    }

}
