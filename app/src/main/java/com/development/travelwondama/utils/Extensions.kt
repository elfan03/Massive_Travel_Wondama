package com.development.travelwondama.utils

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URLEncoder

object Extensions {
    fun ImageView.showImageInto(context: Context, url: String) {
        Glide.with(context)
            .load(url)
            .into(this)
    }

    fun openWhatsAppChat(context: Context, toNumber: String, message: String) {
        val url = "https://api.whatsapp.com/send?phone="+ toNumber +"&text=" + URLEncoder.encode(message, "UTF-8")
        try {
            context.packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
            context.startActivity(Intent(Intent.ACTION_VIEW).apply { data = Uri.parse(url) })
        } catch (e: PackageManager.NameNotFoundException) {
            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}