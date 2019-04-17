package com.gui.a.guavademo;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.google.common.base.Strings.*;

/**
 * Created by guijianliang on 2019-04-11.
 * 学习guava模块
 */


public class GuavaDemo {
    public static void main(String[] args) {

        /*
        //1. 借助Guava的Joiner类,完成字符串的拼接
        String joins = Joiner.on(' ').join(1,2,3);
        System.out.println(joins);
        List l1 = Arrays.asList(1,2,3,4);
        //2. 直接去list中的数据,进行拼接
        System.out.println(Joiner.on('-').join(l1));

        //3. 除了返回一个拼接过的字符串，Joiner 还可以在实现了 Appendable 接口的对象所维护的内容的末尾，追加字符串拼接的结果。
        StringBuilder sb = new StringBuilder("result");
        StringBuilder sb2 = Joiner.on(": ").appendTo(sb,1,2,3);
        System.out.println(sb2.toString());

        //4. guava对空指针有着严格的限制,如果传入的对象中包含空指针,Joiner 会直接抛出 NPE。
        // 与此同时，Joiner 提供了两个方法，让我们能够优雅的处理待拼接集合中的空指针。
        // 1.  skipNulls 方法，得到一个会跳过空指针的 Joiner 实例
        // 2. 用 useForNull 方法，指定用来替换空指针的字符串。
        Joiner.on(" ").skipNulls().join(1,null,2); //1 3
        Joiner.on(" ").useForNull("None").join(1,null,3); //1 None 3

        //5. MapJoiner的用法和Joiner类似,不过MapJoiner主要针对map的字符串拼接例
        Map map = Maps.newHashMap();
        map.put("k1","v1");
        map.put("k2","v2");
        map.put("k3","v3");
        map.put("k4","v4");
        System.out.println(map);
        String s = Joiner.on("&").withKeyValueSeparator("=").join(map);//k1=v1&k2=v2&k3=v3&k4=v4
        String s2 = Joiner.on("&").withKeyValueSeparator(":").join(map);//k1=v1&k2=v2&k3=v3&k4=v4
        System.out.println(s2);

        */

//        2-1. Splitter 是joiner的反面,是按一定的规则将其分开
        //   Splitter 能够将一个字符串按照指定的分隔符拆分成可迭代遍历的字符串集合，
        // 注意是一个字符串集合
//        String s1 = "1 2 \t\t3";
//        Iterable<String> ss = Splitter.on(" ").split(s1);
//        for (String s:ss){
//            System.out.println(s);
//        }
//        //2-2 Splitter 还支持使用正则表达式来描述分隔符
//        System.out.println(Splitter.onPattern("\\s+").split(s1));
//
//        //2-3 与Joiner.MapJoiner相对，Splitter.MapSplitter用来拆分被拼接了的Map对象，返回Map<String, String>
//        //如果在应用中有可能用到 KV 结构的字符串，我一般推荐使用 JSON 而不是 MapJoiner + MapSplitter。
//        Map map = (Splitter.on("#").withKeyValueSeparator(":").split("1:2#3:4"));
//        System.out.println(map.get("1"));
//
//        //3-1 Google Collections一览,创建一个HashMap,List,Set
//        Map<String, Map<Long, List<String>>> map1 = Maps.newHashMap(); //后面不用加类型
        //还有下面这两种办法
        //Lists.newArrayList();
        //Sets.newHashSet();

        /**
         * 当你在写单元测试时，经常会构造一些测试数据，可能是list、map、set等，对于一些像我一样草率的人来说，
         * 测试代码中会经常看到类似下面的语句：
         * List<String> list = new ArrayList<String>();
         * list.add("a");
         * list.add("b");
         * list.add("c");
         * list.add("d");
         */
//        //快速生成一个list或者map
//        ImmutableList<String> list1 = ImmutableList.of("a","b","c","d");
//        List<String> list2 = ImmutableList.of("a","b","c","d");
//        ImmutableMap<String,String> m2 = ImmutableMap.of("k1","v1","k2","v2","k3","v3");
//        System.out.println(m2.get("k2"));
//        System.out.println(list2.getClass().getName()); //com.google.common.collect.RegularImmutableList
//        System.out.println();









    }

}
