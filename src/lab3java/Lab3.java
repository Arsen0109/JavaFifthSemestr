package lab3java;

import java.util.Arrays;
import java.util.Scanner;

/*
 * C3 = 2
 * 2	- type String
 * C17 = 8
 * 8 - Відсортувати слова заданого тексту за зростанням кількості в них заданої літери.*/
public class Lab3 {
    public static int countCharsInWord(char symbol, String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt";
        System.out.print("Enter a symbol: ");
        Scanner scanner = new Scanner(System.in);
        char inpChar = scanner.next().toLowerCase().charAt(0);
        String[] arrOfWords = str.split(" ");
        Arrays.sort(arrOfWords, (a, b) -> countCharsInWord(inpChar, b) - countCharsInWord(inpChar, a));
        System.out.println(str);
        String result = String.join(" ", arrOfWords);
        System.out.println(result);
    }
}
