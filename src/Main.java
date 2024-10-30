import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter a word to get its sentiment value:");
        String word = scanner.nextLine();

        double sentiment = Sentival.sentimentVal(word);
        System.out.println("Sentiment value of \"" + word + "\": " + sentiment);

        System.out.println("\nRandom positive adjective: " + Sentival.randomPositiveAdj());
        System.out.println("Random negative adjective: " + Sentival.randomNegativeAdj());
        System.out.println("Random adjective: " + Sentival.randomAdjective());

        scanner.close();

        */
        String tmp1 = Sentival.textToString("/Users/thomas/IdeaProjects/project3/src/SimpleReview.txt");
        System.out.println(Sentival.fakereview("/Users/thomas/IdeaProjects/project3/src/SimpleReview.txt", "good"));
    }
}
