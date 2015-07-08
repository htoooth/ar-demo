package com.pathprint.kpm.ar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.artoolkit.ar.base.ARToolKit;

import butterknife.Bind;


public class MainActivity extends ActionBarActivity {

    @Bind(R.id.txtView)
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARToolKit.getInstance().initialiseNative(this.getApplicationContext().getCacheDir().getAbsolutePath());
    }

}
