package com.yj.demo.translationdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.*
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_translation_three.*


class TranslationThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation_three)
        val scene1 = Scene.getSceneForLayout(base, R.layout.contet_scene_one, this)
        val scene2 = Scene.getSceneForLayout(base, R.layout.contet_scene_two, this)
        val scene3 = Scene.getSceneForLayout(base, R.layout.contet_scene_three, this)

        anim_1.setOnClickListener {
            TransitionManager.go(scene2, TransitionSet().apply {
                addTransition(ChangeBounds())
                duration = 1000
            })
        }
        anim_2.setOnClickListener {
            TransitionManager.go(scene3, TransitionSet().apply {
                addTransition(ChangeBounds())
                duration = 1000
            })
        }
        anim_3.setOnClickListener {
            TransitionManager.go(scene1, TransitionSet().apply {
                addTransition(ChangeBounds())
                duration = 1000
            })
        }
        anim_4.setOnClickListener {
            TransitionManager.beginDelayedTransition(base,ChangeBounds().apply {
                duration=1000
            })
            findViewById<ImageButton>(R.id.btn1).scaleX=1.2f
            findViewById<ImageButton>(R.id.btn1).scaleY=1.2f

        }


    }
}
