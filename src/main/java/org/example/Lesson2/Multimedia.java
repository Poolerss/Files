package org.example.Lesson2;

import java.util.Date;

public class Multimedia extends File{

    private String description;
    private Duration duration;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void print(){
        super.print();
        System.out.printf(" %-52s | ",(description + ", " + duration.toString()));
    }

    public Multimedia(String name, int sizeInBytes, String fileFormat, String description,
                      int hours, int minutes, int  seconds) {
        super(name, sizeInBytes, fileFormat);
        setDescription(description);
        duration = new Duration(hours, minutes, seconds);
    }
}

