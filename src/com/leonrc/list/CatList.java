package com.leonrc.list;

import java.util.ArrayList;
import java.util.List;

public class CatList {
    public static void main(String[] args){
        List<Cat> myCats = new ArrayList<>(){{
           add(new Cat("Jon", 18, "Preto"));
           add(new Cat("Simba", 6, "Tigrado"));
           add(new Cat("Jon", 12, "Amarelo"));
        }};

        System.out.println(myCats);
    }
}

class Cat {
    private String name;
    private Integer age;
    private String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
