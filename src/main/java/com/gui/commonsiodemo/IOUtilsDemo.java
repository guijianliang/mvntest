package com.gui.commonsiodemo;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by guijianliang on 2019-03-05.
 */


public class IOUtilsDemo {

    public static void main(String[] args) throws IOException {
        IOUtilsDemo.readUrl("http://www.baidu.com");
    }

    /**
     * 使用 IOUtils类,可以这样:对于这类的代码,灵活性和速度是最重要的。
     * 然而你也应该明白这么做的限制。使用以上的方式读取一个1GB的文件将会试图创造一个1GB字符串对象
     * @param url
     * @throws IOException
     */
    public static void readUrl(String url) throws IOException {
        InputStream in = new URL(url).openStream();
        System.out.println(IOUtils.toString(in));
    }


}

