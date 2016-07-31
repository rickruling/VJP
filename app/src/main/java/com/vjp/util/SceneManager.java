package com.vjp.util;

import android.util.Log;

import com.vjp.scene.BaseScene;
import com.vjp.scene.SplashScene;

import org.andengine.ui.IGameInterface;

/**
 * Created by vishnu on 7/31/2016.
 */
public class SceneManager {

    public BaseScene splashScene;

    private static final SceneManager INSTANCE = new SceneManager();

    public static SceneManager getInstance()
    {
        return INSTANCE;
    }

    public void createSplashScene(IGameInterface.OnCreateSceneCallback pOnCreateSceneCallback)
    {
        splashScene = new SplashScene();
        pOnCreateSceneCallback.onCreateSceneFinished(splashScene);
        Log.d("##SM","splash scene created");
    }

    private void disposeScene(BaseScene scene)
    {
        scene.disposeScene();

    }
}
