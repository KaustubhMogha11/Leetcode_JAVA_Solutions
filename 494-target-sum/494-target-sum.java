class Solution {
   int ans = 0;

public int findTargetSumWays(int[] nums, int target) {
	backtrack(0, -target, nums);
	return ans;
}

private void backtrack(int i, int sum, int[] nums) {
	if (i == nums.length) {
		if (sum == 0) ans++;
		return;
	}

	backtrack(i + 1, sum + nums[i], nums);
	backtrack(i + 1, sum - nums[i], nums);
}
}