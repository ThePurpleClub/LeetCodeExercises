
//680. Valid Palindrome II
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0; 
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(slidingPalindrome(i+1,j, s) || slidingPalindrome(i,j-1,s))
                    return true; 
                else 
                    return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public boolean slidingPalindrome(int i, int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            i++;
            j--;
        }
        return true;
    }
}
