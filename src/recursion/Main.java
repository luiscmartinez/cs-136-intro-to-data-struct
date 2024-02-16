package recursion;

// Luis Martinez
import java.util.Scanner;

class Main {
    public static int replacements = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: \n");
        String userString = scanner.nextLine();
        System.out.print(userString + " would be ");
        System.out.println(stringReplacer(userString));
        System.out.println("Number of characters replaced " + replacements);
        scanner.close();
    }

    public static String stringReplacer(String str) {
        int length = str.length();

        char replaceChar = str.charAt(0);

        if (replaceChar == 'a') {
            replaceChar = 'e';
        } else if (replaceChar == 'e') {
            replaceChar = 'i';
        } else if (replaceChar == 'i') {
            replaceChar = 'o';
        } else if (replaceChar == 'o') {
            replaceChar = 'u';
        } else if (replaceChar == 'u') {
            replaceChar = 'a';
        }
        if (replaceChar != str.charAt(0)) {
            replacements++;
        }
        if (length == 1) {
            return Character.toString(replaceChar);
        }

        return replaceChar + stringReplacer(str.substring(1));
    }
}