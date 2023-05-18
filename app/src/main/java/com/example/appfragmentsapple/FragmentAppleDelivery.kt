package com.example.appfragmentsapple

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.appfragmentsapple.databinding.FragmentApplesDeliveryBinding

class FragmentAppleDelivery : Fragment() {
    private val dataModel: DataModel by activityViewModels()
    private lateinit var binding: FragmentApplesDeliveryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentApplesDeliveryBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            buttonSend.setOnClickListener {
                if(checkGreenApple.isChecked){
                    dataModel.greenApple.value = true
                    textStatusSending.text = resources.getString(R.string.send_apple)
                }
                else if(checkRedApple.isChecked){
                    dataModel.redApple.value = true
                    textStatusSending.text = resources.getString(R.string.send_apple)
                }
                else {
                    dataModel.greenApple.value = false
                    dataModel.redApple.value = false
                    textStatusSending.text = resources.getString(R.string.no_send_apple)
                    Toast.makeText(activity, resources.getString(R.string.choose_apple), Toast.LENGTH_SHORT).show()
                }
                var countApple = editCount.text.toString()
                when(countApple){
                    "" -> {
                        countApple = "0"
                        Toast.makeText(activity, resources.getString(R.string.input_apple), Toast.LENGTH_SHORT).show()
                    }
                }
                dataModel.countApple.value = countApple.toInt()
            }
        }
    }

    companion object {
        fun newInstance() = FragmentAppleDelivery()
    }
}