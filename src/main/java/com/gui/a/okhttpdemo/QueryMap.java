package com.gui.a.okhttpdemo;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guijianliang on 2019-04-10.
 */


public class QueryMap {
    public static void main(String[] args) {
        String s = "{\n" +
                "    \"system_result_code\": \"success\",\n" +
                "    \"result_code\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"strategy_list\": [\n" +
                "            {\n" +
                "                \"strategy_code\": 1,\n" +
                "                \"strategy_name\": \"q\",\n" +
                "                \"strategy_price\": 100,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 1,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 2,\n" +
                "                \"strategy_name\": \"特别优惠1\",\n" +
                "                \"strategy_price\": 0.32,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 1,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 3,\n" +
                "                \"strategy_name\": \"高峰价\",\n" +
                "                \"strategy_price\": 585,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 1,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 4,\n" +
                "                \"strategy_name\": \"首单价\",\n" +
                "                \"strategy_price\": 181,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 1,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 1,\n" +
                "                \"strategy_name\": \"原价\",\n" +
                "                \"strategy_price\": 100,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 2,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 2,\n" +
                "                \"strategy_name\": \"特别优惠\",\n" +
                "                \"strategy_price\": 280,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 2,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 3,\n" +
                "                \"strategy_name\": \"高峰价\",\n" +
                "                \"strategy_price\": 480,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 2,\n" +
                "                \"city_code\": \"global\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"strategy_code\": 4,\n" +
                "                \"strategy_name\": \"首单价\",\n" +
                "                \"strategy_price\": 180,\n" +
                "                \"package_code\": \"cp002\",\n" +
                "                \"package_sub_type\": 2,\n" +
                "                \"city_code\": \"global\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"request_id\": \"0a7d103bjuavzdwq_35269\",\n" +
                "    \"server_time\": 1554880968\n" +
                "}";

        Gson gson = new Gson();
        Map map = new HashMap();
        map = gson.fromJson(s,Map.class);
//        System.out.println(map);
        Map map1 = (Map) map.get("data");
        List l = (List) map1.get("strategy_list");
        System.out.println(l.getClass());

    }
}
