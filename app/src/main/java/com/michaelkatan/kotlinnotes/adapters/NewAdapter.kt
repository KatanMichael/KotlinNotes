package com.michaelkatan.kotlinnotes.adapters

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.michaelkatan.kotlinnotes.R
import com.michaelkatan.kotlinnotes.classes.Note

class NewAdapter : ListAdapter<Note, NewAdapter.ItemViewholder>(DiffCallback())
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder
    {
        return ItemViewholder(
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.note_body, parent, false)
        )
    }

    override fun onBindViewHolder(holder: NewAdapter.ItemViewholder, position: Int) {
        holder.bind(getItem(position))
    }

    class ItemViewholder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(item: Note) = with(itemView)
        {
            // TODO: Bind the data with View

            setOnClickListener()
            {
                // TODO: Handle on click
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Note>()
{
    override fun areItemsTheSame(p0: Note, p1: Note): Boolean
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun areContentsTheSame(p0: Note, p1: Note): Boolean
    {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}