package com.example.administrator.framandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.UUID;

/**
 * Created by Administrator on 2018/1/8.
 */

public class FramSwitchFragment extends Fragment {
    private static final String ARG_SWITCH_ID = "switch_id";

    private FramSwitch mFramSwitch;
    private Switch mDcf;
    private Switch mHlfj;
    private Switch mZmd;
    private Switch mZyw;
    private Switch mCjm;
    private Switch mDjm;
    public static FramSwitchFragment newIntance(UUID framswitch_id){
        Bundle args = new Bundle();
        args.putSerializable(ARG_SWITCH_ID,framswitch_id);

        FramSwitchFragment fragment = new FramSwitchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        UUID Framid = (UUID)getArguments().getSerializable(ARG_SWITCH_ID);
        mFramSwitch = FramLab.getsFramLab(getActivity()).getFram(Framid).getmFramSwitch();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_control,container,false);
        mDcf = (Switch)v.findViewById(R.id.switch_dcf);
        mHlfj = (Switch)v.findViewById(R.id.switch_hlfj);
        mZmd = (Switch)v.findViewById(R.id.switch_zmd);
        mZyw = (Switch)v.findViewById(R.id.switch_zyw);
        mCjm = (Switch)v.findViewById(R.id.switch_cjm);
        mDjm = (Switch)v.findViewById(R.id.switch_djm);

        mDcf.setChecked(mFramSwitch.getmDcf());
        mDcf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked ){
                    mFramSwitch.setmDcf(true);
                }else {
                    mFramSwitch.setmDcf(false);
                }
            }
        });
        return v;

    }




}
