import java.util.Scanner;
import java.util.StringTokenizer;

public class BubbleSortWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Using StringTokenizer
        StringTokenizer st = new StringTokenizer(str);

        // Count number of words
        int n = st.countTokens();

        // Array to store words
        String words[] = new String[n];

        int i = 0;

        // Store words into array
        while (st.hasMoreTokens()) {
            words[i] = st.nextToken();
            i++;
        }

        // Bubble Sort according to word length
        for (i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (words[j].length() > words[j + 1].length()) {

                    // Swap words
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Display sorted words
        System.out.println("Words arranged according to length:");

        for (i = 0; i < n; i++) {
            System.out.println(words[i]);
        }


    }
}