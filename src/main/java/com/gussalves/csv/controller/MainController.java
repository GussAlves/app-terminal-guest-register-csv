package com.gussalves.csv.controller;

import java.util.Scanner;

public class MainController {

    public MainController() {
        // class
    }

    public static void init(Scanner scanner) {

        boolean system = true;

        while (system) {
            System.out.println("****** Bem vindo ao gerador de lista para convidados ******");
            System.out.println("Qual ação você deseja realizar? ");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar lista de convidados");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Entrou.. ");
                    break;
                default:
                    system = false;
                    break;
            }
        }
    }

    private void controllerView(Scanner scanner) {

    }


}
