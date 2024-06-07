package com.dicoding.githubuser.data.ui

import android.content.Context
import android.content.SharedPreferences

class ThemePreferences(context: Context) {
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("theme", Context.MODE_PRIVATE)

    fun setDarkModeEnabled(isEnabled: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean("dark_mode", isEnabled)
        editor.apply()
    }

    fun isDarkModeEnabled(): Boolean {
        return sharedPreferences.getBoolean("dark_mode", false)
    }
}