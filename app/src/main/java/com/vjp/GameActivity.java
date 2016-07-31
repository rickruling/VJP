package com.vjp;

import org.andengine.engine.Engine;
import org.andengine.engine.LimitedFPSEngine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.WakeLockOptions;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

import java.io.IOException;

public class GameActivity extends BaseGameActivity {

    private BoundCamera camera;

    // #1
    public EngineOptions onCreateEngineOptions()
    {
        camera = new BoundCamera(0, 0, 480, 800);
        EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED,
                new FillResolutionPolicy(),camera);
        engineOptions.getAudioOptions().setNeedsMusic(true).setNeedsSound(true);
        engineOptions.getRenderOptions().getConfigChooserOptions().setRequestedMultiSampling(true);
        engineOptions.setWakeLockOptions(WakeLockOptions.SCREEN_ON);
        return engineOptions;
    }

    // #2
    @Override
    public Engine onCreateEngine(EngineOptions pEngineOptions)
    {
        return new LimitedFPSEngine(pEngineOptions, 60);
    }

    // #3
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws IOException
    {
        pOnCreateResourcesCallback.onCreateResourcesFinished();
    }

    // #4
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws IOException
    {
    }

    //#5
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws IOException
    {

    }


    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        System.exit(0);
    }
}
