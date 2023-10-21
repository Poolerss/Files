package org.example.Lesson2;


import java.util.ArrayList;
import java.util.List;

import static org.example.Lesson2.File.printAll;

public class Main {
    public static void main(String[] args) {
        File docunent = new Docunent("j110-lab2-hiers",23212,"docx",2);

        ArrayList files = new ArrayList();
        files.add(docunent);

        printAll(files);



    }
}