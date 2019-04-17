package com.gui.a.gsonmap;

import com.google.common.collect.Maps;
import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by guijianliang on 2019-04-10.
 */


public class GsonMap {
    public static void main(String[] args) {
        Map map =  Maps.newHashMap();  //这里用的是google的guava 简化写hashmap,会动态生成泛型,
        map.put("k","v");
        map.put("k1","v1");
        map.put("k2","v2");

        String s1 = (String) maptogson(map);
        System.out.println(s1);
        System.out.println("----------");
        Map map2 = (Map)gsontomap(s1);
        System.out.println(map2);



    }
    // gson转为Map
    public static Map gsontomap(String s){
        Gson g = new Gson();
        return g.fromJson(s,Map.class);  //fromJson需要后面跟一个参数是类
    }

    // Map转变成gson
    public static String maptogson(Map map){
        Gson g = new Gson();
        return g.toJson(map);
    }
}
