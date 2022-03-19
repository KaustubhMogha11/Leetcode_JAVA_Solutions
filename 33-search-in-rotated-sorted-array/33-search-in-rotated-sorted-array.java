class Solution {
    public int search(int[] nums, int target) {
        
        int pivot=findPivot(nums);
        
           // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }
        
        if(nums[pivot]==target)
            return pivot;
        
          if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
        
    }
    
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    
      public int findPivot(int[] nums){
          int s=0;
          int e=nums.length-1;
          while(s<=e)
          {
              int mid=s+(e-s)/2;
              
              if(mid<e && nums[mid]>nums[mid+1])
                  return mid;
              if(mid>s && nums[mid]<nums[mid-1])
                  return mid;
              
              
              if(nums[mid]<=nums[s])
                  e=mid-1;
              else 
                  s=mid+1;
                  
                  
                  
                  
          }
          return -1;
      }

}