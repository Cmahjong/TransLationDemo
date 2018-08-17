package com.yj.demo.translationdemo.extension

import android.view.View
import android.view.ViewGroup

/**
 * desc:
 * time: 2018/8/16
 * @author yinYin
 */

fun ViewGroup.showAllView(){
    for (i in 0 until childCount) {
        getChildAt(i).apply {
            visibility=View.VISIBLE
        }
    }
}