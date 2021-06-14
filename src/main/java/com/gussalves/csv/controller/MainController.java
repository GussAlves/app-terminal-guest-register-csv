package com.gussalves.csv.controller;

import com.gussalves.csv.service.GuestService;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.Scanner;

public class MainController {

    public static void init(Scanner scanner) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {

        GuestService guestService = new GuestService();
        boolean system = true;

        while (system) {
            System.out.println("****** Welcome to guest manager ******");
            System.out.println("What action wish execute? ");
            System.out.println("0 - Exit");
            System.out.println("1 - Create list for guests");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    guestService.init(scanner);
                    break;
                default:
                    system = false;
                    break;
            }
        }
    }
}
