package com.deitel.progress_terra_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView


class BlankFragment : Fragment() {

    lateinit var lsvBonus : ListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lsvBonus = view.findViewById(R.id.lsvBonus)
        val arr : ArrayList<Bonus> = ArrayList()
        while (arr.size < 10) {
            arr.add(Bonus())
        }
        val adapter: myAdapter? = activity?.let { myAdapter(it, 0, arr) }
        lsvBonus.adapter = adapter
    }

}