class Solution {
		public int maximumProduct(int[] nums) {
			Arrays.sort(nums);
			int n = nums.length;
			int lastMax =  nums[n-1]*nums[n-2]*nums[n-3];
			int firstLastMax = nums[0]*nums[1]*nums[n-1];
			// if(lastMax >= firstLastMax) {
			//     return lastMax;
			// } 
			// return firstLastMax;
			return Math.max(lastMax, firstLastMax);
		}
	}