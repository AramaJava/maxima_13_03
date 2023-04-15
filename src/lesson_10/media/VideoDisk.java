package lesson_10.media;

public class VideoDisk extends DVDdisk{
    private String producer;
    private String director;
    private int countOfMinutes;

    public VideoDisk() {
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCountOfMinutes() {
        return countOfMinutes;
    }

    public void setCountOfMinutes(int countOfMinutes) {
        this.countOfMinutes = countOfMinutes;
    }

    @Override
    public String toString() {
        return "VideoDisk{" +
                "producer='" + producer + '\'' +
                ", director='" + director + '\'' +
                ", countOfMinutes=" + countOfMinutes +
                '}';
    }
}
