package com.nopalyer.koltincalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.nopalyer.koltincalculator.R.*
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_main.*

class HistoryFrag: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_history)

        val bundle= intent.extras
    if(bundle != null) {

        textView1.text = "${bundle.getStringArrayList("History")}"
      }

    }
}