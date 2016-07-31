package com.vjp.resource;

import android.util.Log;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;

/**
 * Created by vishnu on 7/31/2016.
 */
public class SplashResources extends BaseResource{

    // Game Texture Regions
    private BitmapTextureAtlas splashTextureAtlas;

    // TEXTURES & TEXTURE REGIONS
    private ITextureRegion splash_region;

    @Override
    public ITextureRegion getBackground() {
        return null;
    }

    @Override
    public void loadResources() {
    }

    @Override
    public void unloadResources() {
    }

    public BitmapTextureAtlas getSplashTextureAtlas() {
        return splashTextureAtlas;
    }

    public void setSplashTextureAtlas(BitmapTextureAtlas splashTextureAtlas) {
        this.splashTextureAtlas = splashTextureAtlas;
    }

    public ITextureRegion getSplash_region() {
        return splash_region;
    }

    public void setSplash_region(ITextureRegion splash_region) {
        this.splash_region = splash_region;
    }
}
