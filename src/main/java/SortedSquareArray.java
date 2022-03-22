import java.util.Arrays;

public class SortedSquareArray {
    public int[] sortArray(int[] initialArray){
        int[] sortedArray = new int[initialArray.length];
        for (int i=0; i < initialArray.length; i++){
            int value = initialArray[i];
            sortedArray[i] = value * value;
        }
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
