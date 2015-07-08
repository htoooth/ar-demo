package com.pathprint.kpm.ar;

import org.artoolkit.ar.base.rendering.ARRenderer;
import org.artoolkit.ar.base.rendering.Cube;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by TaoHuang on 7/8/2015.
 */
public class NFTRenderer extends ARRenderer {

    Cube cu = new Cube(10f);
    @Override
    public boolean configureARScene() {
        return super.configureARScene();
    }

    @Override
    public void draw(GL10 gl) {
        cu.draw(gl);
    }
}
