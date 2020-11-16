
public class Solution {
    static String toCamelCase(String string) {

        String[] split = string.split("");
        String output = "";
        boolean nextCharToUpper = false;
        
        for (String s : split) {
            if (s.equals("-") || s.equals("_")) {
                nextCharToUpper = true;
                continue;
            } else {
                if (nextCharToUpper) {
                    output = output + s.toUpperCase();
                    nextCharToUpper = false;
                } else {
                    output = output + s;
                }
            }
        }
     
        return output;
    }
    
}
