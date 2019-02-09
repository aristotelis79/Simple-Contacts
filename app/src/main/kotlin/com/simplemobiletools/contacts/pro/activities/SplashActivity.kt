package com.simplemobiletools.contacts.pro.activities

import android.content.Intent
import com.simplemobiletools.commons.activities.BaseSplashActivity

class SplashActivity : BaseSplashActivity() {
    override fun getAppPackageName() = packageName

    override fun initActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
