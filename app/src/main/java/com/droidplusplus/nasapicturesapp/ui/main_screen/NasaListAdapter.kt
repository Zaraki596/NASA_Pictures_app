package com.droidplusplus.nasapicturesapp.ui.main_screen

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.droidplusplus.nasapicturesapp.R
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse
import kotlinx.android.synthetic.main.row_item_list.view.*

class NasaListAdapter :
    ListAdapter<NasaResponse, NasaListAdapter.NasaViewHolder>(NasaResponseDC()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NasaViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item_list, parent, false)
    )

    override fun onBindViewHolder(holder: NasaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun swapData(data: List<NasaResponse>?) {
        submitList(data?.toMutableList())
    }

    inner class NasaViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView), OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

            if (adapterPosition == RecyclerView.NO_POSITION) return

            val clicked = getItem(adapterPosition)
        }

        fun bind(item: NasaResponse) = with(itemView) {
            tvTitle.text = item.title
            Glide.with(this).load(item.imageUrl).placeholder(android.R.drawable.ic_menu_upload)
                .into(ivItemImage)
        }
    }

    private class NasaResponseDC : DiffUtil.ItemCallback<NasaResponse>() {
        override fun areItemsTheSame(
            oldItem: NasaResponse,
            newItem: NasaResponse
        ): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(
            oldItem: NasaResponse,
            newItem: NasaResponse
        ): Boolean {
            return oldItem == newItem
        }
    }

}
