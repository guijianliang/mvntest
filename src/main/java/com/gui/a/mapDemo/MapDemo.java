package com.gui.a.mapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by guijianliang on 2019-04-16.
 */


public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(3,"3");
        map.put(5,"5");
        map.put(1,"1");
        map.put(2,"2");
        map.put(8,"8");
        //System.out.println(map);//{1=1, 2=2, 3=3, 5=5, 8=8}  是有序的;
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it =  entries.iterator();

        while (it.hasNext()){
            Map.Entry<Integer,String> maps = it.next();
            System.out.printf("k: " + maps.getKey() );
            System.out.println("    v: " + maps.getValue() );
        }




    }
}
