import java.util.Scanner;
/**
 * Write a description of class PresTrivia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PresTrivia
{
    // instance variables - replace the example below with your own
    
    private int score;
    private int random;
    private int correct;
    private int rightAnswer;
    private int numOfStrikesLeft;
    Scanner input = new Scanner(System.in);
    /**
     * Constructor for objects of class PresTrivia
     */
    public PresTrivia()
    {
        Game pTG = new Game();
        pTG.ChooseDifficulty();

        //Create a new game of Pres Questions
        numOfStrikesLeft = pTG.getStrikes(); 
        score = pTG.getScore();
        do
        {    
            PresQuestion play = new PresQuestion();
            
            //Get the Question and print it out for the player
            String PresQuestion = play.getPresQuestion();
            System.out.println(PresQuestion);
            
            

            //Get the Correct answer and two fake answers
            String answer = play.getPresAnswer();
            String fakeAnswer1 = play.getPresAnswerFake1();
            String fakeAnswer2 = play.getPresAnswerFake2();
            
            
            
            //Changes the order of the answers
            pTG.RandomNum(answer,fakeAnswer1,fakeAnswer2);
        
            //Checks if answer is correct
            pTG.AnswerCheck();
            numOfStrikesLeft = pTG.getStrikes();
            score = pTG.getScore();
            pTG.NewScreenInGame();
        } while (numOfStrikesLeft > 0);
        System.out.println("Thanks for playing! :)");
        System.out.println("Final Score: " + score);
    }
    
}
