package ru.geekbrains.java.oop.core.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.core.lesson1.homework.*;
import ru.geekbrains.java.oop.core.lesson1.homework.Cat;

@DisplayName("Соревнования")
public class AnimalsTest_hw1 {
    Cat cat = new Cat("Мурзик", 150, 2);
    Human human = new Human("Спортсмен", 150, 2);
    Robot robot = new Robot("Wally", 170, 1);

    Track track100 = new Track(100);
    Track track200 = new Track(200);
    Wall wall1 = new Wall(1);
    Wall wall3 = new Wall(3);

    @DisplayName("Кот пробежал")
    @Test
    public void Test1_CatRunSucess() {
        Assertions.assertTrue(cat.run(track100.length));
    }
    @DisplayName("Кот не пробежал")
    @Test
    public void Test1_CatRunFail() {
        Assertions.assertFalse(cat.run(track200.length));
    }
    @DisplayName("Кот прыгнул")
    @Test
    public void Test1_CatJumpSucess() {
        Assertions.assertTrue(cat.jump(wall1.height));
    }
    @DisplayName("Кот не прыгнул")
    @Test
    public void Test1_CatJumpFail() {
        Assertions.assertFalse(cat.jump(wall3.height));
    }

    @DisplayName("Человек пробежал")
    @Test
    public void Test1_HumanRunSucess() {
        Assertions.assertTrue(human.run(track100.length));
    }
    @DisplayName("Человек не пробежал")
    @Test
    public void Test1_HumanRunFail() {
        Assertions.assertFalse(human.run(track200.length));
    }
    @DisplayName("Человек прыгнул")
    @Test
    public void Test1_HumanJumpSucess() {
        Assertions.assertTrue(human.jump(wall1.height));
    }
    @DisplayName("Человек не прыгнул")
    @Test
    public void Test1_HumanJumpFail() {
        Assertions.assertFalse(human.jump(wall3.height));
    }

    @DisplayName("Робот пробежал")
    @Test
    public void Test1_BotRunSucess() {
        Assertions.assertTrue(robot.run(track100.length));
    }
    @DisplayName("Робот не пробежал")
    @Test
    public void Test1_BotRunFail() {
        Assertions.assertFalse(robot.run(track200.length));
    }
    @DisplayName("Робот прыгнул")
    @Test
    public void Test1_BotJumpSucess() {
        Assertions.assertTrue(robot.jump(wall1.height));
    }
    @DisplayName("Робот не прыгнул")
    @Test
    public void Test1_BotJumpFail() {
        Assertions.assertFalse(robot.jump(wall3.height));
    }

}
