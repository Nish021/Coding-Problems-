//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        //same as ceil of an element in sorted array
        int start = 0;
        int end = letters.length - 1;
        char potential = '0' ;
        
        while(start <= end){
            
            int mid = start + (end - start)/2 ;
            
            // target smaller than mid then move towards left side
            if(letters[mid] > target) {
                potential = letters[mid];
                end = mid - 1;
            }
            else start = mid + 1;
            
        }
        
        if(potential == '0')
            return letters[0];
        
        return potential ;
    }
}
