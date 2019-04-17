package com.gui.a.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by guijianliang on 2019-04-10.
 */


public class FileDemo1 {
    public static void main(String[] args) throws IOException {
//        File file = new File();
        File file = new File("src/main/java/com/gui/a/filedemo/a.txt");
//        File file = new File("a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[]bs = new byte[1024];
        int length;
        while ((length=fileInputStream.read(bs))!=-1){
            System.out.println(new String(bs,0,length));
        }
        fileInputStream.close();
    }
}
