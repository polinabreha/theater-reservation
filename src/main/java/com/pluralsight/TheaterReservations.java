package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = input.nextLine();

        String[] parseName = fullName.split(" ");


       if (parseName.length == 1) {
           System.out.println("Please enter your full name!!!");
       } else if (parseName.length == 2) {
           System.out.print("What date will you be coming (MM/dd/yyyy): ");
           DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
           LocalDate reservationDate = LocalDate.parse(input.nextLine().trim(), format);

           System.out.print("How many tickets would you like? ");
           int numberOfTickets = input.nextInt();

           if (numberOfTickets <= 0){
               System.out.println("Please enter a positive integer");
           }else if (numberOfTickets == 1) {
               System.out.printf("%d ticket reserved for %tF under %s, %s",
                       numberOfTickets, reservationDate, parseName[1] , parseName[0] );
           } else {
               System.out.printf("%d tickets reserved for %tF under %s, %s",
                       numberOfTickets, reservationDate, parseName[1] , parseName[0]);
           }
       }else {
           System.out.println("Please enter your full name!!!");
       }



    }
}
