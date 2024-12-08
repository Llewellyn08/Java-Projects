package com.company.projects;

import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        System.out.println("Calculate CBSE Marks Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Maths: ");
        int maths = sc.nextInt();
        System.out.print("Enter Marks of English: ");
        int english = sc.nextInt();
        System.out.print("Enter Marks of Hindi: ");
        int hindi = sc.nextInt();
        System.out.print("Enter Marks of History: ");
        int history = sc.nextInt();
        System.out.print("Enter Marks of Geography: ");
        int geography = sc.nextInt();
        System.out.print("Enter Marks of Second Language: ");
        int secondLanguage = sc.nextInt();

        float marksTotal = maths+english+hindi+history+geography+secondLanguage;
        System.out.println("Total Marks: "+ marksTotal);
        // Usage of float as output is decimal
        float percentage = (marksTotal /600)*100;

        System.out.println("Percentage obtained: "+ percentage);
    }
}
