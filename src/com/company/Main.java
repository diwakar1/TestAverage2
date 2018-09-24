package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
       int numberOfStudents;
       int numTests;
       int score;
       int total;
       double average;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        System.out.println("Enter the number of Tests: ");
        numTests= input.nextInt();

        for ( int student=1; student<= numberOfStudents; student++){

            total=0;

            for(int tests = 1; tests<= numTests; tests++){


                System.out.println("Enter Score  " + tests + " for student "+ student+ ": ");
                score= input.nextInt();
                total += score;
            }

            average= total/numTests;
            System.out.println("The average score for a  student "+ student + " is "+ average);
            System.out.println();


        }

    }
}
