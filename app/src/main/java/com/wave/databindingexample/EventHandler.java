package com.wave.databindingexample;

        import android.content.Context;
        import android.widget.Toast;

/**
 * Created on : Mar 16, 2019
 * Author     : AndroidWave
 */
public class EventHandler {
    Context mContext;


    public EventHandler(Context mContext) {
        this.mContext = mContext;
    }

    public void onButtonClick(String name) {
        Toast.makeText(mContext, "Now you are following " + name, Toast.LENGTH_SHORT).show();
    }
}
