package org.example.Lesson2;

public class Docunent extends File {

    private int numberOfPages;

    public Docunent(String name, int sizeInBytes, String fileFormat, int numberOfPages) {
        super(name, sizeInBytes, fileFormat);
        setNumberOfPages(numberOfPages);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("Number of pages cannot be 0 or negative");
        }
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(" %-52s | \n", (getFileFormat() + ", " + numberOfPages + " pages") );

    }
}
