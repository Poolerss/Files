package org.example.Lesson2;


import java.util.ArrayList;
import java.util.List;

import static org.example.Lesson2.File.printAll;

public class Main {
    public static void main(String[] args) {
        File document = new Docunent("j110-lab2-hiers", 23212, "docx", 2);
        File image = new Image("spb-map", 1703527, "png", 1024, 3072);

        File video = new Video("BackToFuture1", 1_470_984_192, "avi",
                "video, Back to the future 1, 1985", 1, 48, 8, 640, 352);

        File multimedia = new Multimedia("06-prettyGirl", 7893454, "mp3",
                "audio, Eric Clapton, Pretty Girl", 0, 5, 28);

        ArrayList<File> files = new ArrayList<>();
        files.add(document);
        files.add(image);
        files.add(multimedia);
        files.add(video);


        printAll(files);


    }
}