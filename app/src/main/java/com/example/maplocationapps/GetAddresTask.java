package com.example.maplocationapps;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;

public class GetAddresTask extends AsyncTask<Location, Void, String> {

    private Context mContext;

    private OnTaskCompleted mListener;

    public GetAddresTask(Context context, OnTaskCompleted listener){
        mContext = context;
        mListener = listener;
    }

    interface OnTaskCompleted{
        void onTaskCompleted(String result);
    }
    @Override
    protected String doInBackground(Location... locations) {
        return null;
    }
}
