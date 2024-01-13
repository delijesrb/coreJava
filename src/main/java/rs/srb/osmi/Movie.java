package rs.srb.osmi;

 class Movie {
    private String director;
    private String title;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    private int duration;
    private int rating;//1-10

    public int getRating() {
        System.out.println("neko hoce znaci da zna ocenu filma");
        return rating;
    }
    public void setRating(int ocena) {

        if (ocena > 10) {
            ocena = 10;
        }
        if (ocena < 1) {
            ocena = 1;

        }rating=ocena;
    }


}
