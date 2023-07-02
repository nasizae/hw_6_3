package com.example.a6_3

import android.os.Bundle
import android.util.Log
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
        holder.bind(musicList[position])
    }

    override fun getItemCount(): Int{
        return musicList.size
    }

    inner class MusicHolder(private var binding: ItemMusicBinding) : ViewHolder(binding.root) {
            fun bind(music: Music){

                binding.apply {
                    tvNameMusic.text=music.nameMusic
                    tvNameAvtor.text=music.nameAvtor
                    tvTimeMusic.text=music.timeMusic

                }
                itemView.setOnClickListener {
                    onItemClick(adapterPosition)
                }

            }
    }
}