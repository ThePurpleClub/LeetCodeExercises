
//937. Reorder Data in Log Files
class Solution {
    public String[] reorderLogFiles(String[] logs){
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            
            public int compare(String s1, String s2){
                String[] str1 = s1.split(" ");
                String[] str2 = s2.split(" ");
                
                char c1 = str1[1].charAt(0);
                char c2 = str2[1].charAt(0);
                
                if(Character.isDigit(c1) && Character.isLetter(c2)) return 1;
                if(Character.isLetter(c1) && Character.isDigit(c2)) return -1;
                if(Character.isDigit(c1) && Character.isDigit(c2)) return 0;
                //if(Character.isLetter(c1) && Character.isLetter(c2)) return 0;
                
                if(s1.equals(s2))
                    return str1[0].compareTo(str2[0]);
                
                String log1 = s1.substring(s1.indexOf(" ")+1);
                String log2 = s2.substring(s2.indexOf(" ")+1);
                
                if(log1.equals(log2))
                    return str1[0].compareTo(str2[0]);
                
                return log1.compareTo(log2);
            }
        });
        return logs;
        
    }
}
