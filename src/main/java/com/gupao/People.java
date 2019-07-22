package com.gupao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DJ on 2019年07月22日 16:57
 **/
public class People implements Cloneable,Serializable {
    private String name = "名字";
    private int age = 18;
    private List<String> hobbys = new ArrayList<String>();
    private Car car = new Car();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    protected People clone(){
        try{
            return (People) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

    public People deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            People copy = (People)ois.readObject();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
