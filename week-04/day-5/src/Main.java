import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        ToDoApp myToDoApp = new ToDoApp();

        try {
            Path tasksPath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-04\\day-5\\src\\tasks.txt");

            if (args.length == 0) {
                myToDoApp.printOutPossibilities();
            } else if (args[0].equals("-l")) {
                myToDoApp.listTask();
            } else if (args[0].equals("-a")) {
                myToDoApp.addTask(args);
            } else if (args[0].equals("-r")) {
                try {
                    myToDoApp.removeTask(args);
                } catch (NumberFormatException e) {
                    System.out.println("Unable to remove: index is not a number.");
                }
            } else if (args[0].equals("-c")) {
                try {
                    myToDoApp.checkTask(args);
                } catch (NumberFormatException e) {
                    System.out.println("Unable to check: index is not a number");
                }
            } else {
                System.out.println("Unsupported argument");
            }
        } catch (
                ArrayIndexOutOfBoundsException e) {
        }
    }
}


