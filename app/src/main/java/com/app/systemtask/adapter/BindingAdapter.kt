package com.app.systemtask.adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide


@BindingAdapter("setText")
fun bindDefaultText(mView: TextView, mText: String?) {
    if (!mText.isNullOrEmpty()) {
        mView.text = mText
    }
}


@BindingAdapter("imageFromUrl")
fun bindImageFromUrl(view: ImageView, imageUrl: String?) {
    if (imageUrl != null) {
        Glide.with(view.context)
            .load(imageUrl)
            //.apply(RequestOptions().circleCrop())
            //.transition(DrawableTransitionOptions.withCrossFade())
            .into(view)
    }
}





