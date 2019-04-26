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
                System.out.println("Unsupported argument.");
            }

            if (args[0].equals("-c")) {
                myToDoApp.checkTask(args);
            }


        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}


