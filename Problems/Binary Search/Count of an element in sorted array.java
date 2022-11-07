//https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/

class Solution {
    
    int BS(int[] nums, int target, boolean firstLast){
        
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        
        //for first element
        while(start <= end){
            int mid = start  + (end - start)/2;
            
            if(nums[mid] == target)
            {
            
            res = mid;
            if(firstLast == true)
            end  = mid - 1;
            else
            start = mid + 1;
            }
            //rest same as simple B.S
            else if(nums[mid] > target)
            end = mid - 1;
            else
            start  = mid + 1;   
        }
        
        return res;
    
    }
    int count(int[] nums, int n, int target) {
        // code here
    int first = BS(nums, target, true);
    int last = BS(nums, target, false);
    
    if(last == -1 && first == -1)
    return 0;
    
    return last-first + 1;
    }
}
