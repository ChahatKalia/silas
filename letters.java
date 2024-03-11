import java.util.Scanner;

public class letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        char letter;
        int[] letters = new int[26];
        //for each int in letters
            //make it 0

        System.out.println("what's your word?");
        word = scanner.nextLine();

        for ( int i = 0; i<word.length(); i++) {
            letter = word.charAt(i);
            //letters[index of ^that]++;
        }

        System.out.println("Letter counts are:");
        for (int i: letters ) {
            //check if there are letters (i == 0)
            //print out the count if there are
        }
    }
}
