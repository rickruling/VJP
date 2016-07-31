package com.vjp.resource;

import android.os.Vibrator;
import android.util.Log;

import com.vjp.GameActivity;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by vishnu on 7/31/2016.
 */
public abstract class BaseResource {
    //basic variables
    private static Engine engine;
    private static BoundCamera camera;
    private static VertexBufferObjectManager vbom;
    protected static GameActivity activity;

    public static void setBaseResource(Engine engine, GameActivity activity, BoundCamera camera,
                                       VertexBufferObjectManager vbom)
    {
        BaseResource.engine = engine;
        BaseResource.activity = activity;
        BaseResource.camera = camera;
        BaseResource.vbom = vbom;
    }

    //abstract classes
    public abstract ITextureRegion getBackground();
    public abstract void loadResources();
    public abstract void unloadResources();

    public static Engine getEngine() {
        return engine;
    }

    public static void setEngine(Engine engine) {
        BaseResource.engine = engine;
    }

    public static BoundCamera getCamera() {
        return camera;
    }

    public static void setCamera(BoundCamera camera) {
        BaseResource.camera = camera;
    }

    public static VertexBufferObjectManager getVbom() {
        return vbom;
    }

    public static void setVbom(VertexBufferObjectManager vbom) {
        BaseResource.vbom = vbom;
    }

    public static GameActivity getActivity() {
        return activity;
    }

    public static void setActivity(GameActivity activity) {
        BaseResource.activity = activity;
    }
}
