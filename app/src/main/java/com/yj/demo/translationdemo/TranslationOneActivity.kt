package com.yj.demo.translationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionManager
import android.transition.TransitionSet
import android.view.Gravity
import android.view.MenuItem
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import com.yj.demo.translationdemo.extension.showAllView
import kotlinx.android.synthetic.main.activity_translation_one.*

class TranslationOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation_one)
        setSupportActionBar(tool_bar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.title="TranslationOneActivity"
//        TransitionManager.beginDelayedTransition(root,TransitionSet().apply {
//            addTransition(Slide(Gravity.START))
//                    .addTarget(ll_functions)
//            duration=800
//            interpolator = AnticipateOvershootInterpolator(1f)
//        })
//        ll_functions.showAllView()
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
