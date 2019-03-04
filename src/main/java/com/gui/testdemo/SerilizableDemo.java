package com.gui.testdemo;

import java.io.*;

/**
 * Created by guijianliang on 2019-02-21.
 * 对象的序列化和反序列化
 * 序列化对象
 * ObjectOutputStream 类用来序列化一个对象，如下的 SerializeDemo 例子实例化了一个 Employee 对象，并将该对象序列化到一个文件中。
 * 该程序执行后，就创建了一个名为 employee.ser 文件。该程序没有任何输出，但是你可以通过代码研读来理解程序的作用。
 * 注意： 当序列化一个对象到文件时， 按照 Java 的标准约定是给文件一个 .ser 扩展名。
 */


public class SerilizableDemo {
    public static void main(String[] args) throws IOException {
//        Person p = new Person();
//        p.name = "gui";
//        p.age= 18;
//        try{
//            FileOutputStream fileOutputStream = new FileOutputStream("/Users/jianliang.gui/person.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
//            out.writeObject(p);
//            out.close();
//            fileOutputStream.close();
//        }catch (IOException i){
//            i.printStackTrace();
//        }

        Person p = null;

        FileInputStream fileInputStream = new FileInputStream("/Users/jianliang.gui/person.ser");
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        try {
            try {
                p = (Person) in.readObject();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p.name);
        System.out.println(p.age);
    }
}


class Person implements java.io.Serializable {
    String name;
    Integer age;

    public void hehe() {
        System.out.println("heheheheh");
    }
}