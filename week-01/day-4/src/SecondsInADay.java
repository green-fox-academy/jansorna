public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInHours = 3600;
        int secondsInMinutes = 60;

        int remaingSeconds = (24 * secondsInHours -(currentHours * secondsInHours + currentMinutes * secondsInMinutes + currentSeconds));

        System.out.println(remaingSeconds);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}
