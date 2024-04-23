package com.simplecity.amp_library.glide.palette;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

public class ColorSetResource implements Resource<ColorSet> {
    private final ColorSet colorSet;

    public ColorSetResource(@NonNull ColorSet colorSet) {
        this.colorSet = colorSet;
    }

    @Override
    public ColorSet get() {
        return colorSet;
    }

    @Override
    public int getSize() {
        return ColorSet.Companion.estimatedSize();
    }

    @Override
    public void recycle() {
        // Le recyclage n'est pas pris en charge pour cette ressource car elle ne contient pas de ressources externes.
        // la méthode recycle() serait implémentée pour libérer ces ressources.
        throw new UnsupportedOperationException("Le recyclage n'est pas pris en charge pour cette ressource");

    }
}