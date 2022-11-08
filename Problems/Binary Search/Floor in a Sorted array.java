//https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        
        int start = 0;
        int end = n-1;
        int potential = -1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2 ;
            
            if(arr[mid] == x)
            return mid;
            else if(arr[mid] < x)
            {
                if(potential < arr[mid])
                potential = mid;
                
                start = mid + 1;
            }
            else if(arr[mid] > x)
            {
                end = mid - 1;
            }
        }
        
        return potential;
    }
    
}
