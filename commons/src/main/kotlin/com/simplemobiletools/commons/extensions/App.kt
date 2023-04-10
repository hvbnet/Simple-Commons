package com.simplemobiletools.commons.extensions

import android.app.Application
import com.simplemobiletools.commons.helpers.isNougatPlus
import java.util.*

fun Application.checkUseEnglish() {
    if (baseConfig.useEnglish && !isNougatPlus()) {
        val conf = resources.configuration
        conf.locale = Locale.ENGLISH
        resources.updateConfiguration(conf, resources.displayMetrics)
    }
}

fun Application.setAppLanguage(locale: Locale) {
    if (baseConfig.useEnglish && !isNougatPlus()) {
        val conf = resources.configuration
        conf.locale = locale
        resources.updateConfiguration(conf, resources.displayMetrics)
    }
}
