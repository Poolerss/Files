package org.example.Lesson2;


public class Video extends Multimedia {
   private ImageSize imageSize;


    public Video(String name, int sizeInBytes, String fileFormat, String description,
                 int hours, int minutes, int seconds, int height, int width) {
        super(name, sizeInBytes, fileFormat, description, hours, minutes, seconds);
        imageSize= new ImageSize(height, width);
    }


    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }
@Override
    public void print(){
    System.out.println();
    System.out.printf("| %-20s | %-10s | %-52s | \n", (getName() + "." + getFileFormat()), getSizeInBytes(),
            (getDescription() + ", " + getDuration().toString() + ", " + imageSize.toString() ));

    }
}


