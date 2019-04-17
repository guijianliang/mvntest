package com.gui.a.dongtaidaili;

/**
 * Created by guijianliang on 2019-04-17.
 * 这个是静态代理,静态代理必须实现与代理类相同的接口,
 * 这个为啥必须继承, 设计就是这么设计的
 */


public class Jingtaidaili implements IUserDao {
    private IUserDao target;
    public Jingtaidaili(IUserDao target){
        this.target = target;
    }
    public void save(){
        System.out.println("开启事务");
        target.save();
        System.out.println("提交事务");
    }


}
