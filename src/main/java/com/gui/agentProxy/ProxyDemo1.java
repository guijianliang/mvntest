package com.gui.agentProxy;

/**
 * Created by guijianliang on 2019-02-27.
 * 静态代理模式
 * 为了实现控制某些类的使用,或者在这些类前面或者后面加一些处理的东西
 */


public class ProxyDemo1 {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy((UserDao) userDao);
        userDaoProxy.save();
    }
}

interface IUserDao{
    void save();
}


class UserDao implements IUserDao{
    @Override
    public void save(){
        System.out.println("这里是保存数据......");
    }
}

class UserDaoProxy implements IUserDao{

    private final UserDao userDao;

    public UserDaoProxy(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
        before();
        userDao.save();
        after();
    }

    public void before(){
        System.out.println("开始前执行的操作.");
    }

    public void after(){
        System.out.println("开始后执行的操作.");
    }
}










