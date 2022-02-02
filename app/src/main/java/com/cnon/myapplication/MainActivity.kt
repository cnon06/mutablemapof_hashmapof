package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  var hmap = hashMapOf("sinan" to "alagöz", "kemal" to "sunal", "barış" to "manço", "cem" to "karaca")
        var hmap = mutableMapOf("sinan" to "alagöz", "kemal" to "sunal", "barış" to "manço", "cem" to "karaca")
        for(i in hmap.keys) println(i+" "+hmap.get(i))
        println("..........................................................")
       // for(i in hmap.values) println(i+" "+hmap.)

        hmap.put("ebe","übü")
        for(i in hmap.keys) println(i+" "+hmap.get(i))
        println("..........................................................")

        hmap.remove("ebe")
        for(i in hmap) println(i.key+" "+i.value) //println(i+" "+hmap.get(i))
        println("..........................................................")

      hmap.set("barış","akarsu")
        for(i in hmap) println(i.key+" "+i.value) //println(i+" "+hmap.get(i))
        println("..........................................................")



    }
}