package com.company.Problem2.Registered;


import java.util.Scanner;

public class Person {

    //scanner for users input.
    Scanner uInput = new Scanner(System.in);


    //enum for membership status for person object.
    enum MemberShipStatus {
        none, bronze, silver, gold
    }

    public enum BookedStatus {
        unbooked, booked
    }

    public String forename;
    public String surname;
    public String email;
    public String mobileNo;
    public MemberShipStatus memberShipStatus;
    public BookedStatus bookedStatus;

    public Person() {
        System.out.println("\n");
        System.out.print("Please enter first name: ");
        setForename(uInput.nextLine());
        System.out.print("Please enter last name: ");
        setSurname(uInput.nextLine());
        System.out.print("Please enter email: ");
        setEmail(uInput.nextLine());
        System.out.print("Please enter mobile no: ");
        setMobileNo(uInput.nextLine());
        memberShipStatus = MemberShipStatus.none;
        bookedStatus = BookedStatus.unbooked;
    }

    public void Person(BookedStatus test) {
        this.forename = getForename();
        this.surname = getSurname();
        this.email = getEmail();
        this.mobileNo = getMobileNo();
        this.memberShipStatus = getMemberShipStatus();
        bookedStatus = test;
    }

    public Person(String forename, String surname, String email, String mobileNo) {
    }
    //setters
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

    /*public void setBookedStatus(BookedStatus book) {
        this.bookedStatus = book;
    }*/

    //getters
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

    public MemberShipStatus getMemberShipStatus() {
        return memberShipStatus;
    }

}
