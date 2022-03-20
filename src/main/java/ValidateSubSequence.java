import java.util.List;

public class ValidateSubSequence {

    public static boolean checkSequenceMethod(List<Integer> mainArray, List<Integer> sequenceArray){
        int mainArrayIndex = 0;
        int sequenceArrayIndex = 0;

        while (mainArrayIndex < mainArray.size() && sequenceArrayIndex < sequenceArray.size()){
            if (mainArray.get(mainArrayIndex).equals(sequenceArray.get(sequenceArrayIndex))){
                sequenceArrayIndex++;
            }
            mainArrayIndex++;
        }

        return sequenceArrayIndex == sequenceArray.size();
    }
}
