package sample;

/*
    Simple POJO class
 */
public class Game {
    private String name;
    private String genre;
    private String dev;
    private String year;
    private String platform;

    public Game(String name, String genre, String dev, String year, String platform) {
        this.name = name;
        this.genre = genre;
        this.dev = dev;
        this.year = year;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
