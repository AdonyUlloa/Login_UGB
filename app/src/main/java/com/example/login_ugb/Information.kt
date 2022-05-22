package com.example.login_ugb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class Information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
    }

    //Donde creamos el menu de opciones que los dara la opcion de ver mas informacion del desarrollador
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //Aqui los canbiamos a la actividy Informacion
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.info-> {
                val intent = Intent(this, Principal::class.java)
                startActivity(intent)
                // using finish() to end the activity
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}