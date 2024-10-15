public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        statement = statement.trim();

        if(findKeyword(statement, "I want ", 0)!=-1){
            System.out.println("reached");
            response = transformIWantStatement(statement);
        }
        else if(findKeyword(statement, "I", 0)< findKeyword(statement, "you", 0)){
            response = transformIMeStatement(statement);

        }
        else if(findKeyword(statement, "I want to", 0)!=-1){
            response = transformIWantToStatement(statement);
        }
        else if(findKeyword(statement, "I ", 0)!=-1 && findKeyword(statement, "you", 0)!=-1){
            response = transformIMeStatement(statement);
        }
        else
        if(statement.length()==0){
            response = "Say something, please.";
        }
        else if(findKeyword(statement, "you", 0)<findKeyword(statement, "me", 0)){
            response = transformYouMeStatement(statement);
        }
        else if(findKeyword(statement, "I want to", 0)!=-1){
            response = transformIWantToStatement(statement);
        }

        else if (findKeyword(statement, "no", 0) !=-1) {
            response = "Why so negative?";
        } else if (findKeyword(statement, "mother", 0) !=-1
        || findKeyword(statement, "father", 0)!=-1
        || findKeyword(statement, "sister", 0)!=-1
        || findKeyword(statement, "brother", 0)!=-1) {
            response = "Tell me more about your family.";
        }
        else if(findKeyword(statement, "dog", 0)!=-1 || findKeyword(statement, "cat", 0)!=-1){
            response = "Tell me more about your pets.";
        }
        else if(findKeyword(statement, "Thomas", 0)!=-1){
            response = "He sounds like a good student.";
        }
        else if(findKeyword(statement, "trumpet", 0)!=-1){
            response = "That's cool. Who do you think the best trumpet player at Lord Byng is?";
        }
        else if(findKeyword(statement, "instrument", 0)!=-1){
            response = "The trumpet is not a good instrument. It is too loud and annoying.";
        }
        else if(findKeyword(statement, "basketball", 0)!=-1){
            response = "Basketball is a great sport.";
        }
        else {
            response = getRandomResponse();
        }




        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        }
        else if(whichResponse ==5){
            response = "What do you think?";
        }
        else if(whichResponse ==6){
            response = "How is it going?";
        }
        else if(whichResponse ==7){
            response = "Why do you say that?";
        }


        return response;
    }


    public int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in the line below
        int goalPos = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a word
        while (goalPos >= 0) {
            // Find the string of length 1 before and after the word
            String before = " ", after = " ";

            if (goalPos > 0) {
                before = phrase.substring(goalPos - 1, goalPos);
            }

            if (goalPos + goal.length() < phrase.length()) {
                after = phrase.substring(goalPos + goal.length(),
                        goalPos + goal.length() + 1);
            }

            /* determine the values of goalPos, before, and after at this point */

            // If before and after aren't letters, we've found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&
                    ((after.compareTo("a")  < 0) || (after.compareTo("z")  > 0))) {
                return goalPos;
            }

            // The last position didn't work, so let's find the next, if there is one.
            goalPos = phrase.indexOf(goal,goalPos + 1);
        }
        return -1;
    }




    public String transformYouMeStatement(String statement) {
        //Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }

        int posOfYou = findKeyword(statement, "you", 0);
        int posOfMe  = findKeyword(statement, "me",  posOfYou + 3);

        String restOfStatement = statement.substring(posOfYou + 3, posOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }


    public String transformIWantToStatement(String statement) {
        //Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int pos = findKeyword(statement, "I want to", 0);
        String restOfStatement = statement.substring(pos + 9).trim();
        return "What would it mean to " + restOfStatement + "?";
    }
    public String transformIWantStatement(String statement){
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }

        int pos = findKeyword(statement, "I want ", 0);
        String restOfStatement = statement.substring(pos + 7).trim();


        return "Would you really be happy if you had " + restOfStatement + "?";
    }
    /**
     * Take a statement with "I <something> you" and transform it into
     * "Why do you <something> me?"
     *
     * @param statement the user statement, assumed to contain "I" followed by
     * 	something "you"
     * @return the transformed statement
     */
    public String transformIMeStatement(String statement) {
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int pos = findKeyword(statement, "I ", 0);
        int pos2 = findKeyword(statement, "you ", 0);
        String restOfStatement = statement.substring(pos+2, statement.length()-4).trim();
        return "Why do you " + restOfStatement + " me?";
    }




}

