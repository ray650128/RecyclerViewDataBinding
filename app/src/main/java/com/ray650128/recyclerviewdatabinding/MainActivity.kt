package com.ray650128.recyclerviewdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ray650128.recyclerviewdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingView: ActivityMainBinding
    private lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingView = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModel(this)
        bindingView.viewModel = viewModel
    }
}
