https://leetcode.com/problems/binary-search/
time : o(log n)
space: o(1)
    
class Solution {
    public int search(int[] nums, int target) {
        //start point
        int start = 0;
        
        //end point
        int end = nums.length - 1;
        
        while(start <= end){
            
             //if value is large then yeh help krega int ko overflow hone se 
            int mid = start + (end - start)/2 ;  
            
            //agar target small hai toh end mid -1 hoga
            if(nums[mid] > target){
                end = mid - 1;
            }
            //agar target large hai toh start mid + 1 hoga 
            else if(nums[mid] < target){
                start = mid + 1;
            }
            //agar target equals hai toh mid return kr denge
            else if(nums[mid] == target){
                return mid;
            }
        }
        
        //if element not found
        return -1;
    }
}
