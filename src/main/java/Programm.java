// CONVERTING STRING TO CAMEL CASE
// CONEVERT -, _ to camelCase 

public class Programm {
    public static void main(String[] args) {
        String input1 = "the-stealth-warrior";
        String input2 = "the_stealth_warrior";
        
        System.out.println(Solution.toCamelCase(input1));
        System.out.println(Solution.toCamelCase(input2));
    }
}
