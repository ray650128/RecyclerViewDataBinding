package com.ray650128.recyclerviewdatabinding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.ray650128.recyclerviewdatabinding.model.ItemModel


class DataAdapter(
    private var mContext: Context,
    private var mLayoutId: Int,
    private var mVarId: Int,
    private var mData: ArrayList<ItemModel>
) : RecyclerView.Adapter<DataAdapter.DataBindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindingViewHolder {
        return DataBindingViewHolder(
            LayoutInflater.from(mContext).inflate(mLayoutId, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DataBindingViewHolder, position: Int) {
        val binding = DataBindingUtil.bind<ViewDataBinding>(holder.itemView)
        val data = mData[position]

        binding!!.setVariable(mVarId, data)
        binding.executePendingBindings()
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    inner class DataBindingViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView)
}
