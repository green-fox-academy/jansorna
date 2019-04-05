public class DrawChessTable {

    public static void main(String[] args) {

        int numberOfLine = 2;
        String sign = "%";
        String emptySign = " ";
        String line = "";

        for (int i = 0; i < 8; i++) {
            line = "";
            boolean oddOrEven = (i %2 == 0);
            if (oddOrEven) {
                line = "% % % % % % % %";
            } else {
                line = " % % % % % % % ";
            }
            System.out.println(line);
        }
    }
}
