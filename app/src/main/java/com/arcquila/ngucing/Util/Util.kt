package com.arcquila.ngucing.Util

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.ViewTarget

object Util {

    fun loadImage(context: Context, view: ImageView, image: Any ): ViewTarget<ImageView,Drawable>{
        return Glide.with(context).load(image).into(view)
    }
}