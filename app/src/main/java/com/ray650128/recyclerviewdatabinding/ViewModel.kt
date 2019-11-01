package com.ray650128.recyclerviewdatabinding

import androidx.databinding.BaseObservable
import androidx.recyclerview.widget.LinearLayoutManager
import com.ray650128.recyclerviewdatabinding.model.ItemModel

class ViewModel(activity: MainActivity) : BaseObservable() {

    private var adapter: DataAdapter
    private var dataList: ArrayList<ItemModel> = arrayListOf()

    init {
        // 生成假資料
        for (i in 0 until 10) {
            val item = ItemModel()
            item.title = "測試$i"
            dataList.add(item)
        }

        // 初始化 Adapter
        adapter = DataAdapter(activity, R.layout.item_content, BR.item, dataList)

        // 套用至 RecyclerView
        with(activity.bindingView.recyclerView) {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            adapter = this@ViewModel.adapter
        }
    }

}
