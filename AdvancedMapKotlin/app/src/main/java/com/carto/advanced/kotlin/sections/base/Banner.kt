package com.carto.advanced.kotlin.sections.base

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.carto.advanced.kotlin.utils.Colors

/**
 * Created by aareundo on 11/07/2017.
 */
class Banner(context: Context) : BaseView(context) {

    val label: TextView = TextView(context)

    init {
        val drawable = GradientDrawable()
        drawable.setColor(Colors.transparentGray)
        background = drawable

        visibility = View.GONE

        label.setTextColor(Color.WHITE)
        label.gravity = Gravity.CENTER
        label.typeface = Typeface.DEFAULT_BOLD

        addView(label)
    }

    override fun layoutSubviews() {
        super.layoutSubviews()
        label.setFrame(0, 0, frame.width, frame.height)
    }

    fun setText(text: String) {
        label.text = text
        visibility = View.VISIBLE
    }
}