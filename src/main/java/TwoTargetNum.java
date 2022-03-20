import java.util.HashMap;
import java.util.Map;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
          int[] outputArray = new int[2];
          Map<Integer,Integer> tgtNumDifferenceByIntegerPositions = new HashMap<Integer,Integer>();
          
          for (int i = 0 ; i < array.length; i++){
           if (tgtNumDifferenceByIntegerPositions.containsKey(array[i])){
               outputArray[0] = array[tgtNumDifferenceByIntegerPositions.get(array[i])];
               outputArray[1] = array[i];
               return outputArray;
           }
              
           tgtNumDifferenceByIntegerPositions.put(targetSum - array[i], i);
          }
          
      return new int[0];
    }
}