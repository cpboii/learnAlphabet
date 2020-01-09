package com.example.learnalphabet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_alphabet_list.view.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<alphabetList> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return listViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_alphabet_list, parent, false)
        )


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){

            is listViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<alphabetList>){
        items = blogList
    }

class listViewHolder constructor(
    itemView: View
): RecyclerView.ViewHolder(itemView){

    val alp_image = itemView.alp_image
    val alp_title = itemView.alp_title
    val words = itemView.words

    fun bind(alphabetList: alphabetList){

        val requestOptions = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        Glide.with(itemView.context)
            .applyDefaultRequestOptions(requestOptions)
            .load(alphabetList.image)
            .into(alp_image)
        alp_title.setText(alphabetList.title)
        words.setText(alphabetList.word)
    }

}




}