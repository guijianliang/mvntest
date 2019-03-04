package com.gui.ngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by guijianliang on 2019/2/15.
 */


public class FirstNGTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("这个是beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("这个是afterClass");
    }

    @Test
    public void add(){
        System.out.println("测试第一个testNG");
        assertEquals(4,2+2);
    }

}
