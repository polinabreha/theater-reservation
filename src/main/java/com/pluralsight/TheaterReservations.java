package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you full name: ");
        String fullName = input.nextLine().trim();

        System.out.print("What date will you be coming (MM/dd/yyyy):");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(input.nextLine().trim(), format);

        System.out.print("How many tickets would you like?");
        int numberOfTickets = input.nextInt();

        if  (numberOfTickets <= 0) {
            System.out.println("Please enter a positive integer");
        }else if (numberOfTickets == 1) {
            System.out.printf("%d ticket reserved for %tm/%td/%tY under %s",
                    numberOfTickets, reservationDate, reservationDate, reservationDate, fullName);
        }else if (numberOfTickets >= 2) {
            System.out.printf("%d tickets reserved for %tm/%td/%tY under %s",
                    numberOfTickets, reservationDate, reservationDate, reservationDate, fullName);
        }else{
            System.out.println("Invalid input");
        }
    }
}
