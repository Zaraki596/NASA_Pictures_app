package com.droidplusplus.nasapicturesapp.ui.detail_screen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.droidplusplus.nasapicturesapp.R
import com.droidplusplus.nasapicturesapp.data.model.NasaResponse
import kotlinx.android.synthetic.main.row_item_detail.view.*

class DetailsAdapter :
    ListAdapter<NasaResponse, DetailsAdapter.NasaViewHolder>(NasaResponseDC()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NasaViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item_detail, parent, false)
    )

    override fun onBindViewHolder(holder: NasaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    fun swapData(data: List<NasaResponse>?) {
        submitList(data?.toMutableList())
    }

    inner class NasaViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: NasaResponse) = with(itemView) {
            tvTitle.text = item.title
            tvDate.text = item.date
            //Handle null check to make the view gone
            item.copyright?.let {
                tvCopyright.text = it
            } ?: kotlin.run { tvCopyright.visibility = View.GONE }
            tvDetails.text = item.explanation
            Glide.with(this).load(item.imageUrl).placeholder(CircularProgressDrawable(itemView.context).apply {
                strokeWidth = 10f
                centerRadius = 80f
                start()
            })
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
