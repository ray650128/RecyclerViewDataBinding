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

        // 使用 DataBindingUtil 設定 ContentView
        bindingView = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 指派 ViewModel
        viewModel = ViewModel(this)
        bindingView.viewModel = viewModel
    }
}
