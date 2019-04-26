import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ToDoApp {

    Path tasksPath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-04\\day-5\\src\\tasks.txt");

    public void printOutPossibilities(){
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println("-l   Lists all the tasks");
        System.out.println("-a   Adds a new task");
        System.out.println("-r   Removes a task");
        System.out.println("-c   Completes a task");
    }

    public void listTask() {
        try {
            List<String> lines = Files.readAllLines(tasksPath);
            if (lines.isEmpty()) {
                System.out.println("No todos for today! :)");
            }
            for (int i = 0; i < lines.size(); i++) {
                System.out.println((i + 1) + " - " + lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Something went wrong with tasks file.");
        }
    }

    public void addTask(String args[]){
        if (args.length == 1) {
            System.out.println("Unable to add: no task provided");
        }
        try {
            List<String> content = Files.readAllLines(tasksPath);

            for (int i = 0; i < args.length - 1; i++) {
                content.add("[ ] " + args[1]);
            }
            Files.write(tasksPath, content);
        } catch (IOException e) {
            System.out.println("Something went wrong with tasks file.");
        }
    }

    public void removeTask(String args[]){
        if (args.length == 1) {
            System.out.println("Unable to remove: no index provided");
        }
        int numberOfRemoval = Integer.parseInt(args[1]) - 1;
        try {
            List<String> content = Files.readAllLines(tasksPath);
            content.remove(numberOfRemoval);
            Files.write(tasksPath, content);

        } catch (IOException e) {
            System.out.println("Something went wrong with tasks file.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: index is out of bound.");
        }
    }

    public void checkTask(String[] args) {
        if (args.length == 1) {
            System.out.println("Unable to remove: no index provided");
        }
        int numberOfChecker = Integer.parseInt(args[1]) - 1;
        try {
            List<String> content = Files.readAllLines(tasksPath);

            content.set(numberOfChecker, "[X] " + content.get(numberOfChecker).substring(4));
            Files.write(tasksPath, content);

        } catch (IOException e) {
            System.out.println("Something went wrong with tasks file.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Unable to remove: index is out of bound.");
        }
    }
}

