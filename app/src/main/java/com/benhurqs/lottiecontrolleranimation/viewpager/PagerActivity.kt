package com.benhurqs.lottiecontrolleranimation.viewpager

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.benhurqs.lottiecontrolleranimation.R
import kotlinx.android.synthetic.main.activity_pages.*

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pages)

        val numPage = 6
        val steps = 1f/(numPage-1)

        viewpager.adapter = ViewPagerAdapter(this, numPage)
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled( position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                if(positionOffset != 0f){
                    val min: Float = steps*position
                    var max =  steps*(position+1)
                    if(max >= 1){
                        max = 1f
                    }

                    Log.e("min max", "min - $min , max $max")

                    lottie.setMinAndMaxProgress(min, max)
                    lottie.progress = min + positionOffset*steps
                }


            }

            override fun onPageSelected(position: Int) {
            }
        })

    }
}
