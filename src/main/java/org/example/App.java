/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Locale;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("How many euros are you exchanging? ");
        String str1 = sc.nextLine();
        System.out.print("What is the exchange rate? ");
        String str2 = sc.nextLine();
        double n1 = Double.parseDouble(str1);
        double n2 = Double.parseDouble(str2);
        double n3 = n1*n2;
        System.out.printf("%.2f euros at an exchange rate of %.2f is\n%.2f U.S. dollars.",n1,n2,n3);
    }
}
