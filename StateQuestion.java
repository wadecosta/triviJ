import java.util.Arrays;
/**
 * Write a description of class Question here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StateQuestion
{
    // instance variables - replace the example below with your own
    private String[] questionArray;
    private String[] answerArray;
    private String prefix;
    private int rand,rand1,rand2;
    private String stateQuestion;
    private String stateAnswer,stateAnswerFake1, stateAnswerFake2;
    
    /**
     * Constructor for objects of class Question
     */
    public StateQuestion()
    {
        prefix = "What's the Capital of";
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
        questionArray = new String []{"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware",
            "Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas", "Kentucky","Louisiana","Maine","Maryland",
            "Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire",
            "New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania",
            "Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington",
            "West Virginia","Wisconsin","Wyoming"};
        
        
        
        
        
        answerArray = new String []{"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover",
            "Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge",
            "Augusta","Annapolis","Boston","Lansing","Saint Paul","Jackson",
            "Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus",
            "Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City",
            "Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
        
        stateQuestion = questionArray[rand];
        
        //Correct Answer
        stateAnswer = answerArray[rand];
        
        //Fake Answer
        stateAnswerFake1 = answerArray[rand1];
        stateAnswerFake2 = answerArray[rand2];
        
    
        
    
        
        
        
        
        
    }
    
    public String getStateQuestion()
    {
        return prefix + " " + this.stateQuestion + "?";
    }
    
    public String getStateAnswer()
    {
        return this.stateAnswer;
    }
    public String getStateAnswerFake1()
    {
        return this.stateAnswerFake1;
    }
    public String getStateAnswerFake2()
    {
        return this.stateAnswerFake2;
    }
    public int rand(int random)
    {
        return random;
    }
    public int Random ()
    {
        int r = 0 + (int)(Math.random() * ((44 - 0) + 1));
        return r;
    }
}
