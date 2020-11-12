package com.example.zuoye7.bean;

import com.example.zuoye7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "Apple iPhone 11 ", "vivo iQOO", "Redmi K30", "realme 真我", "荣耀X10", "华为 HUAWEI P40","小米10 至尊纪念版","Apple iPhone SE"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 11 (A2223) 128GB 红色 移动联通电信4G手机 双卡双待",
            "vivo iQOO Neo3 5G 8GB+128GB 青空蓝 高通骁龙865 144Hz竞速屏 立体双扬 44W闪充 双模5G全网通手机",
            "Redmi K30 王一博同款 120Hz流速屏 前置挖孔双摄 索尼6400万后置四摄 4500mAh超长续航 27W快充 8GB+128GB 深海微光 游戏智能手机 小米 红米",
            "realme 真我X7 Pro 120Hz柔性屏 仅184g 65W闪充6400万超广角四摄 C位色 8GB+128GB 游戏5g轻薄旗舰手机",
            "荣耀X10 5G双模 麒麟820 4300mAh续航 4000万高感光影像系统 6.63英寸升降全面屏 8GB+128GB 燃力橙",
            "华为 HUAWEI P40 麒麟990 5G SoC芯片 5000万超感知徕卡三摄 30倍数字变焦 8GB+128GB亮黑色全网通5G手机",
            "小米10 至尊纪念版 双模5G 骁龙865 120HZ高刷新率 120倍长焦镜头 120W快充 12GB+256GB 透明版 游戏手机",
            "Apple iPhone SE (A2298) 128GB 黑色 移动联通电信4G手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4999, 2998, 1499, 2399, 2399, 4488, 5999, 3799};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone11_s, R.drawable.iqoo_s, R.drawable.redmi_s,
            R.drawable.realme_s, R.drawable.honor_s, R.drawable.huawei_s,
            R.drawable.mi10_s,R.drawable.se_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone11, R.drawable.iqoo, R.drawable.redmi,
            R.drawable.realme, R.drawable.honor, R.drawable.huawei,
            R.drawable.mi10,R.drawable.se
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
