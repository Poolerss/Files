package org.example.Lesson2;

import java.util.Date;

public class Video extends Multimedia {
   private ImageSize imageSize;


    public Video(String name, int sizeInBytes, String fileFormat, String description, Duration duration, ImageSize imageSize) {
        super(name, sizeInBytes, fileFormat, description, duration);
        setImageSize(imageSize);
    }

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }
}
