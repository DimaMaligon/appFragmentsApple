package com.example.appfragmentsapple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.activity.viewModels
import com.example.appfragmentsapple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFragment(FragmentAppleDelivery.newInstance(), R.id.frameApples)
        openFragment(FragmentAppleStorage.newInstance(), R.id.frameApplesStorage)
    }

    private fun openFragment(f: Fragment, idHolder: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .commit()
    }
}