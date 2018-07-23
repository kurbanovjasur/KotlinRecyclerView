package com.example.jasur.bashkotlin

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.jasur.kotlinrecyclerview.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val animalList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)

       //adding animalList
        addAnimals()

        recyclerView.adapter = AnimalAdapter(animalList, this)
        recyclerView.setBackgroundColor(Color.GREEN)
    }

    fun addAnimals(){
        animalList.add("dog")
        animalList.add("cat")
        animalList.add("owl")
        animalList.add("cheetah")
        animalList.add("raccoon")
        animalList.add("bird")
        animalList.add("snake")
        animalList.add("lizard")
        animalList.add("hamster")
        animalList.add("bear")
        animalList.add("lion")
        animalList.add("tiger")
        animalList.add("horse")
        animalList.add("frog")
        animalList.add("fish")
        animalList.add("shark")
        animalList.add("turtle")
        animalList.add("elephant")
        animalList.add("cow")
        animalList.add("beaver")
        animalList.add("bison")
        animalList.add("porcupine")
        animalList.add("rat")
        animalList.add("mouse")
        animalList.add("goose")
        animalList.add("deer")
        animalList.add("fox")
        animalList.add("moose")
        animalList.add("buffalo")
        animalList.add("monkey")
        animalList.add("penguin")
        animalList.add("parrot")
    }
}
