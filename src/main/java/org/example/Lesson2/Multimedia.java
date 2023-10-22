package org.example.Lesson2;

import java.util.Date;

public class Multimedia extends File{
    private String fileFormat;
    private String description;
    private Duration duration;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Multimedia(String name, int sizeInBytes, String fileFormat, String description, Duration duration) {
        super(name, sizeInBytes);
        setFileFormat(fileFormat);
        setDescription(description);
        setDuration(duration);
    }
}

