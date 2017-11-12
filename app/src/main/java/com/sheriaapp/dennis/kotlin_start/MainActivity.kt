package com.sheriaapp.dennis.kotlin_start

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import butterknife.Bind

class MainActivity : AppCompatActivity(), View.OnClickListener{
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//This will be for clicking
    override fun onClick(p0: View?) {

    }


}
