package com.gui.a.okhttpdemo;

import okhttp3.*;

import java.io.IOException;

/**
 * Created by guijianliang on 2019-03-08.
 * post请求,json格式
 */


public class OkHttpPost {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    public static void main(String[] args) {

    }

    public String postdemo1(String url,String json)throws IOException {

        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(JSON,json);
        Request request = new Request.Builder().url(url).post(requestBody).build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }




}



