package com.gussalves.csv.controller;

import java.util.Scanner;

public class MainController {

    public MainController() {
        // class
    }

    public static void init(Scanner scanner) {

        boolean system = true;

        while (system) {
            System.out.println("****** Welcome to guest manager ******");
            System.out.println("What action wish execute? ");
            System.out.println("0 - Exit");
            System.out.println("1 - Create list for guests");

            int action = scanner.nextInt();

            switch (action) {
                case 1:

                    break;
                default:
                    system = false;
                    break;
            }
        }
    }

    private void insertUsers(Scanner scanner) {
        System.out.println("Insert name for guest");
        String guestName = scanner.next();


    }


}
