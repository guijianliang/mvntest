package com.gui.a.StringDemo;

/**
 * Created by guijianliang on 2019-04-12.
 */


public class ReverseString {
    public static void main(String[] args) {
        String s0 = "abcdefgh";
        System.out.println(useSubString(s0));
    }

    //方法1: 使用 substring() 方法
    public static String useSubString(String s) {
//        if (s == null || s=="") {  //这里用==不行,得用equies,不知道为啥
        if (s == null || s.equals("")) {
            return s;
        }
        //substring 是截取字符串.
        return s.charAt(s.length() - 1) + useSubString(s.substring(0,s.length()-1));
    }
}
