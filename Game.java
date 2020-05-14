import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private int score;
    private int random;
    private int rightAnswer;
    private int numOfStrikesLeft;
    Scanner input = new Scanner(System.in);
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        
        
        
    }
    public int getScore()
    {
        return this.score;
    }
    public int getStrikes()
    {
        return this.numOfStrikesLeft;
    }
    public void RightAnswer()
    {
        score++;
        
        System.out.println("Correct! 1 pt");
        
    }
    public void WrongAnswer()
    {
        numOfStrikesLeft--;
        System.out.println("Wrong! You have " + numOfStrikesLeft + " Strikes left");
    }
    public void AnswerCheck()
    {
        int next = input.nextInt();
        if (next == rightAnswer)
        {
                RightAnswer();
        }
        else
        {
                WrongAnswer();
        }
        
    }
    public void ChooseDifficulty()
    {
        System.out.println("(1) Easy");
        System.out.println("(2) Medium");
        System.out.println("(3) Hard");
        String output = input.next(); 
        if(output.equalsIgnoreCase("1"))
        {
                numOfStrikesLeft = 20;
        }
        else if (output.equalsIgnoreCase("2"))
        {
                numOfStrikesLeft = 10;
        }
        else
        {
                numOfStrikesLeft = 3;
        }
        NewScreen();
    }
    public int RandomNum(String StateAnswer,String StateFakeAnswer1,String StateFakeAnswer2)
    {
        int random = 0 + (int)(Math.random() * ((2 - 0) + 1));
        if (random == 0)
        {
                System.out.println("1.)" + StateAnswer);
                System.out.println("2.)" + StateFakeAnswer1);
                System.out.println("3.)" + StateFakeAnswer2);
                rightAnswer = 1;
                return rightAnswer;
        }
        else if (random == 1)
        {
                System.out.println("1.)" + StateFakeAnswer1);
                System.out.println("2.)" + StateAnswer);
                System.out.println("3.)" + StateFakeAnswer2);
                rightAnswer = 2;
                return rightAnswer; 
        }
        else 
        {
                System.out.println("1.)" + StateFakeAnswer2);
                System.out.println("2.)" + StateFakeAnswer1);
                System.out.println("3.)" + StateAnswer);
                rightAnswer = 3;
                return rightAnswer;
        }
        
    }
    public void NewScreen()
    {  
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }
    public void NewScreenInGame()
    {  
        System.out.println(new String(new char[25]).replace("\0", "\r\n"));
        System.out.println("Score: " + score);
        System.out.println("Strikes Left: " + getStrikes());
        System.out.println(new String(new char[25]).replace("\0", "\r\n"));
    }
}
