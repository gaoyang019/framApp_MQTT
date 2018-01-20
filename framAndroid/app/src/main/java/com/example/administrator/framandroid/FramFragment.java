package com.example.administrator.framandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;

/**
 * Created by Administrator on 2018/1/2.
 */

public class FramFragment extends Fragment{
    private static final String ARG_FRAM_ID = "fram_id";

    private Fram mFram;
    private TextView mWendu;
    private TextView mKshidu;
    private TextView mCo;
    private TextView mTshidu;
    private TextView mDaodian;
    private TextView mYanfen;
    private Button mBtn;
    private TextView mTitle;

    public static FramFragment newInstance(UUID framid){
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_FRAM_ID,framid);

        FramFragment fragment = new FramFragment();
        fragment.setArguments(bundle);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        UUID framid = (UUID)getArguments().getSerializable(ARG_FRAM_ID);
        mFram = FramLab.getsFramLab(getActivity()).getFram(framid);
        //mFram = new Fram();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_fram,container,false);

        mTitle = (TextView)v.findViewById(R.id.fram_title);
        mWendu = (TextView)v.findViewById(R.id.num_wendu);
        mKshidu = (TextView)v.findViewById(R.id.num_kshidu);
        mCo = (TextView)v.findViewById(R.id.num_co);
        mTshidu = (TextView)v.findViewById(R.id.num_tshidu);
        mDaodian = (TextView)v.findViewById(R.id.num_daodian);
        mYanfen = (TextView)v.findViewById(R.id.num_yanfen);
        mBtn = (Button)v.findViewById(R.id.btn_control);

        mTitle.setText(mFram.getmTitle());
        mWendu.setText(mFram.getmWendu());

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),R.string.tiaozhuang,Toast.LENGTH_SHORT).show();
                Intent intent = FramSwitchActivity.newIntent(getActivity(),mFram.getmId());
                startActivity(intent);

            }
        });

        return v;
    }




}
