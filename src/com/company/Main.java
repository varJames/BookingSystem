package com.company;

import com.company.Problem2.Court;
import com.company.Problem2.Registered.Member;
import com.company.Problem2.Registered.Person;
import com.company.Problem2.Time.Hours;
import com.company.Problem2.Time.Timetable;
import com.company.Problem2.Time.Week;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner uInput = new Scanner(System.in);

    Member[] personArray = new Member[2500];

    Court courts;

    public static void main(String[] args) {

        Main start = new Main();

        start.fillArray();

        while(true) {
            start.menu();
        }

    }

    public void menu() {

        System.out.print("Do you wish to continue? type: 'yes/y' :");
        String input = uInput.nextLine();

        if (input.equalsIgnoreCase("y") | (input.equalsIgnoreCase("yes"))) {
            System.out.println("\n");
            System.out.println("Welcome to problem 2 Of Inheritance & Polymorphism");

            System.out.println("Select 1 to:) 'Create Courts',");
            System.out.println("Select 2 to:) 'Create Guests Or Members',");
            System.out.println("Select 3 to:) 'Add a single Member',");
            /*Display all Guests/Members
            Remove Guest OR Member
            Display all Courts Booking
            Create amount of courts at this club*/
            System.out.println("Select 4 to:) 'Remove Member',");
            System.out.println("Select 5 to:) 'Display all Guests/Members',");
            System.out.println("Select 6 to:) ''.");

//treat each case statement as a local scope
            switch (uInput.nextInt()) {
                case 1 -> createCourts();
                case 2 -> createMembers();
                case 3 -> addMember();
                case 4 -> removeMembers();
                case 5 -> printMembers();
                case 6 -> Court.printCourt();
                case 7 -> bookSlot();
                case 8 -> printBookings();
                default -> System.out.println("Invalid entry try again: ");
            }
        } else {

        }
    }

    //start
    public void fillArray() {
        for (int i = 0; i < 2500; i++) {
            personArray[i] = null;
        }
    }

    public void createCourts() {
        System.out.print("How many courts to create: ");
        int selection = uInput.nextInt();
        courts = new Court(selection);
    }

    public void createMembers() {

        System.out.println("how many members do you want to make?");
        int selection = uInput.nextInt();


        for (int i = 0; i < selection; i++) {
            Member test = new Member();
            personArray[i] = test;
        }
    }

    public void addMember() {
        int toNullCounter = 0;

        System.out.println("how many members do you want to add?");
        int selection = uInput.nextInt();

        for (int i = 0; i < personArray.length; i++) {
            if (Objects.nonNull(personArray[i])) {
                toNullCounter++;
            } else {

            }

            for (int j = 0; j < selection; j++) {
                personArray[j + toNullCounter] = new Member();
            }
            break;
        }
    }

    public void removeMembers() {
        System.out.println("What member do you want to move");
        int selection = uInput.nextInt();
        if (Objects.nonNull(personArray[selection -1])) {
            personArray[selection - 1] = null;
            System.out.println("You removed: \n" + personArray[selection - 1]);
        } else {
            System.out.println("Invalid selection");
        }
    }

    public void printMembers() {
        int toNullCounter = 0;
        for (int i = 0; i < personArray.length; i++) {
            if (Objects.nonNull(personArray[i])) {
                System.out.println("ID: " + i + personArray[i]);
            } else {

            }
        }
    }

    public void bookSlot() {
        int toNullCounter = 0;
        for (int i = 0; i < personArray.length; i++) {
            if (Objects.nonNull(personArray[i])) {
                System.out.println("ID: " + i + personArray[i]);
            } else {

            }
        }
        testPrintAll();
        /*System.out.print("Enter the id of member you'd like to book in: ");
        int selection = uInput.nextInt();
        if (Objects.nonNull(personArray[selection])) {
            var test = personArray[selection];
        } else {
            personArray[selection] = new Member(Person.BookedStatus.booked);
        }

        System.out.println("How many weeks in advance do you want to book?");
        courts.bookCourt();*/
    }

    public void testPrintAll() {
        System.out.println(Court.court[0].week[10].day[5].hour[7].setBookedById(personArray[0].bookedStatus));
        System.out.println(Court.court[1].week[10].day[5].hour[8].setBookedById(personArray[1].bookedStatus));
    }

    public void printBookings() {
        for (int i = 0; i < Court.court.length; i++) {
            for (int j = 0; j < Court.court[i].week.length; j++) {
                for (int k = 0; k < Court.court[i].week[j].day.length; k++) {
                    for (int l = 0; l < Court.court[i].week[j].day[k].hour.length; l++) {
                        if (Court.court[i].week[j].day[k].hour[l].getBookedStatus() == Hours.BookedStatus.booked) {
                            System.out.println(Court.court[i].week[j].day[k].hour[l]);
                        }
                    }
                }
            }
        }
    }

 /*switch (uInput.nextInt()) {
        case 1:
            System.out.print("How many courts to create: ");
            int selection = uInput.nextInt();
            courts = new Court(selection);
            menu();
        case 2:
            //this
            createMembers();
            //or
                    *//*System.out.print("How many members to create: ");
                    int test = uInput.nextInt();
                    Member members = new Member(test);*//*
            menu();
        case 3:
            addMember();
            menu();
        case 4:
            removeMembers();
            menu();
        case 5:
            printMembers();
            menu();
        case 6:
            //this error..
            courts.printCourt();
        case 7:
            break;
        default:
            System.out.println("Invalid entry try again: ");
            menu();
    }
} else {
        System.out.println("You've quit the program.");
        }
        }*/


}
