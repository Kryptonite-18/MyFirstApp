package com.example.stonepaperscissor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val letsPlay:Button=findViewById(R.id.btnLetsPlay)
        letsPlay.setOnClickListener(){
            val options=listOf("Stone","Paper","Scissor","Scissor1","Paper1","Stone1","Scissor2","Stone2","Paper2")
            val scissor=Game(options)
            val paper=Game(options)
            val ashu=paper.randomChoice()

            val imageView1:ImageView=findViewById(R.id.imageView)
            when(ashu){
                "Stone"->imageView1.setImageResource(R.drawable.stone)
                "Paper"->imageView1.setImageResource(R.drawable.paper)
                "Scissor"->imageView1.setImageResource(R.drawable.scissors1)
                "Scissor1"->imageView1.setImageResource(R.drawable.scissor2)
                "Scissor3"->imageView1.setImageResource(R.drawable.scissor3)
                "Stone1"->imageView1.setImageResource(R.drawable.rock1)
                "Stone2"->imageView1.setImageResource(R.drawable.rock2)
                "Paper1"->imageView1.setImageResource(R.drawable.paper1)
                "Paper2"->imageView1.setImageResource(R.drawable.paper2)




            }
            val aadi=scissor.randomChoice()
            val imageView2:ImageView=findViewById(R.id.imageView3)
            when(aadi){
                "Stone"->imageView2.setImageResource(R.drawable.stone)
                "Paper"->imageView2.setImageResource(R.drawable.paper)
                "Scissor"->imageView2.setImageResource(R.drawable.scissors1)
                "Scissor1"->imageView2.setImageResource(R.drawable.scissor2)
                "Scissor3"->imageView2.setImageResource(R.drawable.scissor3)
                "Stone1"->imageView2.setImageResource(R.drawable.rock1)
                "Stone2"->imageView2.setImageResource(R.drawable.rock2)
                "Paper1"->imageView2.setImageResource(R.drawable.paper1)
                "Paper2"->imageView2.setImageResource(R.drawable.paper2)
            }

        }
    }

    class Game(private val list:List<String>){
        fun randomChoice():String{
            return list.random()
        }
    }
}