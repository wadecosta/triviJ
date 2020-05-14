import java.util.Scanner;
/**
 * Write a description of class StateTrivia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StateTrivia
{
    // instance variables - replace the example below with your own
    
    private int score;
    private int random;
    private int correct;
    private int rightAnswer;
    private int numOfStrikesLeft;
    Scanner input = new Scanner(System.in);
    /**
     * Constructor for objects of class StateTrivia
     */
    public StateTrivia()
    {
        Game sTG = new Game();
        sTG.ChooseDifficulty();

        //Create a new game of State Questions
        numOfStrikesLeft = sTG.getStrikes();   
        do
        {    
            StateQuestion play = new StateQuestion();
            
            //Get the Question and print it out for the player
            String StateQuestion = play.getStateQuestion();
            System.out.println(StateQuestion);
            
            

            //Get the Correct answer and two fake answers
            String answer = play.getStateAnswer();
            String fakeAnswer1 = play.getStateAnswerFake1();
            String fakeAnswer2 = play.getStateAnswerFake2();
                                   
            //Changes the order of the answers
            sTG.RandomNum(answer,fakeAnswer1,fakeAnswer2);
        
            //Checks if answer is correct
            sTG.AnswerCheck();
            numOfStrikesLeft = sTG.getStrikes();
            score = sTG.getScore();
            sTG.NewScreenInGame();
        } while (numOfStrikesLeft > 0);
        sTG.NewScreen();
        System.out.println("Thanks for playing! :)");
        System.out.println("Final Score: " + score);
    }
    
}
