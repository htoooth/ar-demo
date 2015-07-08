package com.pathprint.kpm.ar;

import android.os.Bundle;
import android.widget.FrameLayout;

import org.artoolkit.ar.base.ARActivity;
import org.artoolkit.ar.base.rendering.ARRenderer;

public class MainActivity extends ARActivity{

    @Override
    protected ARRenderer supplyRenderer() {
        return new NFTRenderer();
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return (FrameLayout)findViewById(R.id.mainLayout);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
