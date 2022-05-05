
//227. Basic Calculator II
class Solution {
   
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int result = 0; //**************(1)
        int current = 0;
        int last = 0; //******************(3)
        char operation= '+'; //********(2)
        
        //for the last index, both if cases are application
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                    current = current*10 + c -'0'; //current = 3 -> 2 -> 2
            }
             
            if(!Character.isDigit(c) &&  !Character.isWhitespace(c)|| i== s.length()-1){
                if(operation =='+'){ //**********
                    result += last;  //result = 0 +3 =3
                    last = current; //last =  3 ->2
                }else if( operation=='-'){
                    result += last;
                    last = - current;
                }else if(operation =='/'){
                    last = last/current;
                }else if(operation =='*'){
                    last = last*current; // last = 2*2 = 4
                }
                
                operation = c; //**************  operation = + -> * -> 2 
                current = 0;   //current = 0
            }  
        }
            result += last; //result = 3+4 = 7
            return result;
    }
}
