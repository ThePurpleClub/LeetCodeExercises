//71	Simplify Path

class Solution {
    public String simplifyPath(String path) {
        String[] brokenPath = path.split("/");
        Stack<String> stack = new Stack();
        for(int i = 0; i<brokenPath.length; i++){
            
            if(brokenPath[i].equals(".") || brokenPath[i].isEmpty())
                continue;
            else if(brokenPath[i].equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                
            }
            else{
                stack.push(brokenPath[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : stack){
            sb.append("/");
            sb.append(s);
        }
        
        if(sb.length()<1) return "/";
        else
            return sb.toString();
    }
}
