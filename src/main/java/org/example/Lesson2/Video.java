package org.example.Lesson2;

import java.util.Date;

public class Video extends Multimedia {
   private int height;
    private int width;

    public Video(String name, int sizeInBytes, String fileFormat, String description, Date duration, int height, int width) {
        super(name, sizeInBytes, fileFormat, description, duration);
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
