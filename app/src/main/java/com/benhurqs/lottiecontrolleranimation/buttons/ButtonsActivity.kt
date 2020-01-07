package com.benhurqs.lottiecontrolleranimation.buttons

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.benhurqs.lottiecontrolleranimation.R
import kotlinx.android.synthetic.main.activity_buttons.*

class ButtonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)
    }


    fun startAnimation(v: View){
        (v as LottieAnimationView).playAnimation()
    }
}
