package jaira.cabarrubias.com.recipelist.user.recipelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

     lateinit var layoutManager: LinearLayoutManager
     lateinit var items: ArrayList<Items>
     lateinit var itemAdapter: ItemAdapter
     lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        functions()

    }


    fun functions() {
        recyclerView = findViewById(R.id.recyclerview)
        items = RecipeDetails.list
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        itemAdapter = ItemAdapter(this@MainActivity, items)
        recyclerView.adapter = itemAdapter
    }


}

