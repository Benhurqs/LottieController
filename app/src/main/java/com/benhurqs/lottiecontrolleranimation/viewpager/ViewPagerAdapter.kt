package com.benhurqs.lottiecontrolleranimation.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.benhurqs.lottiecontrolleranimation.R
import kotlinx.android.synthetic.main.viewpager_item.view.*

class ViewPagerAdapter(val context: Context, val numPages: Int) : PagerAdapter(){
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return `object` === view
    }

    override fun getCount(): Int {
        return numPages
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.viewpager_item, container , false)
        view.page.text = position.toString()

        container.addView(view)
        return view
    }
}