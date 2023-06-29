package com.example.a6_3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a6_3.databinding.FragmentMusicBinding
import com.example.a6_3.databinding.ItemMusicBinding


class MusicFragment : Fragment() {

    private lateinit var binding: FragmentMusicBinding
    private lateinit var musicViewAdapter: MusicViewAdapter
    private var resultFragment:ResultFragment = ResultFragment()
    private lateinit var bundle: Bundle
    private  var musicList= arrayListOf(Music("Pass Out","Tinie Tempah","3:57"),
            Music("We dance on","N-Dubz","3:06"),
            Music("Work It Out","Lighbulb Theives","3:33"),
            Music("Tiny Dancer","Ironik","3:23"),
            Music("Strong Again","N-Dubz","3:14"),
            Music("Live fo the moment","Pixie Lott","2:47"),
            Music("Candy","Aggro Santos","3:00"),
            Music("Beggin","Madcon","3:35"),
            Music("Champion Sound","Fatboy Slim","2:55"),
            Music("live is Beatiful","Vega4","4:34"))
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        musicViewAdapter= MusicViewAdapter(musicList,this::onItemClick)
        binding.rvMusic.adapter=musicViewAdapter

    }
    fun onItemClick(position:Int){
        bundle.putSerializable("txt",musicList[position])
        resultFragment.arguments=bundle
    }
}
