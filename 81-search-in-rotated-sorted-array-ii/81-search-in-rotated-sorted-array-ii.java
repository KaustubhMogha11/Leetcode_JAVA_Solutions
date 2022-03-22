// class Solution {
//     public boolean search(int[] nums, int target) {
//         // if(nums.length==1 && nums[0]!=target)
//         // {
//         //     return false;
//         // }
//           int pivot=findPivot(nums);
        
//            // if you did not find a pivot, it means the array is not rotated
//         if (pivot == -1) {
//             // just do normal binary search
//             return binarySearch(nums, target, 0 , nums.length - 1);
//         }
        
//         if(nums[pivot]==target)
//             return true;
        
//           if (target >= nums[0]) {
//             return binarySearch(nums, target, 0, pivot - 1);
//         }

//         return binarySearch(nums, target, pivot + 1, nums.length - 1);
//     }
//       static boolean binarySearch(int[] arr, int target, int start, int end) {
//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 // ans found
//                 return true;
//             }
//         }
//         return false;
//     }
    
//       public int findPivot(int[] nums){
//           int start=0;
//           int end=nums.length-1;
//           while(start<=end)
//           {
//               int mid=start+(end-start)/2;
              
//               if(mid<end && nums[mid]>nums[mid+1])
//                   return mid;
//               if(mid>start && nums[mid]<nums[mid-1])
//                   return mid;
              
              
//             if(nums[mid]==nums[start] && nums[mid]==nums[end])
//             {
//                 if(start!=nums.length-1 && nums[start]>nums[start+1])
//                 {
//                     return start;
//                 }
//                 start++;
                
//                 if(end!=0 && nums[end]>nums[end-1])
//                 {
//                     return end;
//                 }
//                 end--;
//             }else if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]<nums[end])
//             {
//                 start=mid+1;
//             }else
//                 end=mid-1;
                  
                  
                  
//           }
//           return -1;
//       }


// }
class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target)
                return true;
            
            if(nums[mid] == nums[start] && nums[mid] == nums[end])         //if this follows then it means that 1st half could be out of order i.e., not in ascending order and if middle and starting elements are equal then it is guaranteed that ending and mid elements are equal. So ignore them and decrease the search space
            {
                start++;
                end--;
            }
            else if(nums[start] <= nums[mid])                          //check if 1st half is sorted
            {
                if(nums[start] <= target && target <= nums[mid])      // check if target lies in the 1st half
                    end = mid - 1;
                else                                                  //search in right half. divide right half in two subarrays
                    start = mid + 1;
            }
            else                                                     //since left half is not sorted it means right half is sorted. check for right half
            {
                if(nums[mid] <= target && target <= nums[end])       // check if target lies in 2nd half
                    start = mid + 1;
                else                                                // search in left half
                    end = mid - 1;
            }
        }
        
        return false;
    }
}