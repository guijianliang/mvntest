package com.gui.a.filedemo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by guijianliang on 2019-04-15.
 */


public class UploadFileCdn {
    public static void main(String[] args) throws IOException {
        final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/jpg");

        OkHttpClient client = new OkHttpClient();

        File file = new File("src/main/java/com/gui/a/filedemo/timg.jpg");
        String url = "https://tibbers-test.nio.com/tibbers/v1/image/upload?app_id=10003";

        //2.创建RequestBody
        RequestBody fileBody = RequestBody.create(MEDIA_TYPE_PNG, file);

        //3.构建MultipartBody
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file", "testImage.jpg", fileBody)
                .build();

        //4.构建请求
        Request request = new Request.Builder()
                .url(url).addHeader("Authorization", "Bearer 2.04Peici7MRX62mO2gpn39I2B9WU7itBcWHEftQ5Qqif0=")
                .post(requestBody)
                .build();

        //5.发送请求
        Response response = client.newCall(request).execute();


        String res = response.body().string();
        System.out.println(res);
        Map map = new Gson().fromJson(res, Map.class);
        System.out.println(map.get("data"));



    }
}
