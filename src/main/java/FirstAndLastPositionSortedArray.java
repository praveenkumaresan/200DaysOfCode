// if inputArray is empty , return [-1,-1]
// find the first bound and last bound of target in array.

class FirstAndLastPositionSorted{

    public int[] findFirstAndLastPosition(int[] inputArray, int targetNumber){
        int firstBound = searchInArray(inputArray, targetNumber, true);
        if (firstBound == -1){
            return new int[]{-1,-1};
        }
        int lastBound = searchInArray(inputArray, targetNumber, false);
        return new int[]{firstBound, lastBound};
    }

    private int searchInArray(int[] inputArray, int targetNumber, Boolean isFirst){
        
        int start = 0;
        
        int arrayLength = inputArray.length;
        int end = arrayLength - 1;
        

        while(start <= end){
            int mid = (start +  arrayLength ) / 2;
            if (inputArray[mid] == targetNumber){
                if (isFirst){
                  if (mid == start || inputArray[mid-1] != targetNumber){
                      return mid;
                  }
                }else{
                  if (mid == end || inputArray[mid + 1] != targetNumber ){
                      return mid
                  }      
                }
                return mid;
            } else if (inputArray[mid] > targetNumber){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return -1;
    }

}