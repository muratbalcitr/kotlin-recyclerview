package com.murat.kotlinrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val animals: ArrayList<UserModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = addAnimals()
        // recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        recyclerView.adapter = AdapterModel(list as ArrayList<UserModel>, this)
    }

    fun addAnimals(): MutableList<UserModel> {
        val user = mutableListOf(
            UserModel("dog", "ded"),
            UserModel("dog1", "dsdfged"),
            UserModel("dog2", "dsdgfed"),
            UserModel("dog3", "desdfgd"),
            UserModel("dog5", "dsdfged"),
            UserModel("dog6", "dsdfged"),
            UserModel("dog8", "dsdgfed"),
            UserModel("dog6", "fgsdfg"),
            UserModel("dogewrt", "sdfg"),
            UserModel("dogrtwe", "desdfgd"),
            UserModel("dosdfgsdfg", "desdfgd"),
            UserModel("dosdfgg", "dsdfged"),
            UserModel("dosdfgg", "desdfgd"),
            UserModel("dossfdgsdfg", "dsdfged"),
            UserModel("dogsdfgsdg", "ddfsgsed"),
            UserModel("dfgsdfgog", "dedfgsdfgd"),
            UserModel("dsdfgog", "desdfgsdfgd"),
            UserModel("dosdfgg", "ddfgsdfged"),
            UserModel("dsdfgg", "desdfgsdfgd"),
            UserModel("dsdfgog", "sdfgsdfgsdf")
        )

        return user
    }
}
