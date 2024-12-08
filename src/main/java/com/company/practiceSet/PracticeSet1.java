package com.company.practiceSet;

import java.util.Scanner;

public class PracticeSet1 {

    public static void main(String[] args) {

        //1. Result of following expression: 7/4*9/2

        float result = (7/4.0f)*(9/2.0f);

        System.out.println(result);

        //2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);

            //Decrypt
        grade = (char)(grade-8);
        System.out.println(grade);

        //3. Use a comparison operator to find out whether a given number is greater than a user generated number or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1= sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();
        if (number1>number2){
            System.out.println("Number 1 is greater");
        }else {
            System.out.println("Number 2 is greater");
        }

    }
}
