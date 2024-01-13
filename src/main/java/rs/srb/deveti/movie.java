package rs.srb.deveti;

public class movie {
    private String title;
    private String director;
    private int duration;
   private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 10) {
            rating = 10;

        }
        if (rating >10) {
            rating=1;

        }
        this.rating = rating;
    }
}
