//HOLA BEBEEEE

package com.unsta.flight;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    class Flight {
      int passegers;
      int seats;
      
      Flight() {
        passegers = 0;
        seats = 300;
      }

      void addPassengersAndTakeSeats(int quantity) {

        passegers += quantity;
        seats -= quantity;


      }
    }

    Flight plane1 = new Flight();
    int option=0;

    while (option == 0) {
      System.out.println("-------------------------------");
      System.out.println("-------------------------------");
      System.out.println("-------------------------------");
      System.out.println("Passengers Bue to Mia: " + plane1.passegers);

      System.out.println("Set the quantity of passengers you add: ");

      int quantity = sc.nextInt();
      if (quantity <= plane1.seats) {
        plane1.addPassengersAndTakeSeats(quantity);

        System.out.println("Passengers Bue to Mia: " + plane1.passegers);
        System.out.println("Seats avaible in the flight Bue to Mia: " + plane1.seats);
      } else {
        System.out.println("Sorry! The amount of passengers you are adding is larger than the seats avaible");
      }
      System.out.println("Press 0 if you want to add more passengers or press any key to exit. Thanks You");
      Scanner scOption = new Scanner(System.in);
      option = scOption.nextInt();
    }

  }
}