package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class viewPagerAdapter(val images:List<Images>):RecyclerView.Adapter<viewPagerAdapter.viewPagerHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewPagerHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view_pager, parent, false)
        return viewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: viewPagerHolder, position: Int) {
        val currImage = images[position]
        holder.ivImage.setImageResource(currImage.Photo)
        holder.textView.text = images[position].title
        }


    override fun getItemCount(): Int {
        return images.size


    }

    class viewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivImage = itemView.findViewById<ImageView>(R.id.ivImage)
        var textView = itemView.findViewById<TextView>(R.id.textView1)

        init {
            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                when (position) {
                0 ->{val i = Intent(itemView.context,SecondActivity::class.java)
//                    i.putExtra("text",R.drawable.img)
                    itemView.context.startActivity(i)

                }
                    1 ->{val i = Intent(itemView.context,MainActivity3::class.java)
                        itemView.context.startActivity(i)

                    }
                    2 ->{val i = Intent(itemView.context,MainActivity4::class.java)
                        itemView.context.startActivity(i)

                    }
                    3 ->{val i = Intent(itemView.context,SecondActivity::class.java)
                        itemView.context.startActivity(i)

                    }



                    else -> {
                    }
                }
            }
        }
    }
}
