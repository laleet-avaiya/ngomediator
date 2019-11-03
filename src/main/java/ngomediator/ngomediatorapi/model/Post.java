package ngomediator.ngomediatorapi.model;

public class Post {
    private String title;
    private String discription;

    public Post(String title, String discription) {
        this.title = title;
        this.discription = discription;
    }

    public String getTitle() {
        return title;
    }

    public String getDiscription() {
        return discription;
    }
}
