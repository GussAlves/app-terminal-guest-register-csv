package com.gussalves.csv.service;

import com.gussalves.csv.domain.Guest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuestService {

    public void init(Scanner scanner) {
        insertGuests(scanner);
    }

    private void insertGuests (Scanner scanner) {
        boolean system = true;
        List<Guest> guests = new ArrayList<>();
        do {
            System.out.println("Insert name: ");
            String name = scanner.next();
            System.out.println("Insert age: ");
            int age = scanner.nextInt();
            System.out.println("Insert email: ");
            String email = scanner.next();

            guests.add(new Guest(name, age, email));

            System.out.println("More any guest? (Y/N)");
            if ( scanner.next().equalsIgnoreCase("N"))
                system = false;

        } while (system);
        guests.forEach(x -> System.out.println(x.getName() + " - " + x.getAge() + " - " +  x.getEmail()));
    }


}
