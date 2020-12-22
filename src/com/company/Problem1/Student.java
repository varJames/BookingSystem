package com.company.Problem1;

import java.util.Scanner;

public class Student {

    //Scanner for user input = uInput
    Scanner uInput = new Scanner(System.in);


    //Class variables
    public int studentNo;
    public String forename;
    public String surname;
    public String email;
    public String mobileNo;
    public String grade;

    Student() {
        //i can put system out in setters but meh.
        System.out.println("Student Creation:");
        System.out.print("Do you want to assign your own student number? Enter 'y', if not a default number will be assigned: ");
        if (uInput.nextLine().equalsIgnoreCase("y")) {
            System.out.print("please enter your student number: ");
            int studentNoInput = uInput.nextInt();
            this.setStudentNo(studentNoInput);
            uInput.nextLine();
        } else {
            this.setStudentNo((int) (Math.random() * 1000));
            System.out.println("Random student number is: " + getStudentNo());
        }
        System.out.print("Please enter your Forename: ");
        this.setForename(uInput.nextLine());
        System.out.print("Please enter your Surname: ");
        this.setSurname(uInput.nextLine());
        System.out.print("Please enter your Email: ");
        this.setEmail(uInput.nextLine());
        System.out.print("Please enter your Mobile: ");
        this.setMobileNo(uInput.nextLine());
        this.setGrade();
        System.out.print("\n");
    }


    //Setters
    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public void setForename(String forename) {
            this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setGrade() {
        System.out.print("Does this student have a grade? y/n : ");
        if (uInput.nextLine().equalsIgnoreCase("n")) {
            this.grade = "No grade";
        } else {
            System.out.print("Did this student pass? y/n : ");
            if (uInput.nextLine().equalsIgnoreCase("y")) {
                this.grade = "Passed";
            } else {
                this.grade = "Failed";
            }
        }
        System.out.print("\n");
    }

    //Getters
    public int getStudentNo() {
        return studentNo;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getGrade() {
        return grade;
    }


    //Prints
    //students that passed
    public Object studentsThatPassed() {
        if (getGrade().equalsIgnoreCase(grade) == getGrade().equalsIgnoreCase("Passed")) {
            System.out.print("studentNo='" + getStudentNo() + '\'' +
                    ", forename='" + getForename() + '\'' +
                    ", surname='" + getSurname() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    ", mobileNo=" + getMobileNo() +
                    ", grade='" + getGrade() + '\'');
        } else {

        }
        return null;
    }

    public void printStudentInfo() {
        System.out.print("studentNo='" + getStudentNo() + '\'' +
                ", forename='" + getForename() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", mobileNo=" + getMobileNo() +
                ", grade='" + getGrade() + '\'');
    }

    @Override
    public String toString() {
        return "studentNo='" + getStudentNo() + '\'' +
                ", forename='" + getForename() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", mobileNo=" + getMobileNo() +
                ", grade='" + getGrade() + '\'' +
                '}';
    }

    public boolean countingPassed() {

        if (getGrade().equalsIgnoreCase("passed")) {
            return true;
        } else {
            return false;
        }
    }

}



