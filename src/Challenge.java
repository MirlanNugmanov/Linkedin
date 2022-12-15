import java.util.Scanner;
import java.util.StringJoiner;

public class Challenge {
    public static void main(String[] args) {
        String question = "When did the Second World War started?";
        String choiceOne = "1935";
        String choiceTwo = "1939";
        String choiceThree = "1942";
        String correctAnswer = choiceTwo;

        boolean isOnRepeat = true;
        Scanner userAnswer = new Scanner(System.in);

        while (isOnRepeat)
        {
            System.out.println(question);
            System.out.println("The possible answers are: "+choiceOne+", " + choiceTwo +" or "+ choiceThree);
            System.out.println("Wright down you answer");
            String Answer = userAnswer.next();

            if (Answer.equals(choiceTwo))

            {
                isOnRepeat=false;
            }
            else
            {
                System.out.println("Try again :)");
            }
        }
        System.out.println("Correct Answer!!!");
        //System.out.println(Answer);
    }
}
