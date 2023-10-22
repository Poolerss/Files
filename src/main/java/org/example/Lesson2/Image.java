package org.example.Lesson2;

public class Image extends File{
    private String fileFormat;
    private ImageSize imageSize;

    public Image(String name, int sizeInBytes, String fileFormat, int height, int width) {
        super(name, sizeInBytes);
        setFileFormat(fileFormat);
        setImageSize(imageSize);
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

    public ImageSize getImageSize() {
        return imageSize;
    }

    public void setImageSize(ImageSize imageSize) {
        this.imageSize = imageSize;
    }
}
