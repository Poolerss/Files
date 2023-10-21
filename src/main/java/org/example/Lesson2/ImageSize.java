package org.example.Lesson2;

public class ImageSize {
    private int height;
    private int width;

    public ImageSize(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height<=0){
            throw new IllegalArgumentException("incorrect height input format");
        } else {
        this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0){
            throw new IllegalArgumentException("incorrect wight input format");
        }else {
            this.width = width;
        }
    }

    public void printSize(){
        System.out.printf("%ix%i",height, width);
    }
}
