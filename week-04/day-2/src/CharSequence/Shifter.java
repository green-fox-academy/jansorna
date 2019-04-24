package CharSequence;

public class Shifter implements CharSequence {
    String stringOfShifter;

    public Shifter(String inputString, int position) {
        this.stringOfShifter = shifting(inputString, position);
    }

    @Override
    public int length() {
        return stringOfShifter.length();
    }

    @Override
    public char charAt(int index) {
        return stringOfShifter.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return stringOfShifter.subSequence(start,end);
    }

    public String shifting (String inputString, int position){
        return (String)(inputString.subSequence(position, inputString.length())) + (String) (inputString.subSequence(0, position));
    }
}
