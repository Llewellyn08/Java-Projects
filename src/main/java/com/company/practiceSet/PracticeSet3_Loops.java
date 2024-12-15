package com.company.practiceSet;

public class PracticeSet3_Loops {
    public static void main(String[] args) {

        //1.  Write a program to solve the following pattern
        // ****
        // ***
        // **
        // *

/*        int n = 5;
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }*/

        //2.  Write a program to sum the first n even numbers using for loop
/*        int sum = 0;
        int n = 3;
        for(int i=0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.println("The sum of even numbers is: " +sum);*/

        //3. Write a program to print multiplication table of a given number n
/*        int end=10;
        int n=5;
        for(int i=1; i<=end; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }*/

        //4. Writ a program to print multiplication table of 10 in reverse order
/*
        int start=10;
        int n=10;
        for(int i=start; i>=0; i--){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
*/

        //5. Write a program to sum the first n even numbers using for loop
/*        int sum = 0;
        int n = 3;
        int i = 1;
        while(i<n){
            sum = sum + (2*i);
            i++;
        }
        System.out.println("The sum of even numbers is: " +sum);
*/

        //6. Write a program to find a factorial of a given number using while loop
/*        int n = 5;
        // Factorial info: n = n * (n-1) * (n-2).....1
        // ex: 5 = 5x4x3x2x1
        int i = 1;
        int factorial = 1;
        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + n + ": " +factorial);*/

        //7. Write a program to find a factorial of a given number using for loop
/*        int n = 5;
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + n + ": " +factorial);*/

        //8.  Write a program to solve the following pattern using while loop
        // ****
        // ***
        // **
        // *

/*        int i = 4; // Initialize the row counter
        while (i >= 1) { // Outer loop for rows
            int j = 1; // Initialize the column counter
            while (j <= i) { // Inner loop for printing '*'
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i--; // Decrement the row counter
        }*/

        //9. Write a program to calculate the sum of numbers occurring in the multiplication table of n
        int end=10;
        int n=8;
        int sum=0;
        for(int i=1; i<=end; i++) {
            sum += n*i;
        }
        System.out.println(sum);
    }
}
