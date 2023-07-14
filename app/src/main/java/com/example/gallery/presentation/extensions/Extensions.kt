package com.example.gallery.presentation.extensions

import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun ImageView.loadImage(url: String) {
    Glide.with(this).load(url).into(this)
}
fun Fragment.showToast(text:String){
    Toast.makeText(requireContext(),text,Toast.LENGTH_SHORT).show()
}
