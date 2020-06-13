package com.androindian.togglekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked==false){
                Toast.makeText(this@MainActivity,"TOFF",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@MainActivity,"TON",Toast.LENGTH_LONG).show()
            }
        }
    }
}
