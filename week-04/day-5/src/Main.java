import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        ToDoApp myToDoApp = new ToDoApp();

        try {
            Path tasksPath = Paths.get("D:\\Desktop\\GFA\\greenfox\\jansorna\\week-04\\day-5\\src\\tasks.txt");

            if (args.length == 0) {
                myToDoApp.printOutPossibilities();
            }

            if (args[0].equals("-l")) {
                myToDoApp.listTask();
            }

            if (args[0].equals("-a")) {
                myToDoApp.addTask(args);
            }

            try {
                if (args[0].equals("-r")) {
                    myToDoApp.removeTask(args);
                }
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not a number.");
            }

            try {
                if (args[0].equals("-c")) {
                    myToDoApp.checkTask(args);
                }
            } catch (NumberFormatException e) {
                System.out.println("Unable to check: index is not a number");
            }

            if (args[0] != "-l" && args[0] != "-a" && args[0] != "-r" && args[0] != "-r") {
                System.out.println("Unsupported argument");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}


