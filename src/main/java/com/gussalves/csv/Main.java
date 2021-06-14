package com.gussalves.csv;

import com.gussalves.csv.controller.MainController;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        System.out.println("****** System init ******");

        Scanner scanner = new Scanner(System.in);
        MainController.init(scanner);
        scanner.close();

        System.out.println("****** End system ******");
    }
}