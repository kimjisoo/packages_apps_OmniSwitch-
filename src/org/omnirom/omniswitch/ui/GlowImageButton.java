/*
 *  Copyright (C) 2013 The OmniROM Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.omnirom.omniswitch.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class GlowImageButton extends ImageButton {

    private Drawable mOriginalImage;
    private Drawable mGlowImage;
    
    public GlowImageButton(Context context) {
        super(context);
    }
    
    public GlowImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GlowImageButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    
    public void setOriginalImage(Drawable image){
        mOriginalImage = image;
    }
    
    public Drawable getOriginalImage(){
        return mOriginalImage;
    }
    
    public void setGlowImage(Drawable image){
        mGlowImage = image;
    }

    public Drawable getGlowImage(){
        return mGlowImage;
    }
}