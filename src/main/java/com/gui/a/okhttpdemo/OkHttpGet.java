package com.gui.a.okhttpdemo;


import okhttp3.*;

import java.io.IOException;

/**
 * Created by guijianliang on 2019-03-07.
 */


public class OkHttpGet {
    public static void main(String[] args) {
        OkHttpGet okHttpGet = new OkHttpGet();

//        okHttpGet.getDateSync("https://postman-echo.com/status/200");

        okHttpGet.getDateAsync("https://postman-echo.com/status/200");

    }

    /**
     * 这个是同步请求
     * 对于同步请求在请求时需要开启子线程，请求成功后需要跳转到UI线程修改UI。
     * 使用示例如下
     */
    public void getDateSync(String url){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder().url(url) //请求接口,如果需要传参拼接到接口后面
                            .build();   //创建request对象
                    Response response = null;
                    response = client.newCall(request).execute();//得到response对象

                    if (response.isSuccessful()){
                        System.out.println(response.code());
                        System.out.println(response.message());
                        System.out.println(response.body().string());
                    }

                }catch (Exception e){}
            }
        }).start();
    }


    /**
     * get的异步请求
     * 这种方式不用再次开启子线程，但回调方法是执行在子线程中，所以在更新UI时还要跳转到UI线程中
     * 异步请求的打印结果与注意事项与同步请求时相同。最大的不同点就是异步请求不需要开启子线程，enqueue方法会自动将网络请求部分放入子线程中执行。
     * 注意事项：
     * 1，回调接口的onFailure方法和onResponse执行在子线程。
     * 2，response.body().string()方法也必须放在子线程中。当执行这行代码得到结果后，再跳转到UI线程修改UI。
     */

    public void getDateAsync(String url){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()){ //回调的方法执行在子线程
                    System.out.println(response.code());
                    System.out.println(response.body().string());
                }
            }
        });

    }
}
