import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

public class Urlfixer {

    public static void main(String[] args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");

        System.out.println(addChar(url));
    }

    public static String addChar(String input) {
        int position = 5;
        String missingChar = ":";
        return input.substring(0, position) + missingChar + input.substring(position);
    }

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
}
