package com.benhurqs.lottiecontrolleranimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import com.benhurqs.lottiecontrolleranimation.viewpager.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numPage = 6
        viewpager.adapter = ViewPagerAdapter(this, numPage)
        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
//                Log.e("Entrei state", "state -> " + state)
            }

            override fun onPageScrolled( position: Int, positionOffset: Float, positionOffsetPixels: Int) {
//                Log.e("Entrei scrooled", "position -> " + position + "offset -> " + positionOffset + "pixes ->" + positionOffsetPixels)
//                lottie.playAnimation()
                Log.e("offset","position - $position , offset = $positionOffset")
                if(positionOffset != 0f){
                    val min: Float = position.toFloat()/numPage
                    var max = (position+1).toFloat()/numPage
                    if(position == numPage - 2){
                        max = 1f
                    }



                    Log.e("min max", "min - $min , max $max")

                    lottie.setMinAndMaxProgress(min, max)
                    lottie.progress = min + positionOffset.toInt()/numPage
                }


            }

            override fun onPageSelected(position: Int) {
//                Log.e("Entrei position","position -> " + position)
//                lottie.pauseAnimation()
            }
        })

//        lottie.progress = 25f
//        managerAnimation()
    }

    fun managerAnimation() {
        lottie.playAnimation()
        lottie.addAnimatorUpdateListener { valueAnimator ->
            // Set animation progress
            val progress = (valueAnimator.animatedValue as Float * 100).toInt()
//            progressTv.text = "Progress: $progress%"

//            if (progress >= 40) {
//                lottie.progress = 0f
//            }
        }
    }
}
