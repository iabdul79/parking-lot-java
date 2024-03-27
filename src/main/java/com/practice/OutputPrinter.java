package com.practice;

public class OutputPrinter {
  public static void welcome() {
    printLn("Welcome to the stupid parking lot");
  }

  public static void end() {
    printLn("Thank you for using the parking lot");
  }

  public static void notFound() {
    printLn("Not found");
  }

  public static void parkingFull() {
    printLn("Parking lot is full");
  }

  public static void parkingEmpty() {
    printLn("Parking lot is empty");
  }

  public static void outputHeader() {
    printLn("Slot No.    Registration No    Colour");
  }

  private static void printLn(final String statement) {
    System.out.println(statement);
  }
}
