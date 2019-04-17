package com.gui.a.dongtaidaili;

/**
 * Created by guijianliang on 2019-04-17.
 */


public class TestDaiLi {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        Jingtaidaili j = new Jingtaidaili(userDao);
        j.save();

    }
}
