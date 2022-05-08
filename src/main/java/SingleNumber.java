// example 1
// Input: nums = [2,2,1]
// Output: 1

// example 2
// Input: nums = [4,1,2,1,2]
// Output: 4

// example 3
// Input: nums = [1]
// Output: 1

class Solution{
	public int singleNumber(int[] nums){
		int singleNumber = 0;
		for (int i : nums ) {
			singleNumber ^= i;
		}
		return singleNumber;
	}
}