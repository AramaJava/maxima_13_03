package lesson_10.media;

import java.util.SplittableRandom;

public class DVDdisk {
    private String name;
    private int year;

    public DVDdisk() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DVDdisk{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static DVDdisk OldestDVDdisk(DVDdisk[] disks) {
        DVDdisk OldestDVDisk = disks[0];
        for (DVDdisk disk: disks) {
           if (OldestDVDisk.getYear()>disk.getYear()) {OldestDVDisk=disk;}
        }
        return OldestDVDisk;
    }


}
