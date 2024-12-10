package com.company.practiceSet;

import java.util.Scanner;

public class PracticeSet2Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Write a program to find out if a student has passed or failed.
        // Condition: 40% total and atleast 33% in each subject
        // Assume 3 subjects and take input from the user

      System.out.println("Enter your marks in physics: ");
        int physics = sc.nextInt();
        System.out.println("Enter your marks in chemistry: ");
        int chemistry = sc.nextInt();
        System.out.println("Enter your marks in mathematics: ");
        int mathematics = sc.nextInt();

        float total = physics+chemistry+mathematics;
        float percentage = (total/300)*100;
        System.out.println("Your overall percentage is: " + percentage);

        if (percentage >= 40 && physics >= 33 && chemistry >= 33 && mathematics >= 33){
            System.out.println("You have passed");
        }else{
            System.out.println("You have failed");
        }

        // Calculate income tax paid by an employee to the government as per the slabs below
        // 2.5L > 5% Tax
        // 5 - 10L > 20% Tax
        // Above 10L > 30% Tax
        // Note that there is no tax below 2.5L and take input from user

        System.out.println("Enter your income in lakhs per annum: ");
        double income = sc.nextInt();
        double taxPayable = 0;

        if(income < 250000){
            taxPayable = 0;
        }
        else if (income >= 250000 && income <= 499999){
            taxPayable = (income - 250000) * 0.05;
        } else if (income >= 500000 && income <= 1000000) {
            taxPayable = (250000 * 0.05) + (income - 500000) * 0.20;
        } else  {
            taxPayable = (250000*0.05)+(500000*0.20)+(income-1000000)*0.30;
        }
        System.out.println("Tax payable for the year: " + taxPayable);

        // Write a program to find out the day of the week. Given the number
        System.out.println("Enter the number: ");
        int day = sc.nextInt();
        String dayName = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println("The day is: " + dayName);

        // Write a java program to find whether a year entered by the user is a leap year or not
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

        // Write a program to find out the type of website from the url:
        // .com -> commercial website
        // .org -> organizational website
        // .in -> Indian website

        System.out.println(" Enter the url: ");
        String url = sc.next();

        if(url.endsWith("org")){
            System.out.println("Organizational website");
        }else if(url.endsWith("com")){
            System.out.println("Commercial website");
        }else if (url.endsWith("in")){
            System.out.println("Indian website");
        }else{
            System.out.println("Unique Website");
        }
    }
}
