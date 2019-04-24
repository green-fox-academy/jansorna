package CharSequence;

public class Gnirts implements CharSequence {
    String stringOfGnitrs;

    public Gnirts(String inputString) {
        this.stringOfGnitrs = reverse(inputString);
    }

    @Override
    public char charAt(int index) {
        return stringOfGnitrs.charAt(index);
    }

    @Override
    public int length() {
        return stringOfGnitrs.length();
    }

    @Override
    public String subSequence(int start, int end) {
        return (String) stringOfGnitrs.subSequence(start, end);
    }

    public String reverse(String input) {
        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }
}
