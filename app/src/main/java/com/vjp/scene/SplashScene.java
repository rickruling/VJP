package com.vjp.scene;

import com.vjp.resource.SplashResources;

import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.util.GLState;
import org.andengine.util.adt.color.Color;

/**
 * Created by vishnu on 7/31/2016.
 */
public class SplashScene extends BaseScene{

    private Sprite splash;
    private SplashResources resources;

    @Override
    public void createScene() {
        resources =  new SplashResources();
        resources.loadResources();
        Color color = new Color(0, 0, 1f);
        setBackground(new Background(color));
    }

    @Override
    public void onBackKeyPressed() {
        return;
    }


    @Override
    public void disposeScene() {
        splash.detachSelf();
        splash.dispose();
        this.detachSelf();
        this.dispose();
    }

}
