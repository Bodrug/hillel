package ua.hillel.Bodrug.Lesson2.Task2;

public class Task2Class {
    public static void main(String[] args) {
        int n = 8;
        int [] x = new int[n];
        for (int i = 0; i < n ; i++) {
            x[i] = i+1;
        }
        //Для проверки выведем в консоль
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);
        }
    }
}