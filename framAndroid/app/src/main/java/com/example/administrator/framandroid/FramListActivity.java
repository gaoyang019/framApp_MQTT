package com.example.administrator.framandroid;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2018/1/4.
 */

public class FramListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new FramListFragment();
    }
}
