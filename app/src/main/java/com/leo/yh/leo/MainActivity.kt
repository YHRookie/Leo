package com.leo.yh.leo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.orhanobut.logger.Logger
import io.reactivex.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.tvHello)
        textView.setTextColor(Color.RED)
        tvHello.setTextSize(20F)
        textView.setOnClickListener(this)
        Logger.e("onCreat")

//        textView.setOnClickListener {
//            Log.d("MainActivity","hello")
//            Toast.makeText(this,"HelloWorld",Toast.LENGTH_SHORT)
//        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            val intent = Intent()
            intent.setClass(this,NewActivity::class.java)
            when (v.id) {
                R.id.tvHello ->
                    startActivities(arrayOf(intent))
            }
        }
    }

}
