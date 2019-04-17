package Blog;

public class Main {
    public static void main(String[] args) {

        //start testing

        BlogPost firstBlogPost = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost secondBlogPost = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost thirdBlogPost = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        Blog myFirstBlog = new Blog();

        myFirstBlog.add(firstBlogPost);
        myFirstBlog.add(secondBlogPost);
        myFirstBlog.add(thirdBlogPost);

        System.out.println(myFirstBlog);

        myFirstBlog.delete(2);

        System.out.println(myFirstBlog);

        myFirstBlog.update(0, thirdBlogPost);

        System.out.println(myFirstBlog);

        //end testing
    }
}
