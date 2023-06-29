package com.example.a6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import java.net.IDN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.poster_Fragment,PosterFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_container,MusicFragment()).commit()
    }


}

