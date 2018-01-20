package com.example.administrator.framandroid;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2018/1/4.
 */

public class FramListFragment extends Fragment{
    private RecyclerView mFramRecyclerView;
    private FramAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fram_list,container,false);

        mFramRecyclerView = (RecyclerView)view.findViewById(R.id.fram_recycler_view);
        mFramRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        return view;
    }

    private void updateUI(){
        FramLab framLab = FramLab.getsFramLab(getActivity());
        List<Fram> frams = framLab.getmFrams();

        if (mAdapter == null){
            mAdapter = new FramAdapter(frams);
            mFramRecyclerView.setAdapter(mAdapter);
        }else {
            mAdapter.notifyDataSetChanged();
        }

    }

    private class FramHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

            private Fram mFram;
            private TextView mTitleTextView;
            private TextView mWenduTextView;
            private TextView mTimeTextView;

        public FramHolder(View itemView){
                super(itemView);
                itemView.setOnClickListener(this);
                mTitleTextView = (TextView) itemView.findViewById(R.id.list_fram_title);
                mWenduTextView = (TextView) itemView.findViewById(R.id.list_fram_wd);
                mTimeTextView = (TextView) itemView.findViewById(R.id.list_fram_time);
            }

            public void bindfram(Fram fram){
                mFram = fram;
                mTitleTextView.setText(mFram.getmTitle());
                mTimeTextView.setText(mFram.getmDate().toString());
                mWenduTextView.setText(mFram.getmWendu());
            }
        @Override
        public void onClick(View v){
            Toast.makeText(getActivity(),mFram.getmTitle()+" clicked!",Toast.LENGTH_SHORT).show();
            Intent intent = FramActivity.newIntent(getActivity(),mFram.getmId());
            startActivity(intent);
        }

    }
    @Override
    public void onResume(){
        super.onResume();
        updateUI();
    }



    private class FramAdapter extends RecyclerView.Adapter<FramHolder>{
        private List<Fram> mFrams;

        public FramAdapter(List<Fram> frams){
            mFrams = frams;
        }

        @Override
        public FramHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_fram,parent,false);
            return new FramHolder(view);
        }

        @Override
        public void onBindViewHolder(FramHolder holder, int position) {
            Fram fram = mFrams.get(position);
            holder.bindfram(fram);

        }

        @Override
        public int getItemCount() {
            return mFrams.size();
        }
    }

}
