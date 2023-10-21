package org.example.Lesson2;

import java.sql.SQLOutput;

public class Duration {
    private byte hours;
    private byte minutes;
    private byte seconds;

    public Duration(byte hours, byte minutes, byte seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(byte hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("incorrect hours input format");
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(byte minutes) {
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("incorrect minutes input format");
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(byte seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("incorrect seconds input format");
        } else {
            this.seconds = seconds;
        }
    }

    public void printDate(){
        System.out.printf("%b:%b:%b", hours,minutes,seconds);
    }

}