import java.lang.reflect.Array;

public class Maximumfinder {

    public static void main(String[] args) {

        int[] inputArray = {1,2,3,5,10,20,15};
        int lenghtOfArrays = inputArray.length - 1;
        int number = 0;

        System.out.println(maximumFinder(inputArray, lenghtOfArrays, number));
    }

    public static int maximumFinder (int [] arrayA, int position, int biggestElement){

        if (position <= 0) {
            return biggestElement;

        } else if (arrayA[position] > biggestElement){

            return maximumFinder(arrayA, position - 1, arrayA[position]);
        } else {

            return maximumFinder(arrayA, position - 1, biggestElement);
          }
    }
}
