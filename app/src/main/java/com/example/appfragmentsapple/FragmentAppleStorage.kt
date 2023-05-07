package com.example.appfragmentsapple

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import com.example.appfragmentsapple.databinding.FragmentApplesStorageBinding


class FragmentAppleStorage : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentApplesStorageBinding
    var countApplesGet: Int = 0
    var countRedApples =  0
    var countGreenApples = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApplesStorageBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        dataModel.apply {
            countApples.observe(activity as LifecycleOwner) {
                countApplesGet = it
            }
        }.also { it ->
            it.greenApples.observe(activity as LifecycleOwner){
                if (it == true){
                    countGreenApples += countApplesGet
                    binding.textCountGreen.text = countGreenApples.toString()
                }
            }
        }.also { it ->
            it.redApples.observe(activity as LifecycleOwner){
                if (it == true){
                    countRedApples += countApplesGet
                    binding.textCountRed.text = countRedApples.toString()
                }
            }
        }

    }

    companion object {
        fun newInstance() = FragmentAppleStorage()
    }
}