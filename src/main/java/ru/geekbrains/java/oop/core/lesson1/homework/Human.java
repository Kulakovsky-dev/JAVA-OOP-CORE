package ru.geekbrains.java.oop.core.lesson1.homework;

public class Human {
    private String name;
    private int jumpLimit;
    private int runLimit;

    public Human(String name, int runlimit, int jumplimit)
    {   this.name = name;
        this.runLimit = runlimit;
        this.jumpLimit = jumplimit;
    }

    public boolean run(int length) {
        if(runLimit>=length) {
            System.out.println("Человек " + name + " пробежал " + length + " (Limit=" + runLimit+')');
            return true;
        } else {
            System.out.println("Человек " + name + " не смог пробежать " + length + " (Limit=" + runLimit+')');
            return false;
        }
    }
    public boolean jump(int height){
        if(jumpLimit>=height) {
            System.out.println("Человек " + name + " прыгнул на " + height + " (Limit=" + jumpLimit+')');
            return true;
        } else {
            System.out.println("Человек " + name + " не смог прыгнуть на " + height + " (Limit=" + jumpLimit+')');
            return false;
        }
    }
}
