package org.example.Lesson2;

import java.util.ArrayList;


public class File {
    private String name;
    private int sizeInBytes;

    private String fileFormat;

    public File(String name, int sizeInBytes, String fileFormat) {
        setName(name);
        setSizeInBytes(sizeInBytes);
        setFileFormat(fileFormat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("the name field cannot be empty or contain spaces");
        }
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        if (!fileFormat.isBlank()) {
            this.fileFormat = fileFormat;
        } else {
            throw new IllegalArgumentException("The file format is incorrect");
        }
    }

    public void setSizeInBytes(int sizeInBytes) {
        if (sizeInBytes <= 0) {
            throw new IllegalArgumentException("Size cannot be 0 or negative");
        } else {
            this.sizeInBytes = sizeInBytes;
        }
    }

    public void print() {
        System.out.printf("| %-20s | %-10s |", (name + "." + fileFormat), sizeInBytes);
    }


    public static void printAll(ArrayList<File> files) {
        System.out.println("+----------------------+------------+------------------------------------------------------+");
        System.out.printf("| %-20s | %-10s | %-52s |\n", "File name", "Size", "Details");
        System.out.println("+----------------------+------------+------------------------------------------------------+");
        files.forEach(File::print);
        System.out.println("+----------------------+------------+------------------------------------------------------+");
        }
    }



