package com.thebaileybrew.jurassictourguide;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class GlideHelper {

    private GlideHelper() {}

    public static void loadDinosaursImage(ImageView image, dinosaur dino) {
        Glide.with(image.getContext().getApplicationContext())
                .load(dino.getDinosaurResource())
                .dontAnimate()
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(image);
    }

}
