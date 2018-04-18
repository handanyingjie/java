package com.lyj.hello;

public class Dog {
    String name;
    int age;

    //构造方法，没有返回值
    Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("感谢主任领养了我!");
    }

    void bark(){
        System.out.println("汪汪，不要过来!");
    }

    void hungry(){
        System.out.println("主人，我饿了!");
    }

    public static void main(String arg[]){
        Dog myDog = new Dog("花花",3);

        String name = myDog.name;
        int age = myDog.age;
        System.out.println("我是一只小狗，我的名字叫" + name + ", 我" + age + "岁了");

        myDog.bark();
        myDog.hungry();
    }
}
