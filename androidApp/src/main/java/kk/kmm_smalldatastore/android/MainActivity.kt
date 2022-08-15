package kk.kmm_smalldatastore.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kk.kmm_smalldatastore.Greeting
import android.widget.TextView
import kk.kmm_smalldatastore.ConstantItem.kOnboard
import kk.kmm_smalldatastore.LocalStorage

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LocalStorage(this).putOnbord(kOnboard,1)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
