package com.company.Problem2.Time;

import java.util.Arrays;

public class Days {

    private String dayName;
    public int days;
    //public String dayName;

    public Hours[] hour = new Hours[9];

    public Days(int daysValue) {
        setDayValue(daysValue);
        setDayName();
            for (int printLoop = 0; printLoop < 1; printLoop++) {
                //System.out.println("Week: " + i + 6);
                for (int hoursLoop = 0; hoursLoop < 9; hoursLoop++) {
                    //System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hours");
              hour[hoursLoop] = new Hours(hoursLoop + 8);
               //day[hoursLoop].printHours();
            }
    }
}

    public void setDayValue(int days) {
        this.days = days;
    }

    //enhanced switch statement takes day value 0-6 from loop and assigns the dayName.
    private void setDayName() {
        switch (this.getDaysValue()) {
            case 0 -> dayName = "Mon";
            case 1 -> dayName = "Tues";
            case 2 -> dayName = "Wed";
            case 3 -> dayName = "Thurs";
            case 4 -> dayName = "Fri";
            case 5 -> dayName = "Sat";
            case 6 -> dayName = "Sun";
        }
        }

    //getters
    public int getDaysValue() {
        return days;
    }

    public void printDays() {
        System.out.println("No more time slots for: " + dayName + "\n");
    }



    public void printTest() {
        int counter = 1;
        for (int i = 0; i < 7; i++) {
            System.out.println("Day: " + (hour[i].hours + 1));
            System.out.println(hour[i]);
            counter++;
        }
    }


    /*public String toString() {
        return "Days{" +
                "day=" + dayName +
                "hours=" + Arrays.toString(day);
    }*/
    @Override
    public String toString() {
        return  dayName + " " + Arrays.toString(hour) + "\n";
    }
}
