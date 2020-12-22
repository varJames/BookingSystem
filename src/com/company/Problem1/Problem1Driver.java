package com.company.Problem1;

import java.util.Scanner;

public class Problem1Driver {

    public static void main(String[] args) {


        Scanner uInput = new Scanner(System.in);


        System.out.print("Do you wish to start this program? y/n :");
        if (uInput.nextLine().equalsIgnoreCase("y")) {

            Unit test = new Unit();

            test.printAllStudents();

            test.addStudent();

            test.printAllStudents();

            test.printOneStudent();

            test.printPassedStudents();

            test.printPercentPassed();

            test.removeStudent();

            test.printAllStudents();


        }
    }
}
