//1249. Minimum Remove to Make Valid Parentheses
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder semiResult = new StringBuilder();
        
        int openingBrackets = 0;
        int balance = 0;
        
        for(int i= 0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                openingBrackets++;
                balance++;
            }
            if(s.charAt(i)==')'){
                if(balance == 0) 
                    continue;
                balance--;
            }
            semiResult.append(s.charAt(i));
        }
        
        StringBuilder result = new StringBuilder();
        int brackets = openingBrackets- balance;
        
        for(int i = 0; i<semiResult.length();i++){
            if(semiResult.charAt(i)=='('){
                if(brackets==0) continue;
                    brackets--;
                
            }
            result.append(semiResult.charAt(i));
        }
       return result.toString();
    }
}
