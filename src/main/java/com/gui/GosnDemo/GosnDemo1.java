package com.gui.GosnDemo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by guijianliang on 2019-03-18.
 * 下面是关于gosn的一些学习例子
 */


public class GosnDemo1 {
    public static void main(String[] args) {
//        /**
//         * 下面是将object转换为gson;
//         * 将user --> string
//         */
//        Users users = new Users("gui",18,"guijianliang@124.com");
//        Gson gson = new Gson();
//        String jsonObject = gson.toJson(users);
//
//        System.out.println(jsonObject);

//        /**
//         * 将stringObject => User
//         */
//        Gson gson = new Gson();
//        String jsonString = "{\"name\":\"gui\",\"age\":18,\"Email\":\"guijianliang@124.com\"}";
//        Users users = gson.fromJson(jsonString,Users.class);
//        System.out.println(users.email);

//        /**
//         * 将字符串转换为数组
//         */
//        Gson gson = new Gson();
//        String jsonArray = "[\"Android\",\"Java\",\"PHP\"]";
////        String[] strings = gson.fromJson(jsonArray,String[].class);
////        System.out.println(strings.getClass());
//
////        或者采用下面的方式
////        System.out.println(strings,new TypeToken<List<String>>() {}.getType());
//        List<String> list = gson.fromJson(jsonArray, new TypeToken<List<String>>() {
//        }.getType());
//
////        注：TypeToken的构造方法是protected修饰的,所以上面才会写成new TypeToken<List<String>>() {}.getType()
////        而不是  new TypeToken<List<String>>().getType()
//
//        System.out.println(list);


        /**
         * 利用泛型解析,假如data的数据类型有2类,一种是{} 一种是[],该怎么搞?
         * {"code":"0","message":"success","data":{}}
         * {"code":"0","message":"success","data":[]}
         * 直接写一个泛型: Result<T>
         *     {"code":"0","message":"success","data":{"name":"gui","age":18,"Email":"guijianliang@124.com"}}
         *     {"code":"0","message":"success","data":["hehe","gaga","dsdasdas"]}
         */
        String s1 = "{\"code\":\"0\",\"message\":\"success\",\"data\":{\"name\":\"gui\",\"age\":18,\"Email\":\"guijianliang@124.com\"}}";
        String s2 = "{\"code\":\"0\",\"message\":\"success\",\"data\":[\"hehe\",\"gaga\",\"dsdasdas\"]}";

        Gson gson = new Gson();
        Type userType = new TypeToken<Result<Users>>(){}.getType();
        Result<Users> result1= gson.fromJson(s1,userType);
        System.out.println(result1.data.age);

        Type userType2 = new TypeToken<Result<List<String>>>(){}.getType();
        Result<List<String>> result2 = gson.fromJson(s2,userType2);
        System.out.println(result2.data);




    }
}
