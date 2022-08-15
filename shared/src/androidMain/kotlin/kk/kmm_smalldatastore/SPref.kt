package kk.kmm_smalldatastore

import android.app.Activity
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

actual typealias SPref = Activity

actual fun SPref.getOnBoard(key: String) : Int {
    val prefs: SharedPreferences = this.getSharedPreferences("", MODE_PRIVATE)
    return prefs.getInt(key , -1)
}
actual fun SPref.setOnBoard(key: String, value: Int) {
    val prefs: SharedPreferences = this.getSharedPreferences("", MODE_PRIVATE)
    val editor = prefs.edit()
    editor.putInt(key,value)
    editor.apply()
}

actual fun SPref.getNightMode(key: String) : Int {
    val prefs: SharedPreferences = this.getSharedPreferences("", MODE_PRIVATE)
    return prefs.getInt(key , -1)
}
actual fun SPref.setNightMode(key: String, value: Int) {
    val prefs: SharedPreferences = this.getSharedPreferences("", MODE_PRIVATE)
    val editor = prefs.edit()
    editor.putInt(key,value)
    editor.apply()
}
