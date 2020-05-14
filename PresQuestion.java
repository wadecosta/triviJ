import java.util.Arrays;
/**
 * Write a description of class Question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PresQuestion
{
    // instance variables - replace the example below with your own
    private String[] questionArray;
    private String[] answerArray;
    private String prefix;
    private int rand,rand1,rand2;
    private String presQuestion;
    private String presAnswer,presAnswerFake1, presAnswerFake2;
    private int presNum;
    
    /**
     * Constructor for objects of class Question
     */
    public PresQuestion()
    {
        prefix = "Who is President Number: ";
        
            
        rand = Random();
        rand1 = Random();
        rand2 = Random();
        if (rand == rand1)
        {
            rand = Random();  
        }
        else if (rand == rand2)
        {
            rand = Random();
        }
        else if (rand1 == rand2)
        {
            rand1 = Random();
        }
        
        
        questionArray = new String []{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
            "20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42",
            "43","44","45"};
        
        
        
        
        
        answerArray = new String []{"George Washington","John Adams","Thomas Jefferson","James Madison","James Monroe",
            "John Quincy Adams","Andrew Jackson","Martin Van Buren","William Henry Harrison","John Tyler","James K. Polk",
            "Zachary Taylor","Millard Fillmore","Franklin Pierce","James Buchanan","Abraham Lincoln","Andrew Johnson",
            "Ulysses S. Grant","Rutherford B. Hayes","James A. Garfield","Chester A. Arthur","Grover Cleveland",
            "Benjamin Harrison","Grover Cleveland","William McKinley","Theodore Roosevelt","William Howard Taft",
            "Woodrow Wilson","Warren G. Harding","Calvin Coolidge","Herbert Hoover","Franklin D. Roosevelt","Harry S. Truman",
            "Dwight D. Eisenhower","John F. Kennedy","Lyndon B. Johnson","Richard Nixon","Gerald Ford","Jimmy Carter",
            "Ronald Reagan","George H. W. Bush","Bill Clinton","George W. Bush","Barack Obama","Donald J. Trump"};
        
        presQuestion = questionArray[rand];
        
        //Correct Answer
        presAnswer = answerArray[rand];
        
        //Fake Answer
        presAnswerFake1 = answerArray[rand1];
        presAnswerFake2 = answerArray[rand2];
        
        
        //Correct Number of the President
        presNum = rand + 1;
        
        
        
    }
    
    public String getPresQuestion()
    {
        return prefix + presNum;
    }
    
    public String getPresAnswer()
    {
        return this.presAnswer;
    }
    public String getPresAnswerFake1()
    {
        return this.presAnswerFake1;
    }
    public String getPresAnswerFake2()
    {
        return this.presAnswerFake2;
    }
    public int Random ()
    {
        int r = 0 + (int)(Math.random() * ((44 - 0) + 1));
        return r;
    }
}
