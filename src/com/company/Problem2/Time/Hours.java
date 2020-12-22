package com.company.Problem2.Time;

import com.company.Problem2.Registered.Member;
import com.company.Problem2.Registered.Person;

public class Hours {




    public enum BookedStatus {
        unbooked, booked
    }

    public String times;
    public int hours;
    public BookedStatus bookedStatus;

    public Member placeholder = null;
    public Person.BookedStatus bookedById;

    public Hours(int hoursValue) {
        setHoursValue(hoursValue + 1);
        setHoursName();
        this.bookedStatus = BookedStatus.unbooked;
        this.placeholder = null;
    }

    //setters
    public void setHoursValue(int hours) {
        this.hours = hours;
    }

    //enhanced switch statement
    public void setHoursName() {
        int currHour = this.getHoursValue();

        if (currHour > 12) {
            currHour -= 12;
        }
        times =  currHour + ":00";
    }

    public Person.BookedStatus setBookedById(Person.BookedStatus test) {
        this.bookedById = test;
        this.bookedStatus = BookedStatus.booked;
        return this.bookedById;
    }

    //getters
    public int getHoursValue() {
        return hours;
    }

    public BookedStatus getBookedStatus() {
        return bookedStatus;
    }

    /*//printers
    public String toString() {
        return "Hours{" +
                "times='" + times + '\'' +
               *//* ", hours=" + hours +*//*
                *//*", bookedStatus=" + bookedStatus +
                ", bookedById=" + bookedById +*//*
                '}';
    }*/
    //printers
    @Override
    public String toString() {
        return "" + times + " Is : " + bookedStatus;
                /*", bookedStatus=" + bookedStatus +
                ", bookedById=" + bookedById +*/
    }

    public void printHours() {
        System.out.println(times + " Is " + bookedStatus);
    }

}
