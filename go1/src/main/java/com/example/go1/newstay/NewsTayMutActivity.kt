package com.example.go1.newstay

import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.databinding.ActivityNewsTayMutBinding
import com.example.go1.elity.NewsElityTay
import com.umeng.socialize.ShareAction
import com.umeng.socialize.bean.SHARE_MEDIA
import com.umeng.socialize.media.UMWeb


class NewsTayMutActivity : BaseActvity<ActivityNewsTayMutBinding>() {


    override fun getLyout(): Int =R.layout.activity_news_tay_mut

    override fun initView() {
          val news =intent.getSerializableExtra("id") as NewsElityTay.DataDTO.RecordsDTO
          Glide.with(this).load(news.imgurl).into(vie.im)
          vie.tvName.text=news.title
          vie.tvTitle.text=news.content
         vie.fx.setOnClickListener {
             val web = UMWeb("")
             web.title = "This is music title" //标题
             // web.setThumb(thumb);//缩略图
             web.description = "my description" //描述
             ShareAction(this@NewsTayMutActivity)
                 .setDisplayList(SHARE_MEDIA.QQ, SHARE_MEDIA.WEIXIN)
                 .withMedia(web)
                 .open()
         }

        vie.sc.setOnClickListener {
            Toast.makeText(this,"收藏",Toast.LENGTH_SHORT).show()
        }

    }

    override fun initData() {

    }

}