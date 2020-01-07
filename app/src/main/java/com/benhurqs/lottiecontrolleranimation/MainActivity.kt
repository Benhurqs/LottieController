package com.benhurqs.lottiecontrolleranimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.benhurqs.lottiecontrolleranimation.buttons.ButtonsActivity
import com.benhurqs.lottiecontrolleranimation.loading.LoadingActivity
import com.benhurqs.lottiecontrolleranimation.viewpager.PagerActivity
import com.benhurqs.lottiecontrolleranimation.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickPages(v: View){
        startActivity(Intent(this, PagerActivity::class.java))
    }

    fun onClickButtons(v: View){
        startActivity(Intent(this, ButtonsActivity::class.java))
    }

    fun onClickLoading(v: View){
        startActivity(Intent(this, LoadingActivity::class.java))
    }
}
