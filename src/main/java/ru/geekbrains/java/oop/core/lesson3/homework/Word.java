package ru.geekbrains.java.oop.core.lesson3.homework;

public class Word {
    private String word;
    private int count;

    public Word(String word) {
        this.word = word;
        this.count = 1;
    }

   // public String getWord() {
   //     return word;
   // }
    boolean equals(String string) {
        return this.word.equals(string);
    }
    public int getCount() {
        return count;
    }
    public void Increase() {
        this.count += 1;
    }
    void print() {
        System.out.println(this.word + ' ' + this.count);
    }
}
