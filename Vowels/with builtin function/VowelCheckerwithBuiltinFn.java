import java.util.Scanner;

public class VowelCheckerwithBuiltinFn {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine().toLowerCase();
    
    boolean allVowelsPresent = true;
    
    if (!input.contains("a")) {
        allVowelsPresent = false;
    }
    if (!input.contains("e")) {
        allVowelsPresent = false;
    }
    if (!input.contains("i")) {
        allVowelsPresent = false;
    }
    if (!input.contains("o")) {
        allVowelsPresent = false;
    }
    if (!input.contains("u")) {
        allVowelsPresent = false;
    }
    
    if (allVowelsPresent) {
        System.out.println("All vowels are present in the input.");
    } else {
        System.out.println("Not all vowels are present in the input.");
    }
}
}
