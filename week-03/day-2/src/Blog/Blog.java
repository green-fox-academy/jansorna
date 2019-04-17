package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blog;

    public Blog() {
        this.blog = new ArrayList<>();
    }

    public void add(BlogPost addedBlogPost) {
        blog.add(addedBlogPost);
    }

    public void delete(int deletedBlogPost) {
        blog.remove(deletedBlogPost);
    }

    public void update(int indexOfUpdatedBlogPost, BlogPost thisBlogPostUpdates) {
        blog.set(indexOfUpdatedBlogPost, thisBlogPostUpdates);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < blog.size(); i++) {
            result += (i + 1) + ". " + blog.get(i) + "\n";
        }
        return result;
    }
}
