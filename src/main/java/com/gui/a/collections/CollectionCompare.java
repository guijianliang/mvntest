package com.gui.a.collections;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by guijianliang on 2019-04-11.
 */


public class CollectionCompare {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhang", "wang", "li", "zhao");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(list);

        //采用lambda
        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println(list);

    }

    ;
}
