package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int height = readSize("h");
    int width = readSize("w");
    printShape(height, width);
  }

  private static int readSize(String sideType) {
    System.out.printf("Enter the value of the side %s - ", sideType);

    Scanner scn = new Scanner(System.in);
    int value = scn.nextInt();

    if (value <= 2) {
      System.out.println("Side can be only more than 2");
      System.exit(1);
    }

    return value;
  }


  public static String multiplyCharNTimes(char c, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(c);
    }
    return result.toString();
  }

  private static void printTopOrBottomLane(int width) {
    System.out.print("*");
    System.out.print(multiplyCharNTimes('-', width-2));
    System.out.println("*");
  }

  private static void printSideLane(int width) {
    System.out.print("|");
    System.out.print(multiplyCharNTimes(' ', width-2));
    System.out.println("|");
  }



  private static void printShape(int height, int width) {
    for (int i = 0; i < height; i++) {
      if ((i == 0) || (i == height-1))
        printTopOrBottomLane(width);
      else
        printSideLane(width);
    }
  }
}