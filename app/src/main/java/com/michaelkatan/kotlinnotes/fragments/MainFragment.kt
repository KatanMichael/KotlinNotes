package com.michaelkatan.kotlinnotes.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.michaelkatan.kotlinnotes.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment(): Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view: View
        view = inflater.inflate(R.layout.main_fragment,container,false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {


        frag_note_btn.setOnClickListener()
        {
            //TODO Add New Note to the adapter
        }


    }

}