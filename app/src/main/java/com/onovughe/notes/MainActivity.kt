package com.onovughe.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.onovughe.notes.Model.Note
import com.onovughe.notes.Model.NoteDatabase
import com.onovughe.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: NoteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = Room.databaseBuilder(applicationContext, NoteDatabase::class.java "notes_database").build()
    }

    private fun  saveNote(title: String, Content: String){
        val note = Note(id = 0, title, content)
        
    }
}