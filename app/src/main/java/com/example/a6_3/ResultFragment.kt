package com.example.a6_3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a6_3.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    private lateinit var dataFromMusicFragment: Music
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            dataFromMusicFragment=arguments?.getSerializable("txt") as Music
            tvNameMusic.text=dataFromMusicFragment.nameMusic
            tvNameAvtor.text=dataFromMusicFragment.nameAvtor
            tvTimeMusic.text=dataFromMusicFragment.timeMusic
        }
    }
     }

