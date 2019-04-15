import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        String logFile = "log.txt";

        System.out.println(getUniqueIPAdresses(logFile));
        System.out.println(getGETPOSTratio(logFile));

        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.
    }

    public static List<String> getUniqueIPAdresses(String logFile) {

        try {
            Path logFilePath = Paths.get(logFile);

            List<String> content = Files.readAllLines(logFilePath);

            List<String> IPAdresses = new ArrayList<>();
            List<String> IPAdressesUnique = new ArrayList<>();

            for (String line : content) {
                IPAdresses.add(line.substring(27, 37));
            }

            for (String line : IPAdresses) {
                if (IPAdressesUnique.contains(line)) {
                } else {
                    IPAdressesUnique.add(line);
                }
            }
            return IPAdressesUnique;
        } catch (IOException e) {
            List<String> failedList = new ArrayList<>();
            failedList.add("Failed to return IP adresses.");
            return failedList;
        }
    }

    public static double getGETPOSTratio(String logFile) {

        try {
            Path logFilePath = Paths.get(logFile);
            List<String> content = Files.readAllLines(logFilePath);

            double volumeOfGET = 0;
            double volumeOFPOST = 0;

            for (String line : content) {
                if (line.contains("GET")) {
                    volumeOfGET++;
                } else if (line.contains("POST")) {
                    volumeOFPOST++;
                }
            }
            return volumeOfGET / volumeOFPOST;
        } catch (IOException e) {
            return 0;
        }
    }
}