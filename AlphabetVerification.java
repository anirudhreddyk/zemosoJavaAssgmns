import java.util.*;
public class AlphabetVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String input = sc.nextLine();
        HashSet<Character> stringVariable = new HashSet<>();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                stringVariable.add(input.charAt(i));
            }
        }
        if (stringVariable.size() == 26) {
            System.out.println("The string has all the alphabets");
        } else {
            System.out.println("The string doesn't have all the alphabets");
        }
    }
}
