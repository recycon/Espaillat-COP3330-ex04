package org.example;
import java.util.Scanner;
/**
 * Enter a noun: dog
 * Enter a verb: walk
 * Enter an adjective: blue
 * Enter an adverb: quickly
 * Do you walk your blue dog quickly? That's hilarious!
 *
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */


public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);


        System.out.println( "Enter a noun: " );
        String noun= in.next();

        System.out.println( "Enter a verb: " );
        String verb= in.next();
        System.out.println( "Enter an adjective: " );
        String adj= in.next();

        System.out.println( "Enter an adverb: " );
        String adverb= in.next();

        System.out.println( "Do you " +verb+ " your "+adj+ " "+ noun + " "+ adverb+ " ? That's hilarious!");
    }
}
