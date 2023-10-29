package org.example.Lesson2;

import java.sql.SQLOutput;

public class Duration {
    private int hours;
    private int minutes;
    private int seconds;

    public Duration(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("incorrect hours input format");
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 60) {
            throw new IllegalArgumentException("incorrect minutes input format");
        } else {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            throw new IllegalArgumentException("incorrect seconds input format");
        } else {
            this.seconds = seconds;
        }
    }


    @Override
    public String toString() {
        if (hours != 0) {
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        } else {
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}