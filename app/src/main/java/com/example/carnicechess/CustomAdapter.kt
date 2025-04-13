package com.example.carnicechess

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(
    private val context: Context,
    private val items: List<String>
) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    // This method returns the view for each list row.
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // Use a ViewHolder pattern for performance
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = inflater.inflate(R.layout.list_history, parent, false)
            viewHolder = ViewHolder(view.findViewById(R.id.textViewItem))
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        // Bind data: setting the text for the TextView
        viewHolder.textView.text = items[position]
        return view
    }

    private data class ViewHolder(val textView: TextView)
}
