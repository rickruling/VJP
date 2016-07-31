package com.vjp.scene;

import android.app.Activity;

import com.vjp.resource.BaseResource;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by vishnu on 7/31/2016.
 */
public abstract class BaseScene  extends Scene {


    //---------------------------------------------
    // VARIABLES
    //---------------------------------------------

    protected Engine engine;
    protected Activity activity;
    protected VertexBufferObjectManager vbom;
    protected BoundCamera camera;

    //---------------------------------------------
    // CONSTRUCTOR
    //---------------------------------------------

    public BaseScene()
    {
        this.engine = BaseResource.getEngine();
        this.activity = BaseResource.getActivity();
        this.vbom = BaseResource.getVbom();
        this.camera = BaseResource.getCamera();
        createScene();
    }

    //---------------------------------------------
    // ABSTRACTION
    //---------------------------------------------

    public abstract void createScene();
    public abstract void onBackKeyPressed();
    public abstract void disposeScene();
}
