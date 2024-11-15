package com.example.go1.elity

data class TagsVideo(
    val `data`: Data,
    val msg: String,
    val ret: Int
)

data class Data(
    val code: Int,
    val info: List<Info>,
    val msg: String
)

data class Info(
    val ad_url: String,
    val addtime: String,
    val addtime_format: String,
    val anyway: String,
    val avatar: String,
    val city: String,
    val classid: String,
    val coin: String,
    val collections: String,
    val comments: String,
    val datetime: String,
    val goods_type: String,
    val goodsid: String,
    val goodsinfo: Goodsinfo,
    val href: String,
    val href_w: String,
    val id: String,
    val is_ad: String,
    val is_userad: String,
    val isattent: String,
    val iscollection: String,
    val isgoods: String,
    val islike: String,
    val ispay: String,
    val label_name: String,
    val labelid: String,
    val lat: String,
    val likes: String,
    val liveinfo: Liveinfo,
    val lng: String,
    val music_id: String,
    val musicinfo: Musicinfo,
    val nopass_time: String,
    val p_add: String,
    val p_expire: String,
    val p_nums: String,
    val reason: String,
    val shares: String,
    val status: String,
    val steps: String,
    val teenagers_switch: String,
    val thumb: String,
    val thumb_s: String,
    val title: String,
    val uid: String,
    val user_nickname: String,
    val userad_url: String,
    val userinfo: Userinfo,
    val views: String,
    val watch_ok: String,
    val xiajia_reason: String
)

class Goodsinfo

data class Liveinfo(
    val islive: String,
    val pull: String,
    val showid: String,
    val stream: String,
    val uid: String
)

data class Musicinfo(
    val author: String,
    val file_url: String,
    val id: String,
    val img_url: String,
    val length: String,
    val music_format: String,
    val title: String,
    val use_nums: String
)

data class Userinfo(
    val age: String,
    val area: String,
    val avatar: String,
    val avatar_thumb: String,
    val bg_img: String,
    val birthday: String,
    val city: String,
    val coin: String,
    val collectionVideos: String,
    val consumption: String,
    val fans: String,
    val follows: String,
    val hometown: String,
    val id: String,
    val is_firstlogin: String,
    val isrecommend: String,
    val issuper: String,
    val likeVideos: String,
    val praise: String,
    val province: String,
    val recommend_time: String,
    val sex: String,
    val signature: String,
    val user_nickname: String,
    val user_status: String,
    val vipinfo: Vipinfo,
    val votestotal: String,
    val workVideos: String
)

data class Vipinfo(
    val isvip: String,
    val vip_endtime: String,
    val vip_switch: String
)