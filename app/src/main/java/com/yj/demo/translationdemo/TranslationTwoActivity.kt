package com.yj.demo.translationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.transition.Scene
import android.transition.Slide
import android.transition.TransitionManager
import android.transition.TransitionSet
import android.view.Gravity
import android.view.MenuItem
import android.view.animation.AnticipateOvershootInterpolator
import com.yj.demo.translationdemo.extension.showAllView
import kotlinx.android.synthetic.main.activity_translation_two.*

class TranslationTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation_two)
        setSupportActionBar(tool_bar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

    }
    override fun onResume() {
        super.onResume()
        TransitionManager.beginDelayedTransition(head,Slide(Gravity.TOP).apply {
            duration = 1000
            interpolator = AnticipateOvershootInterpolator(1f)
        })
        head.showAllView()
        TransitionManager.beginDelayedTransition(ll_all_fun,Slide(Gravity.START).apply {
            duration = 1000
            interpolator = AnticipateOvershootInterpolator(1f)
        })
        ll_all_fun.showAllView()
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home->{
                finishAfterTransition()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
