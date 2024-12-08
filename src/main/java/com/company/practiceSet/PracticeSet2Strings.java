package com.company.practiceSet;

import java.util.Scanner;

public class PracticeSet2Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*        //1. Convert string to lowercase
        System.out.println("Enter string: ");
        String lowercase = sc.next();
        System.out.println(lowercase.toLowerCase());*/

        // JAVA program to replace space with underscores
        String str = "Replace with underscores";
        System.out.println(str.replace(" ", "_"));

        // Replace name with a custom name
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Dear " + name + " Thanks a lot of for all your help");

        // Write program to detect double and triple spaces in a string
        String myStr = "This string contains  double and   triple spaces     ";
        System.out.println(myStr.indexOf("  "));
        System.out.println(myStr.indexOf("   "));

        // Write a program to format the following letter using escape characters
        String letter = "Dear Llewellyn, \n\tThis Java course is nice. \n\tThanks!\n\tHarry";
        System.out.println(letter);


    }

}
