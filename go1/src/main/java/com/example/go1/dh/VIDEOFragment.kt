package com.example.go1.dh

import android.app.Activity
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.go1.R
import com.example.go1.adaptert.CommentAdaptert
import com.example.go1.adaptert.GiftAdaptert
import com.example.go1.adaptert.VideoAdaptert
import com.example.go1.base.BaseMVVMFraent
import com.example.go1.databinding.FragmentVIDEOBinding
import com.example.go1.play.PayCZActivity
import com.example.go1.video.VideoViewModel
import com.kaisengao.likeview.like.KsgLikeView
import com.umeng.socialize.ShareAction
import com.umeng.socialize.bean.SHARE_MEDIA
import com.umeng.socialize.media.UMWeb


class VIDEOFragment : BaseMVVMFraent<FragmentVIDEOBinding,VideoViewModel>() {

    var iskey =false

    lateinit var videoAdaptert: VideoAdaptert
    lateinit var commentAdaptert: CommentAdaptert
    lateinit var giftAdaptert: GiftAdaptert


    override fun getLyout(): Int =R.layout.fragment_v_i_d_e_o

    override fun getBaset(): Class<VideoViewModel> = VideoViewModel::class.java

    override fun initView() {
         mode.video()
         videoAdaptert= VideoAdaptert()
         vie.rv.layoutManager= LinearLayoutManager(context)
         vie.rv.adapter=videoAdaptert

        val psh =PagerSnapHelper()
        psh.attachToRecyclerView(vie.rv)

        videoAdaptert.addChildClickViewIds(R.id.lay_lw,R.id.lay_pl,R.id.im_gz,R.id.im_xh,R.id.im_pl,R.id.im_sc,R.id.im_fx,R.id.gb,R.id.pl,R.id.qp,R.id.tvgzn,R.id.lw,R.id.fshx,R.id.klv,R.id.tv_cz,R.id.rv_lw,R.id.lwtp,R.id.bt_fs)
        videoAdaptert.setOnItemChildClickListener { adapter, view, position ->
            when(view.id){
                R.id.lay_lw->{
                    mode.sb.value="lay_lw"
                }
                R.id.lay_pl->{
                    mode.sb.value="lay_pl"
                }
                R.id.im_gz->{
                    mode.sb.value="im_gz"
                    gz(position)
                }
                R.id.im_xh->{
                    mode.sb.value="im_xh"
                    xh(position)
                }
                R.id.im_pl->{
                    mode.sb.value="im_pl"
                    pl(position)
                }
                R.id.im_sc->{
                    mode.sb.value="im_sc"
                    sc(position)
                }
                R.id.im_fx->{
                    mode.sb.value="im_fx"
                    fx(position)
                }
                R.id.gb->{
                    mode.sb.value="gb"
                }
                R.id.pl->{
                    mode.sb.value="pl"
                }
                R.id.qp->{
                    mode.sb.value="qp"
                    qp(position)
                }
                R.id.tvgzn->{
                    mode.sb.value="tvgzn"
                    wxgz(position)
                }
                R.id.lw->{
                    mode.sb.value="lw"
                    lw(position)
                }
                R.id.fshx->{
                    mode.sb.value="xh"
                    fshx(position)
                }
                R.id.klv->{
                    mode.sb.value="klv"
                }
            }
        }



    }

    private fun wxgz(position: Int) {
        val gz = videoAdaptert.getViewByPosition(position,R.id.tvgzn) as TextView?
        if (iskey){
            iskey =false
            gz!!.text = "关注"
            Toast.makeText(context,"取消关注",Toast.LENGTH_SHORT).show()
        }else{
            iskey =true
            gz!!.text = "已关注"
            Toast.makeText(context,"关注成功",Toast.LENGTH_SHORT).show()
        }
    }

    private fun fshx(position: Int) {
        val fs = videoAdaptert.getViewByPosition(position,R.id.fshx) as ImageView?
        val klv = videoAdaptert.getViewByPosition(position,R.id.klv) as KsgLikeView?
        fs!!.setOnClickListener {
            klv!!.addLikeImages(R.drawable.baseline_favorite_sc2,R.drawable.baseline_favorite_sc3,R.drawable.baseline_favorite_sc4,R.drawable.baseline_favorite_sc5)
            klv.addFavor()
        }
    }

    private fun lw(position: Int) {
        val lw = videoAdaptert.getViewByPosition(position,R.id.lw) as ImageView?
        val list = videoAdaptert.getViewByPosition(position,R.id.rv_lw) as RecyclerView?
        val lay = videoAdaptert.getViewByPosition(position,R.id.lay_lw) as ConstraintLayout?
        val gb = videoAdaptert.getViewByPosition(position,R.id.gb) as ImageView?
        val cz= videoAdaptert.getViewByPosition(position,R.id.tv_cz) as TextView?
        lw!!.setOnClickListener {
            if (lay != null) {
                lay.visibility = View.VISIBLE
                mode.gift()
                if (list != null) {
                    giftAdaptert= GiftAdaptert()
                    list.layoutManager= GridLayoutManager(context,4)
                    list.adapter=giftAdaptert
                }




            }
            mode.gcg.observe(this){
                if (it.code==200){
                    giftAdaptert.data.clear()
                    giftAdaptert.addData(it.data)
                    giftAdaptert.notifyDataSetChanged()
                }
            }
        }
        gb!!.setOnClickListener {
            if (lay != null) {
                lay.visibility = View.GONE
            }
        }
        cz!!.setOnClickListener {
            Toast.makeText(context,"充值",Toast.LENGTH_SHORT).show()
            startActivity(Intent(context, PayCZActivity::class.java))
        }


    }

    private fun qp(position: Int) {




    }

    private fun fx(position: Int) {
        val fx = videoAdaptert.getViewByPosition(position,R.id.im_fx) as ImageView?
        fx!!.setOnClickListener {
            val web = UMWeb("")
            web.title = "This is music title" //标题
            // web.setThumb(thumb);//缩略图
            web.description = "my description" //描述
            ShareAction(context as Activity?)
                .setDisplayList(SHARE_MEDIA.QQ, SHARE_MEDIA.WEIXIN)
                .withMedia(web)
                .open()
        }

    }



    private fun sc(position: Int) {
         val sc = videoAdaptert.getViewByPosition(position,R.id.im_sc) as ImageView?
        if (iskey){
            iskey =false
            sc!!.setImageResource(R.drawable.baseline_star_sc6)
            Toast.makeText(context,"取消收藏",Toast.LENGTH_SHORT).show()
        }else{
            iskey =true
            sc!!.setImageResource(R.drawable.baseline_star_sc7)
            Toast.makeText(context,"收藏成功",Toast.LENGTH_SHORT).show()
        }
    }

    private fun pl(position: Int) {
        val pl = videoAdaptert.getViewByPosition(position,R.id.im_pl) as ImageView?
        val list = videoAdaptert.getViewByPosition(position,R.id.pl) as RecyclerView?
        val lay = videoAdaptert.getViewByPosition(position,R.id.lay_pl) as ConstraintLayout?
        val gb = videoAdaptert.getViewByPosition(position,R.id.gb) as ImageView?
        pl!!.setOnClickListener {
            if (lay != null) {
                lay.visibility= View.VISIBLE
                mode.comment()
                commentAdaptert = CommentAdaptert()
                list!!.layoutManager= LinearLayoutManager(context)
                list.adapter=commentAdaptert

                mode.ccg.observe(this){
                    if (it.code==200){
                        commentAdaptert.data.clear()
                        commentAdaptert.addData(it.data)
                        commentAdaptert.notifyDataSetChanged()
                    }
                }
            }



        }
        gb!!.setOnClickListener {
            if (lay != null) {
                lay.visibility= View.GONE
            }
        }
    }

    private fun xh(position: Int) {
        val xh = videoAdaptert.getViewByPosition(position,R.id.im_xh) as ImageView?
        if (iskey){
            iskey =false
            xh!!.setImageResource(R.drawable.baseline_favorite_border_sc)
        }else{
            iskey =true
            xh!!.setImageResource(R.drawable.baseline_favorite_sc2)
        }



    }

    private fun gz(position: Int) {
          val gz = videoAdaptert.getViewByPosition(position,R.id.im_gz) as ImageView?
          if (iskey){
              iskey =false
              gz!!.setImageResource(R.drawable.baseline_add_circle_outline_gz)
              Toast.makeText(context,"取消关注",Toast.LENGTH_SHORT).show()
          }else{
              iskey =true
              gz!!.setImageResource(R.drawable.baseline_add_circle_outline_gz1)
              Toast.makeText(context,"关注成功",Toast.LENGTH_SHORT).show()
          }



    }

    override fun initData() {
         mode.cg.observe(this){
             if (it.code==0){
                 videoAdaptert.data.clear()
                 videoAdaptert.data.addAll(it.data)
                 videoAdaptert.notifyDataSetChanged()
             }
         }
    }

}