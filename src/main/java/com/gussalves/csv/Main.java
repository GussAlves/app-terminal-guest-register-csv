package com.gussalves.csv;

import com.gussalves.csv.controller.MainController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("****** System init ******");

        Scanner scanner = new Scanner(System.in);
        MainController.init(scanner);
        scanner.close();

        System.out.println("****** End system ******");
    }
}