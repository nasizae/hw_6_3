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
    private var resultFragment:ResultFragment = ResultFragment()
    private  var bundle: Bundle= Bundle()
    private  var musicList= ArrayList<Music>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentMusicBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        val musicViewAdapter= MusicViewAdapter(musicList,this::onItemClick)
        binding.rvMusic.adapter=musicViewAdapter

    }
    private fun onItemClick(position:Int){
        bundle.putSerializable("txt",musicList[position])
        resultFragment.arguments=bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,resultFragment).addToBackStack(null).commit()
    }
    private fun loadData() {
        musicList.add(Music("Pass Out","Tinie Tempah","3:57"))
        musicList.add(Music("We dance on","N-Dubz","3:06"))
          musicList.add(Music("Work It Out","Lighbulb Theives","3:33"))
            musicList.add(Music("Tiny Dancer","Ironik","3:23"))
            musicList.add(Music("Strong Again","N-Dubz","3:14"))
            musicList.add(Music("Live fo the moment","Pixie Lott","2:47"))
            musicList.add(Music("Candy","Aggro Santos","3:00"))
            musicList.add(Music("Beggin","Madcon","3:35"))
            musicList.add(Music("Champion Sound","Fatboy Slim","2:55"))
            musicList.add(Music("live is Beatiful","Vega4","4:34"))

    }


}
