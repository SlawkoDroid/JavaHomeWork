package com.pb.karpiuk.hw2;
import java.util.Scanner;

public class S01_BasicTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 7;
        if (x < 5) {
            System.out.println("Вы угадали!");
        }
            else if (x == 10)  {
                System.out.println("В точку!");
            } else {
            System.out.println("Ви не вгадали :(");
        }
    }
}
