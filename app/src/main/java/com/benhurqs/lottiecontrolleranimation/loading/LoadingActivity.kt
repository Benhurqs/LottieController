package com.benhurqs.lottiecontrolleranimation.loading

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieDrawable
import com.benhurqs.lottiecontrolleranimation.R
import kotlinx.android.synthetic.main.activity_loading.*

class LoadingActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        onClickStartLoadingCircular(null)
    }

    fun onClickLoadingCircular(v: View){
        progress_circular.setMinAndMaxProgress(0f, 1f)
        progress_circular.repeatCount = 1
    }

    fun onClickStartLoadingCircular(v: View?){
        progress_circular.setMinAndMaxProgress(20/72f, 34/72f)
        progress_circular.repeatCount = LottieDrawable.INFINITE
        progress_circular.playAnimation()
    }


    ///submit
    fun onClickSubmit(v: View){
        submit.setMinAndMaxProgress(7/95f, 25/95f)
        submit.playAnimation()


        add.visibility = View.VISIBLE
    }


    fun onClickAdd(v: View){
        add.playAnimation()
        addProgress()
    }

    /**
        min = 25/95
        max = 60/95
     */

    val progressMin = 25/95f
    val progressMax = 60/95f
    val propo = (progressMax - progressMin)/100

    fun addProgress(){
        val currentProgress = submit.progress + propo*5
        var lastProgress = currentProgress + propo*10

        if(lastProgress >= progressMax){
            lastProgress = 1f
            add.visibility = View.GONE
        }

        submit.setMinAndMaxProgress(currentProgress, lastProgress)
        submit.playAnimation()

    }


}