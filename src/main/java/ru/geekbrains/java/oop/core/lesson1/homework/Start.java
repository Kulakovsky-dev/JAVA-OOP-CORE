package ru.geekbrains.java.oop.core.lesson1.homework;

public class Start {
    public static void main(String[] args) {
        Cat cat1     = new Cat  ("Кот1"   ,99,  3);
        Human human1 = new Human("Человек1",150, 2);
        Robot robot1 = new Robot("Робот1" , 250, 1 );

        Track track100 = new Track(100);
        Track track200 = new Track(200);
        Wall  wall1 = new Wall(1);
        Wall  wall2 = new Wall(2);

        cat1.run (track100.length);
        cat1.run (track200.length);
        cat1.jump (wall1.height);
        cat1.jump (wall2.height);

        human1.run (track100.length);
        human1.run (track200.length);
        human1.jump (wall1.height);
        human1.jump (wall2.height);

        robot1.run (track100.length);
        robot1.run (track200.length);
        robot1.jump (wall1.height);
        robot1.jump (wall2.height);

    }
}
