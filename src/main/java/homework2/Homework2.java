package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        String test = "Your name is <my name>.";
        System.out.println(test);

        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();

        String result = test.replace("<my name>", yourName);
        System.out.println(result + '\n');

        String str1 = "Enter your first phrase: ";
        System.out.println(str1);
        Scanner scan1 = new Scanner(System.in);
        String phrase1 = scanner.nextLine();

        String str2 = "Enter your second phrase: ";
        System.out.println(str2);
        Scanner scan2 = new Scanner(System.in);
        String phrase2 = scanner.nextLine();

        System.out.println(phrase1.equalsIgnoreCase(phrase2)+"\n");

        String words = "Enter your phrase here: ";
        System.out.println(words);
        Scanner scan = new Scanner(System.in);

        String wordsNum = scanner.nextLine();
        System.out.println(wordsNum);

        int countWords = wordsNum.split("\\s").length;
        System.out.println("There are " +countWords+ " words in this phrase."+'\n');

        String s1 = "Enter the beginning of your text: ";
        System.out.println(s1);
        Scanner scanner1 = new Scanner(System.in);
        String beginningText = scanner.nextLine();

        String s2 = "Enter the end of your text: ";
        System.out.println(s2);
        Scanner end = new Scanner(System.in);
        String endText = scanner.nextLine();

        String s3 = String.join(    " " , beginningText, endText);
        System.out.println(s3);

    }
}
