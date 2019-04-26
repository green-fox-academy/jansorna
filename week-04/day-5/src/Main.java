import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path tasksPath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-04\\day-5\\src\\tasks.txt");

        if (args.length == 0) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println();
            System.out.println("Command line arguments:");
            System.out.println("-l   Lists all the tasks");
            System.out.println("-a   Adds a new task");
            System.out.println("-r   Removes a task");
            System.out.println("-c   Completes a task");
        }

        if (args[0].equals("-l")) {
            try {
                List<String> lines = Files.readAllLines(tasksPath);

                if (lines.isEmpty()) {
                    System.out.println("No todos for today! :)");
                }

                for (int i = 0; i < lines.size(); i++) {
                    System.out.println((i + 1) + " - " + lines.get(i));
                }
            } catch (IOException e) {
                System.out.println("Something went wrong wit tasks file.");
            }
        }

        if (args[0].equals("-a")) {
            try {
                List<String> content = Files.readAllLines(tasksPath);

                for (int i = 0; i < args.length - 1; i++) {
                    content.add(args[i + 1]);
                }
                Files.write(tasksPath, content);
            } catch (IOException e) {
                System.out.println("Something went wrong wit tasks file.");
            }
        }

        

    }
}
