/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for age to be inputted
        System.out.println( "What is your age?" );
        int age = scanner.nextInt();

        //output for age to see if eligible to drive
        String msg = (age == 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive ";
        System.out.println(msg);

        }
    }
