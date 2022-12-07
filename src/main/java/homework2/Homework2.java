package homework2;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println();

        String article = "Ask for room cleaning";
        System.out.println("Original string: " + article);

        String result = article.replace("Ask for", "Request a");
        System.out.println("New string: " + result);

        System.out.println();

        String str1 = "This is exercise 1";
        String str2 = "This Is Exercise 1";

        System.out.println("String 1: " +str1);
        System.out.println("String 2: " +str2);

        int result2 = str1.compareToIgnoreCase(str2);

        if (result2 < 0){
            System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
        }
        else if (result2 == 0){
            System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        }
        else {
            System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");
        }

        System.out.println();

        String words = "This is a test string.";
        System.out.println(words);
        int countWords = words.split("\\s").length;
        System.out.println("There are " +countWords+ " words in the phrase.");

        System.out.println();

        String s1="You are ";
        String s2="smart!";
        String s3=s1.concat(s2);
        System.out.println(s3);





    }
}
