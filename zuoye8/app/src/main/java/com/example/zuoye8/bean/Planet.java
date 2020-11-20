package com.example.zuoye8.bean;

import com.example.zuoye8.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = {R.drawable.iphone11, R.drawable.iqoo, R.drawable.redmi,
            R.drawable.realme, R.drawable.honor, R.drawable.huawei, R.drawable.mi10, R.drawable.se};
    private static String[] nameArray = { "Apple iPhone 11 ", "vivo iQOO", "Redmi K30", "realme 真我", "荣耀X10", "华为 HUAWEI P40","小米10 至尊纪念版","Apple iPhone SE"};
    private static String[] descArray = {
            "Apple iPhone 11 (A2223) 128GB 红色 移动联通电信4G手机 双卡双待",
            "vivo iQOO Neo3 5G 8GB+128GB 青空蓝 高通骁龙865 144Hz竞速屏 立体双扬 44W闪充 双模5G全网通手机",
            "Redmi K30 王一博同款 120Hz流速屏 前置挖孔双摄 索尼6400万后置四摄 4500mAh超长续航 27W快充 8GB+128GB 深海微光 游戏智能手机 小米 红米",
            "realme 真我X7 Pro 120Hz柔性屏 仅184g 65W闪充6400万超广角四摄 C位色 8GB+128GB 游戏5g轻薄旗舰手机",
            "荣耀X10 5G双模 麒麟820 4300mAh续航 4000万高感光影像系统 6.63英寸升降全面屏 8GB+128GB 燃力橙",
            "华为 HUAWEI P40 麒麟990 5G SoC芯片 5000万超感知徕卡三摄 30倍数字变焦 8GB+128GB亮黑色全网通5G手机",
            "小米10 至尊纪念版 双模5G 骁龙865 120HZ高刷新率 120倍长焦镜头 120W快充 12GB+256GB 透明版 游戏手机",
            "Apple iPhone SE (A2298) 128GB 黑色 移动联通电信4G手机"


    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
