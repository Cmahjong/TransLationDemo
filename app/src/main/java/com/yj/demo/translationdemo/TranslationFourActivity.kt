package com.yj.demo.translationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_translation_four.*

class TranslationFourActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation_four)
        setSupportActionBar(toolbar)
        supportActionBar?.title="TranslationFourActivity"
    }
}
