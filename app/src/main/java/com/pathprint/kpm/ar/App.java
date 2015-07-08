package com.pathprint.kpm.ar;

import android.app.Application;

import org.artoolkit.ar.base.assets.AssetHelper;

/**
 * Created by TaoHuang on 7/8/2015.
 */
public class App extends Application{

    private static Application sInstance;

    public static Application getInstance(){
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        ((App)sInstance).initializeInstance();
    }

    protected void initializeInstance(){
        AssetHelper assetHelper = new AssetHelper(getAssets());
        assetHelper.cacheAssetFolder(getInstance(),"Data");
        assetHelper.cacheAssetFolder(getInstance(),"DataNFT");
    }
}
