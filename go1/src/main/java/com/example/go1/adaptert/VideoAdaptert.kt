package com.example.go1.adaptert

import android.view.View
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.VideoData

class VideoAdaptert:BaseMultiItemQuickAdapter<VideoData,BaseViewHolder>() {

    init {
        addItemType(20, R.layout.it_pt)
        addItemType(21, R.layout.it_zbj)
        addItemType(22, R.layout.it_qp)
    }

    override fun convert(helper: BaseViewHolder, item: VideoData) {
        val gsy = helper.getView<com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer>(R.id.gsy)
        gsy.backButton.visibility = View.GONE
        gsy.setUp(item.videopath, true, "")

        helper.setText(R.id.tv_name, item.description)
        helper.setText(R.id.tv_zp, "${item.title}作品")
        Glide.with(context).load(item.avatar_url).circleCrop().into(helper.getView(R.id.im_t))

        if (item.itemType == 20||item.itemType==22){
            Glide.with(context).load(item.avatar_url).circleCrop().into(helper.getView(R.id.im_w))
            helper.setText(R.id.tv_xh,"3.5W")
            helper.setText(R.id.tv_pl,"3.5W")
            helper.setText(R.id.tv_sc,"3.5W")
            helper.setText(R.id.tv_fx,"3.5W")
        }
    }
}