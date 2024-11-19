package com.example.go1.elity;

import java.util.List;

public class DetailElity {

    private int code;
    private String message;
    private DataDTO data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public static class DataDTO {
        private int id;
        private int category_id;
        private String goods_desc;
        private String goods_default_icon;
        private int goods_default_price;
        private String goods_banner;
        private String goods_detail_one;
        private String goods_detail_two;
        private int goods_sales_count;
        private int goods_stock_count;
        private String goods_code;
        private List<String> bannerList;
        private String goods_attribute;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCategory_id() {
            return category_id;
        }

        public void setCategory_id(int category_id) {
            this.category_id = category_id;
        }

        public String getGoods_desc() {
            return goods_desc;
        }

        public void setGoods_desc(String goods_desc) {
            this.goods_desc = goods_desc;
        }

        public String getGoods_default_icon() {
            return goods_default_icon;
        }

        public void setGoods_default_icon(String goods_default_icon) {
            this.goods_default_icon = goods_default_icon;
        }

        public int getGoods_default_price() {
            return goods_default_price;
        }

        public void setGoods_default_price(int goods_default_price) {
            this.goods_default_price = goods_default_price;
        }

        public String getGoods_banner() {
            return goods_banner;
        }

        public void setGoods_banner(String goods_banner) {
            this.goods_banner = goods_banner;
        }

        public String getGoods_detail_one() {
            return goods_detail_one;
        }

        public void setGoods_detail_one(String goods_detail_one) {
            this.goods_detail_one = goods_detail_one;
        }

        public String getGoods_detail_two() {
            return goods_detail_two;
        }

        public void setGoods_detail_two(String goods_detail_two) {
            this.goods_detail_two = goods_detail_two;
        }

        public int getGoods_sales_count() {
            return goods_sales_count;
        }

        public void setGoods_sales_count(int goods_sales_count) {
            this.goods_sales_count = goods_sales_count;
        }

        public int getGoods_stock_count() {
            return goods_stock_count;
        }

        public void setGoods_stock_count(int goods_stock_count) {
            this.goods_stock_count = goods_stock_count;
        }

        public String getGoods_code() {
            return goods_code;
        }

        public void setGoods_code(String goods_code) {
            this.goods_code = goods_code;
        }

        public List<String> getBannerList() {
            return bannerList;
        }

        public void setBannerList(List<String> bannerList) {
            this.bannerList = bannerList;
        }

        public String getGoods_attribute() {
            return goods_attribute;
        }

        public void setGoods_attribute(String goods_attribute) {
            this.goods_attribute = goods_attribute;
        }
    }
}
