package jp.s64.example.android.minimumsupportlibraryapp

import android.app.Activity
import android.os.Bundle

class MyActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity)
    }

}
