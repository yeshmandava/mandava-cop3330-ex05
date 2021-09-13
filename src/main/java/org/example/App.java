package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner input= new Scanner(System.in);
        System.out.print("What is the first number: ");
        String numOne = input.nextLine();

        System.out.print("What is the second number: ");
        String numTwo = input.nextLine();

        int num1 = Integer.parseInt(numOne);
        int num2 = Integer.parseInt(numTwo);

        int Sum = num1+num2;
        int Diff = num1 - num2;
        int Product = num1 * num2;
        int Quotient = num1/num2;

        System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d",num1,num2,Sum,num1,num2,Diff,num1,num2,Product,num1,num2,Quotient);

    }
}
