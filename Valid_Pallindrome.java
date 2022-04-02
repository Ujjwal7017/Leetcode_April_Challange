class Solution {
    public boolean validPalindrome(String s) {
        
        //Declare two pointers
        int left = 0;
        int right = s.length()-1;
        
       /*
        Run a loop while left pointer is less than or equal to right pointer.
       */
        while(left <= right) {
            
            if(s.charAt(left) != s.charAt(right)) {
                
                return isPalindrome(s, left+1, right)
                       ||isPalindrome(s,left,right-1);
                  
            
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    //Logic to check palindrome
    private boolean isPalindrome(String s, int start, int end) {
        
        while(start <= end) {
            
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
}
