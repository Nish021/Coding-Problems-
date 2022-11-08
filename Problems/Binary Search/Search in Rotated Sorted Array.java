//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution {
    
    public int BinarySearch(int[] nums, int start, int end, int target){
        
        while(start <= end) {
            
            int mid = start + (end - start)/2 ;
                
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            
        }
        
        return -1;
    }
    
    public int FindMinIndex(int[] nums,int start, int end, int target){
        
        while(start <=  end) {
            
            if(nums[start] <= nums[end])
                return start;
            
            int mid = start + (end - start)/2 ;
            
            int next = (mid + 1 ) % nums.length ;
            int prev = (mid + nums.length - 1 ) % nums.length ;
            
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev])
            return mid;
            //move through unsorted array
            else if(nums[start] <= nums[mid])
            start = mid + 1;
            else if(nums[end] >= nums[mid])
            end = mid - 1;
        }
        
        return 0;
        
        
    }

    public int search(int[] nums, int target) {
        
        //1. find the index with minimum element
        
        int index = FindMinIndex(nums,0,nums.length-1 ,target);
        if(nums[index] == target)
            return index;
        
        int firstSortedArray = BinarySearch(nums, 0, index-1, target);
        int lastSortedArray = BinarySearch(nums, index+1, nums.length-1 , target);
        
        System.out.println(index + " " + firstSortedArray + " " + lastSortedArray );
        
        if(firstSortedArray != -1)
            return firstSortedArray;
        else if(lastSortedArray != -1)
            return lastSortedArray;
        else return -1;
         
        
    }
}
