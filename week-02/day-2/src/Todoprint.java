public class Todoprint {

    public static void main(String[] args){
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        todoText = fixer(todoText);
        System.out.println(todoText);
    }

    public static String fixer(String input) {
        String beginning = "My todo:";
        String secondTask = " - Download games";
        String thirdTask = " - Diablo";

        return beginning + "\n" + input + secondTask + "\n" + "\t" + thirdTask;
    }
}
