package com.michaelkatan.kotlinnotes.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.michaelkatan.kotlinnotes.adapters.NotesAdapter
import com.michaelkatan.kotlinnotes.R
import com.michaelkatan.kotlinnotes.classes.Note
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment(): Fragment(),View.OnClickListener
{

    val noteList : ArrayList<Note> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view: View
        view = inflater.inflate(R.layout.main_fragment,container,false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {

        val noteAdapter = NotesAdapter(noteList, this)

        frag_recyclerView.adapter = noteAdapter
        frag_recyclerView.layoutManager = LinearLayoutManager(context)


        frag_note_btn.setOnClickListener()
        {
            if(frag_note_ET.text.toString().equals(""))
            {
            }else
            {
                noteList.add(Note(frag_note_ET.text.toString()))

                noteAdapter.notifyDataSetChanged()
            }
        }


    }

    override fun onClick(view: View?)
    {
        val tv = view as TextView

        when(view?.id)
        {
            R.id.note_tv -> {Toast.makeText(context,tv.text, Toast.LENGTH_SHORT).show()}
        }
    }

}