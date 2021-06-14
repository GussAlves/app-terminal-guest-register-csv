package com.gussalves.csv;

import com.gussalves.csv.controller.MainController;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        System.out.println("****** Sistema iniciado ******");

        Scanner scanner = new Scanner(System.in);
        MainController.init(scanner);
        scanner.close();

        System.out.println("****** Sistema encerrado ******");
    }
}

//            List<CsvPessoa> pessoas = new ArrayList<>();
//            pessoas.add(new CsvPessoa("Joao",35,"joao@dicasdejava.com.br"));
//            pessoas.add(new CsvPessoa("Maria",23,"maria@dicasdeprogramacao.com.br"));
//            pessoas.add(new CsvPessoa("Ana",25,"ana@dicasdejava.com.br"));
//
//            Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
//            StatefulBeanToCsv<CsvPessoa> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
//
//            beanToCsv.write(pessoas);
//
//            writer.flush();
//            writer.close();
//
//            System.out.println("****** Sistema iniciado ******");