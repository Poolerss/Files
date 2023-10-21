package org.example.Lesson2;

import java.util.ArrayList;

public class File {
    private String name;
    private int sizeInBytes;

    public File(String name, int sizeInBytes) {
        setName(name);
        setSizeInBytes(sizeInBytes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }else{
            throw new IllegalArgumentException("the name field cannot be empty or contain spaces");}
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(int sizeInBytes) {
        if (sizeInBytes <= 0) {
            throw new IllegalArgumentException("Size cannot be 0 or negative");
        }else{
        this.sizeInBytes = sizeInBytes;}
    }
    public static void printAll(ArrayList files){
        System.out.println();

    }
}
