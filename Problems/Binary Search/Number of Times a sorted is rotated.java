//https://practice.geeksforgeeks.org/problems/rotation4723/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            if(arr[start] <= arr[end]){
              return start;
	       }
            int mid = start + (end - start)/2 ;
            
            int next = (mid + 1)%n;
            int prev = (mid +n - 1)%n;
            
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
            return mid;
            
            //move through the unsorted array
            else if(arr[mid] >= arr[start])
            start = mid + 1;
            
            else if(arr[mid] <= arr[end])
            end = mid - 1;
        }
        
        return 0;
    }
}
