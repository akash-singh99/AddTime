package com.example.addtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Addbtn=findViewById<Button>(R.id.Addbtn)
        val HH1=findViewById<EditText>(R.id.HH1)
        val MM1=findViewById<EditText>(R.id.MM1)
        val SS1=findViewById<EditText>(R.id.SS1)
        val HH2=findViewById<EditText>(R.id.HH2)
        val MM2=findViewById<EditText>(R.id.MM2)
        val SS2=findViewById<EditText>(R.id.SS2)
        val HH3=findViewById<TextView>(R.id.HH3)
        val MM3=findViewById<TextView>(R.id.MM3)
        val SS3=findViewById<TextView>(R.id.SS3)
        
        Addbtn.setOnClickListener {
            val a=HH1.text.toString().toInt()
            val b=HH2.text.toString().toInt()
            val c=MM1.text.toString().toInt()
            val d=MM2.text.toString().toInt()
            val e=SS1.text.toString().toInt()
            val f=SS2.text.toString().toInt()
            if(a>23|| b>23 || c>59||d>59 || e>59||f>59 || a==0 ||b==0 ||c==0 || d==0|| e==0 || f==0){
                Toast.makeText(this, "Please Enter Right Time", Toast.LENGTH_SHORT).show()
            }else{
                var ss=e+f
                var mm=c+d+ss/60
                var hh=a+b+mm/60
                ss %= 60
                mm%=60
                hh%=24
                HH3.text=abs(hh).toString()
                MM3.text=mm.toString()
                SS3.text=ss.toString()
            }
        }
    }
}