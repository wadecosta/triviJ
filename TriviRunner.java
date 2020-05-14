import java.util.Scanner;
/**
 * Write a description of class TriviRunner here.
 *
 * @Wade Costa
 * @vFinal_Build
 */
public class TriviRunner
{
    public static void main (String [] args)
    {
        Game g = new Game();
        String output;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Welcome to TriviJ");
            System.out.println("By: Wade Costa");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("------------------");
            System.out.println("Press a number key to begin!");
            System.out.println("Press (1) to play State Trivia");
            System.out.println("Press (2) to play President Trivia");
        
            output = input.next();
            g.NewScreen();
        } while ((!output.equals("1")) && (!output.equals("2")));
        
        if (output.equals("1"))
        {
            StateTrivia sT = new StateTrivia();
        }
        else if (output.equals("2"))
        {
            PresTrivia pT = new PresTrivia();
        }
    }
}
