/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is your name?" );
        String userName = input.next();
        System.out.println("Hello, " + userName + ", nice to meet you!");
    }
}
