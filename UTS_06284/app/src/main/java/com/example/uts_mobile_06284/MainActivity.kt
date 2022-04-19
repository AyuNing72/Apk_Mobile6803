package com.example.uts_mobile_06284

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var git2 : RecyclerView
    private val list = ArrayList<Hewan>()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        git2=findViewById(R.id.Hewan1)
        git2.setHasFixedSize(true)

        list.addAll(listHewan)
        showRecyclerList()
    }

    private val listHewan: ArrayList<Hewan>
        get() {
            val dataName = resources.getStringArray(R.array.data_name)
            val dataDescription = resources.getStringArray(R.array.data_description)
            val dataPhoto = resources.obtainTypedArray(R.array.data_photo)

            val listHewan = ArrayList<Hewan>()
            for (i in dataName.indices) {
                val hewan = Hewan(
                    dataName[i],
                    dataDescription[i],
                    dataPhoto.getResourceId(i, -1))
                listHewan.add(hewan)
            }
            return listHewan
        }

    private fun showSelectedHewan(userHewan: Hewan) {
        Toast.makeText(this, "Kamu memilih " + userHewan.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            git2.layoutManager = GridLayoutManager(this, 2)
        } else {
            git2.layoutManager = LinearLayoutManager(this)
        }
        val listHewanAdapter = ListHewanAdapter(list)
        git2.adapter = listHewanAdapter

        listHewanAdapter.setOnItemClickCallback(object : ListHewanAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hewan) {
                showSelectedHewan(data)
            }
        })
    }
}
