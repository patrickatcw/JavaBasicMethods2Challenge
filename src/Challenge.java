/*Challenge
        - create a method called displayHighScorePosition
        - it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
        - you should display the players name along with a message like "managed to get into position" and the
        - position they got and a further message "on the high score table"
        -create a second method called calculateHighScorePosition
        -it should be sent one argument only, the player score
        -it should return an int
        -the return data should be;
        -1 if the score is >1000
        -2 if the score is >500 and <1000
        -3 if the score is > 100 and < 500
        -4 in all other cases
        -call both methods and display the results of the following;
        -a score of 1500, 900, 400, and 50*/
public class Challenge {

    public static void main(String[] args) {

        int positionInTheHighScoreTable = calculateHighScoreMethod(1500);
        displayHighScoreMethod("JIm", positionInTheHighScoreTable);

        positionInTheHighScoreTable = calculateHighScoreMethod(900);
        displayHighScoreMethod("Sue", positionInTheHighScoreTable);

        positionInTheHighScoreTable = calculateHighScoreMethod(400);
        displayHighScoreMethod("Kurt", positionInTheHighScoreTable);

        positionInTheHighScoreTable = calculateHighScoreMethod(50);
        displayHighScoreMethod("Rose", positionInTheHighScoreTable);

        positionInTheHighScoreTable = calculateHighScoreMethod(1300);
        displayHighScoreMethod("Jeff", positionInTheHighScoreTable);

    }

    public static void displayHighScoreMethod (String playersName, int positionInTheHighScoreTable) {

        System.out.println(playersName + " managed to get into position " + positionInTheHighScoreTable +
        " on the high score table");

    }

    public static int calculateHighScoreMethod(int playersScore) {

        if (playersScore >= 1000)
            return 1;
        else if (playersScore >= 500 && playersScore < 1000)
        return 2;
        else if ((playersScore >= 100) && playersScore < 500)
        return 3;
        else
            return 4;

    }

}



