package com.deitel.progress_terra_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import java.util.ArrayList

class myAdapter(private val ct: Context, resource: Int, objects: List<Bonus>) :
    ArrayAdapter<Bonus?>(ct, resource, objects) {

    private val arr: ArrayList<Bonus>

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if (convertView == null) {
            val i = ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = i.inflate(R.layout.myitem, null)
        }
        if (arr.size > 0) {
            val bonus = arr[position]
        }
        return convertView!!
    }

    init {
        arr = ArrayList(objects)
    }
}