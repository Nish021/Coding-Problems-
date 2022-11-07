https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.* ;

class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int start = 0;
        int end = nums.length-1;
        int start1 = 0;
        int end1 = nums.length-1;
        int res[] = new int[2];
        int first = -1;
        int last = -1;
        
        //for first element
        while(start <= end){
            int mid = start  + (end - start)/2;
            
            if(nums[mid] == target)
            {
            //store potential ans in first var and
            //search for next potential ans by doing making end = mid - 1
            //next potential ans will fall on left side of the mid
            first = mid;
            end  = mid - 1;
            }
            //rest same as simple B.S
            else if(nums[mid] > target)
            end = mid - 1;
            else
            start  = mid + 1;   
        }
        res[0] = first;
        
        //for last element
        while(start1 <= end1){
            int mid = start1  + (end1 - start1)/2 ;
            
            if(nums[mid] == target)
            {
            //store potential ans in last var and
            //search for next potential ans by doing making start = mid + 1 
            //next potential ans will fall on right side of the mid
            last = mid;
            start1 = mid + 1;
            }
            
            //rest same as simple B.S
            else if(nums[mid] > target)
            end1 = mid - 1;
            else
            start1 = mid + 1;   
        }
        res[1] = last;
    
    
    return res;
    }
    
}
