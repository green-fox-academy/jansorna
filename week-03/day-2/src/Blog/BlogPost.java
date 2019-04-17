package Blog;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {

        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return ("Author: " + authorName + " Title: " + title + " Publication date: " + publicationDate);
    }
}
