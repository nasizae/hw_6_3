package com.example.a6_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.a6_3.databinding.FragmentMusicBinding
import com.example.a6_3.databinding.ItemMusicBinding

class MusicViewAdapter( var musicList: ArrayList<Music>,  val onItemClick:(position:Int) -> Unit ):
    RecyclerView.Adapter<MusicViewAdapter.MusicHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicHolder {
        return MusicHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MusicHolder, position: Int) {
        holder.Bind(musicList[position])
    }

    override fun getItemCount()=musicList.size

    inner class MusicHolder(private var binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root) {
            fun Bind(music: Music){
                val item=musicList[adapterPosition]
                binding.apply {
                    tvNameMusic.text=item.nameMusic
                    tvNameAvtor.text=item.nameAvtor
                    tvTimeMusic.text=item.timeMusic

                }
                itemView.setOnClickListener {
                    onItemClick(adapterPosition)

                }
            }
    }
}