package com.yj.demo.translationdemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(tool_bar)
        supportActionBar?.run {
            title="转场动画"
        }
        tv_one.setOnClickListener {
            val intent = Intent(this, TranslationOneActivity::class.java)
            startActivity(intent,ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle())
        }
        tv_two.setOnClickListener {
            startActivity(Intent(this,TranslationTwoActivity::class.java))
        }
        tv_three.setOnClickListener {
            startActivity(Intent(this,TranslationThreeActivity::class.java))
        }
        tv_four.setOnClickListener {
            val intent = Intent(this, TranslationFourActivity::class.java)
            startActivity(intent,ActivityOptionsCompat.makeSceneTransitionAnimation(this,Pair(tv_four,"tool_bar")).toBundle())
        }
    }
}
