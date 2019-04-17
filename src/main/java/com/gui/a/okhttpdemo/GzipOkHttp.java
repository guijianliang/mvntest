package com.gui.a.okhttpdemo;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

import static com.gui.a.okhttpdemo.OkHttpPost.JSON;

public class GzipOkHttp{
    public static void main(String[] args) throws IOException {
        String url = "http://ekko-test.nio.com/ekko/api/app/log?app_id=10003";

        String body1 = "[{\"event_timestamp\": 1517542690764, \"level\": \"INFO\", \"tag\": \"tag\", \"process_id\": \"process_id\", \"thread_name\": \"\", \"msg\": \"测试消息meifans\", \"env\": \"dev\",\n" +
                "         \"logtime\": \"2018-11-02T19:01:30.214+08:00\"},\n" +
                "        {\"event_timestamp\": 1517521497000, \"level\": \"INFO\", \"tag\": \"tag\", \"process_id\": \"\", \"thread_name\": \"\", \"env\": \"test\", \"msg\": \"测试消息\",\n" +
                "         \"logtime\": \"2018-11-02T19:01:30.214+08:00\"}]";

        byte[] data = body1.getBytes("UTF-8");
        ByteArrayOutputStream  arr = new ByteArrayOutputStream();
        OutputStream gzipOutputStream = new GZIPOutputStream(arr);
        gzipOutputStream.write(data);
        gzipOutputStream.close();

        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody = RequestBody.create(JSON ,arr.toByteArray());
        Request request = new Request.Builder().url(url).header("Content-Encoding", "gzip").post(requestBody).build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());


    }
}



