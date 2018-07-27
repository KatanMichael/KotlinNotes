package com.michaelkatan.kotlinnotes

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.michaelkatan.kotlinnotes.classes.Note

class NotesAdapter(val noteList: ArrayList<Note>)
    :RecyclerView.Adapter<NotesAdapter.NoteViewHolder>()

{
    override fun onCreateViewHolder(parant: ViewGroup, p1: Int): NoteViewHolder
    {
        val view = LayoutInflater.from(parant.context).inflate(R.layout.note_body,parant,false)


        return NoteViewHolder(view)
    }

    override fun getItemCount(): Int
    {
        return noteList.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int)
    {
        val note = noteList[position]
        holder.noteText.text = note.text
    }



    inner class NoteViewHolder(val myView: View) : RecyclerView.ViewHolder(myView)
    {
        val noteText: TextView = myView.findViewById(R.id.note_tv)
    }


}