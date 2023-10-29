package org.example.Lesson2;

public class Image extends File{

    private ImageSize imageSize;

    public Image(String name, int sizeInBytes, String fileFormat, int height, int width) {
        super(name, sizeInBytes, fileFormat);
        imageSize = new ImageSize(height, width);
    }


    public ImageSize getImageSize() {
        return imageSize;
    }

    @Override
    public void print(){
        super.print();
        System.out.printf(" %-52s | \n", (getFileFormat() + ", " + imageSize.toString() ));
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }
}
