package com.tx.kotlinstudy.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tx.kotlinstudy.R
//import com.tx.usercenter.ui.activity.RegisterActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startRegisterBtn.setOnClickListener{
//            startActivity<RegisterActivity>()
        }
    }


}
