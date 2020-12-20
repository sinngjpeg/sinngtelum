package com.sinngjpeg.sinngtelum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class TweetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweet)

        val botao = findViewById<Button>(R.id.criar_tweet)
        botao.setOnClickListener(View.OnClickListener { publicaTweet }))

        private fun publicaTweet() {
            Log.i("Tweet", "botao clicado")
        }

    }
}