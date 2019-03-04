package com.gui.testdemo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by guijianliang on 2019-02-26.
 */


public class Testlomlock {
    public static void main(String[] args) {
        Book p = new Book("gui",19);
        System.out.println(p.getName());
    }
}

@Getter
@Setter
@AllArgsConstructor
class Book{
    String name;
    Integer price;

}
