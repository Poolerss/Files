package org.example.Lesson2;

public class Docunent extends File {
    private String fileFormat;
    private int numberOfPages;

    public Docunent(String name, int sizeInBytes, String fileFormat, int numberOfPages) {
        super(name, sizeInBytes);
        setFileFormat(fileFormat);
        setNumberOfPages(numberOfPages);
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages<=0){
            throw new IllegalArgumentException("Number of pages cannot be 0 or negative");
        }
        this.numberOfPages = numberOfPages;
    }
}
