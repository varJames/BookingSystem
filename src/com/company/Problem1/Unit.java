package com.company.Problem1;

import java.util.Objects;
import java.util.Scanner;

public class Unit {
    //scanner
    Scanner uInput = new Scanner(System.in);

    private String unitNumber;
    private String unitTitle;

    private String result[] = new String[10];
    Student[] classList = new Student[10];

    public Unit() {
        System.out.print("Enter the unit number: ");
        this.setUnitNumber(uInput.nextLine());
        System.out.print("Enter the unit title: ");
        this.setUnitTitle(uInput.nextLine());

        System.out.print("Enter how many students are attending this course: ");
        int studentNo = uInput.nextInt();
        System.out.print("\n");

        for (int loop1 = 0; loop1 < studentNo; loop1++) {
            classList[loop1] = new Student();
        }

    }

    public void addStudent() {
        boolean space = false;
        for (int loop1 = 0; loop1 < classList.length; loop1++) {
            if (classList[loop1] == null) {
                classList[loop1] = new Student();
                space = true;
                break;
            }
        }
        if (space == true) System.out.println("Student inserted");
        else System.out.println("No space available");
        System.out.println("\n");
    }

    public void removeStudent() {
        System.out.print("Please enter the id of student to remove: ");
        int removeStudentNo = uInput.nextInt();
        if (Objects.nonNull(classList[removeStudentNo])) {
            int maths = removeStudentNo - 1;
            classList[maths] = null;
        } else {
            System.out.print("Do you want to try again? y/n : ");
            if (uInput.nextLine().equalsIgnoreCase("y")) {
                removeStudent();
            } else {

            }
        }
    }

    //setters
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
    }

    //getters
    public String getUnitNumber() {
        return unitNumber;
    }
    public String getUnitTitle() {
        return unitTitle;
    }

    //prints
    public void printPassedStudents() {
        for (int loop1 = 0; loop1 < classList.length; loop1++) {
            if (Objects.nonNull(classList[loop1])) {
                    classList[loop1].studentsThatPassed();
                System.out.print("\n");
            } else {

            }
        }
    }

    public void printAllStudents() {
        for (int loop1 = 0; loop1 < classList.length; loop1++) {
            if (Objects.nonNull(classList[loop1])) {
                int mathsForPrint = loop1 + 1;
                System.out.println("Student ID:" + mathsForPrint + " {'" + classList[loop1]);
            } else {

            }
        }
        System.out.println("\n");
    }

    public void printOneStudent() {
        System.out.print("Please enter ID of student to print: ");
        classList[uInput.nextInt()-1].printStudentInfo();
        System.out.print("\n");
    }

    public void printPercentPassed() {
        int counter = 0;
        int counter1 = 0;
        for (int loop1 = 0; loop1 < classList.length; loop1++) {
            if (Objects.nonNull(classList[loop1])) {
                if (classList[loop1].countingPassed() == true) {
                    counter1++;
                    counter++;
                } else {
                    counter1++;
                }
            }
        }
        System.out.println("The percentage of students passed this unit is "
                + counter * 100 / counter1
                + "%, There was a total of "
                + counter1 + " students.");
    }
}

