import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;

public class Sentival {

    private static HashMap<String, Double> sentiment = new HashMap<>();
    private static ArrayList<String> posAdjectives = new ArrayList<>();
    private static ArrayList<String> negAdjectives = new ArrayList<>();

    static {
        // Read sentiment values from file
        try {
            Scanner input = new Scanner(new File("/Users/thomas/IdeaProjects/project3/src/cleanSentiment.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0], Double.parseDouble(temp[1]));
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }

        // Read positive adjectives
        try {
            Scanner input = new Scanner(new File("/Users/thomas/IdeaProjects/project3/src/positiveAdjectives.txt"));
            while (input.hasNextLine()) {
                posAdjectives.add(input.nextLine().trim());
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing positiveAdjectives.txt");
        }

        // Read negative adjectives
        try {
            Scanner input = new Scanner(new File("/Users/thomas/IdeaProjects/project3/src/negativeAdjectives.txt"));
            while (input.hasNextLine()) {
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }
    }

    public static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));
            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }
        return temp.trim();
    }

    public static double sentimentVal(String word) {
        try {
            return sentiment.getOrDefault(word.toLowerCase(), 0.0);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String getPunctuation(String word) {
        String punc = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    public static String removePunctuation(String word) {
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
            word = word.substring(1);
        }
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
            word = word.substring(0, word.length() - 1);
        }
        return word;
    }

    public static String randomPositiveAdj() {
        int index = (int) (Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    public static String randomNegativeAdj() {
        int index = (int) (Math.random() * negAdjectives.size());
        return negAdjectives.get(index);
    }

    public static String randomAdjective() {
        boolean positive = Math.random() < 0.5;
        return positive ? randomPositiveAdj() : randomNegativeAdj();
    }

    public static String totalSentiment(String text) {
        String[] words = text.split(" ");
        double total = 0;
        for (String word : words) {
            word = removePunctuation(word);
            total += sentimentVal(word);
        }
        return total + "";
    }
    public static int starTating(int tmp) {
        if(tmp>=4){
            return 5;
        }
        else if(tmp>=3){
            return 4;
        }
        else if(tmp>=2){
            return 3;
        }
        else if(tmp>=1){
            return 2;
        }
        else if(tmp>=0){
            return 1;
        }
        else{
            return 0;
        }

    }
    public static String fakereview(String filename, String goodbad){
        String text = textToString(filename);


        for(int i=0;i<text.length();i++){
            int times = (int)(Math.random()*4)+1;
            String good = "";
            String bad = "";
            for(int k=0;i<times;i++){
                good+=randomPositiveAdj()+" ";
                bad+=randomNegativeAdj()+" ";
            }
            if( text.indexOf("*", i)!=-1){
                int pos = text.indexOf("*", i);
                if(goodbad.equals("good")){
                    if(text.indexOf(" ", pos+1)!=-1){
                        int space = text.indexOf(" ", pos+1);
                        text = text.substring(0, pos) + good + text.substring(space);
                    }
                    else{
                        text = text.substring(0, pos) + randomAdjective()+"!";
                    }
                }
                else{
                    if(text.indexOf(" ", pos+1)!=-1){
                        int space = text.indexOf(" ", pos+1);
                        text = text.substring(0, pos) + bad + text.substring(space);
                    }
                    else{
                        text = text.substring(0, pos) + randomAdjective()+"!";
                    }
                }

            }
            else {
                break;
            }
        }
        return text;
    }

}
