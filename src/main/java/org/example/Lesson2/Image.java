package org.example.Lesson2;

public class Image extends File{
    private String fileFormat;
    int height;
    int width;

    public Image(String name, int sizeInBytes, String fileFormat, int height, int width) {
        super(name, sizeInBytes);
        setFileFormat(fileFormat);
        setHeight(height);
        setWidth(width);
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
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
