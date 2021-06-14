package com.gussalves.csv;

import com.gussalves.csv.domain.CsvPessoa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
            System.out.println("****** Sistema iniciado ******");

            boolean system = true;
            Scanner scanner = new Scanner(System.in);

            while (system) {
                System.out.println("****** Bem vindo ao gerador de lista para convidados ******");
                System.out.println("Qual ação você deseja realizar? ");
                System.out.println("0 - Sair");
                System.out.println("1 - Cadastrar pessoas");

                int action = scanner.nextInt();

                switch (action) {
                    case 1:
                        break;
                    default:
                        system = false;
                        break;
                }
            }

            scanner.close();

            List<CsvPessoa> pessoas = new ArrayList<>();
            pessoas.add(new CsvPessoa("Joao",35,"joao@dicasdejava.com.br"));
            pessoas.add(new CsvPessoa("Maria",23,"maria@dicasdeprogramacao.com.br"));
            pessoas.add(new CsvPessoa("Ana",25,"ana@dicasdejava.com.br"));

            Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
            StatefulBeanToCsv<CsvPessoa> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();

            beanToCsv.write(pessoas);

            writer.flush();
            writer.close();

            System.out.println("****** Sistema iniciado ******");
        }

    }