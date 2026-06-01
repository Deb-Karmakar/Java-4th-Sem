import java.util.*;

@FunctionalInterface
interface TextModifier {
    String modify(String str);
}

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        // Lambda 1: Removes all spaces
        TextModifier removeSpaces = (a) -> a.replace(" ", "");

        // Lambda 2: Replaces all vowels with '*' using Regex
        // [aeiouAEIOU] means "match any character inside these brackets"
        TextModifier replaceVowels = (a) -> a.replaceAll("[aeiouAEIOU]", "*");

        // 💡 Chaining the lambdas together
        String noSpaces = removeSpaces.modify(s);
        String finalResult = replaceVowels.modify(noSpaces);

        System.out.println("Final string: " + finalResult);
        
        sc.close();
    }
}