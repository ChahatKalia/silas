import java.util.Scanner;

public class letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        char letter;
        int[] numLetters = new int[26];
        //for each int in letters
            //make it 0

        System.out.println("what's your word?");
        word = scanner.nextLine().toLowerCase();

        for ( int i = 0; i<word.length(); i++) {
            letter = word.charAt(i);
            numLetters[letter - 'a']++;
        }

        System.out.println("Letter counts are:");
        for (int element: numLetters) {
            System.out.println(element);
        }
    }
}
