package com.company.Problem2.Registered;


import java.util.Scanner;

public class Member extends Person {

    //scanner for users input.
    Scanner uInput = new Scanner(System.in);
    MemberShipStatus memberShipStatus;
    int memberShipNo;


    public Member() {
        super();
            memberShipStatus = setMemberShipType();

        System.out.println("testTESt$0dtkfyihjgfhfg");
            setMemberShipNumber();
            if(true) {
                this.bookedStatus = BookedStatus.booked;
            }
        }


    public Member(int noOfMembers) {
        super();
        for (int i = 0; i < noOfMembers; i++) {
            memberShipStatus = setMemberShipType();
            this.setMemberShipNumber();
        }
    }

    public Member(String forename, String surname, String email, String mobileNo) {
        super(forename, surname, email, mobileNo);

    }

    //setters
    public void setMemberShipNo(int test) {
        this.memberShipNo = test;
    }


    //getters
    public int getMemberShipNo() {
        return memberShipNo;
    }

    public BookedStatus getBookedStatus() {
        return bookedStatus;
    }

    public MemberShipStatus getMemberShipStatus() {
        return memberShipStatus;
    }

    //methods
    public MemberShipStatus setMemberShipType() {
        System.out.println("What membership type does this person have?");
        System.out.println("Select 1) 'Bronze'");
        System.out.println("Select 2) 'Silver'");
        System.out.println("Select 3) 'Gold'");
        System.out.println("Anything other key) 'None'");


        int i = uInput.nextInt();
        return switch (i) {
            case 1 -> memberShipStatus.bronze;
            case 2 -> memberShipStatus.silver;
            case 3 -> memberShipStatus.gold;
            default -> memberShipStatus.none;
        };
    }

    public void setMemberShipNumber() {
        if (getMemberShipStatus() == memberShipStatus.none) {

        } else if (getMemberShipStatus() != memberShipStatus.none) {
            System.out.print("please enter membership number: ");
            memberShipNo = uInput.nextInt();
            setMemberShipNo(memberShipNo);
        } else {
            setMemberShipNo((int) (Math.random() * 1000));
        }
    }

    //print Member
    @Override
    public String toString() {
        return "Member{" +
                "memberShipNo=" + memberShipNo +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", memberShipStatus=" + memberShipStatus +
                '}';
    }
}

