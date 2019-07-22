package com.gupao;

/**
 * Created by DJ on 2019年07月22日 17:12
 **/
public class ShallowCloneTest {
    public static void main(String[] args) {
         People p = new People();
         People cloneP = p.clone();
        //改变一下值，看是否对克隆有影响
         p.getHobbys().add("打篮球");
         p.getCar().setPrice(87654);

         System.out.println("People地址："+p);
         System.out.println("Car地址："+p.getCar());
         System.out.println("Car价格："+p.getCar().getPrice());
         System.out.println("People hobby："+p.getHobbys());

         System.out.println("Clone People地址："+cloneP);
         System.out.println("Clone Car地址："+cloneP.getCar());
         System.out.println("Clone Car价格："+cloneP.getCar().getPrice());
         System.out.println("Clone People hobby："+cloneP.getHobbys());
    }
}
