package com.gui.a.okhttpdemo;

import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import okhttp3.*;


import static com.gui.a.okhttpdemo.OkHttpPost.JSON;

/**
 * Created by guijianliang on 2019-04-09.
 * 测试用gzip的方式压缩 body中的json,然后发送出去
 */


public class GzipTest {
    public static void main(String[] args) throws IOException {
        
        OkHttpClient client = new OkHttpClient();
        String url = "http://ekko-test.nio.com/ekko/api/app/log?app_id=10003";

        String body1 = "[{\"event_timestamp\": 1517542690764, \"level\": \"INFO\", \"tag\": \"tag\", \"process_id\": \"process_id\", \"thread_name\": \"\", \"msg\": \"测试消息meifans\", \"env\": \"dev\",\n" +
                "         \"logtime\": \"2018-11-02T19:01:30.214+08:00\"},\n" +
                "        {\"event_timestamp\": 1517521497000, \"level\": \"INFO\", \"tag\": \"tag\", \"process_id\": \"\", \"thread_name\": \"\", \"env\": \"test\", \"msg\": \"测试消息\",\n" +
                "         \"logtime\": \"2018-11-02T19:01:30.214+08:00\"}]";


        byte[] data = body1.getBytes("UTF-8");

        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        System.out.println("-------");
        System.out.println(arr);
        System.out.println("-------");
        OutputStream zipper = new GZIPOutputStream(arr);
        zipper.write(data);
        zipper.close();

        System.out.println(arr);

        RequestBody body = RequestBody.create(JSON, arr.toByteArray());
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .header("Content-Encoding", "gzip")
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println(response.body().string());
        }

    }
}