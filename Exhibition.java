/**
 * class Exhibition used in Cwk 2 - Specimen Nov 2012
 * @author (your name) 
 * @version (your group and the date)
 */
public class Exhibition
{
    private String title;           // the title of the exhibition
    private int fee;                // the fee visitors will pay 
    private int numberOfVisitors;   // the number of visitors present at the exhibition
    private String organiser;       // organiser of the exhibition
    private int maxVisitors;         // maximum number of visitors allowed
    private int totalFees;          //total money taken in the exhibition

    /** tt - title of the exhibition, f - the fee, max - max visitors allowed 
     */
    public Exhibition (String tt, int f, int max)
    {
        title = tt;
        fee = f;
        numberOfVisitors = 0;
        organiser = "xxx";
        maxVisitors = max;
        totalFees = 0;
    }
    
    /** Updates the state of the exhibition to show that three visitor 
     * been allowed into the exhibition
     */
    public void enter()
    {
        numberOfVisitors = numberOfVisitors +10;
        if (numberOfVisitors > maxVisitors)
        {
           numberOfVisitors =10; 
           System.out.println("Sorry, the Exhibition is at its maximum capacity");
        }
       
        totalFees = fee * numberOfVisitors;
    }
    
    /**Updates the state of the exhibition to show that one visitor 
     * has left the exhibition
     */
    public void leave(int numberOfPeople, int numberOfVisitors)
    {
         if ( numberOfPeople <= numberOfVisitors)
        {
          numberOfVisitors = numberOfVisitors - numberOfPeople;
        }
         else
        {
         System.out.println("There weren't this amount of visitors at the exhibition");
        }

    }
 
    /** returns the fee for one visitor to the exhibition 
     */
    public int getFee()
    {
        return fee;
    }
    
    /**
     * returns the number of visitors to the exhibiton
     */
    public int getnumberOfVisitors()
    {
        return numberOfVisitors;
    }
    
    /** returns true if the exhibition is full, else false if it isn't full
     * 
     */
    public boolean isFull()
    {
       if(numberOfVisitors == 10)
       {
           return true; 
       }
       else
       {
           return false; 
       }
  
        
    }
    
    /** returns the name of the organiser
     */
    public String getOrganiser()
    {
        return organiser;
    }
    
    /** returns the title of the exhibition
     * 
     */
    public String gettitle()
    {
        return title;
    }

    /** outputs to the Terminal window the state of the exhibition
     */ 
    public void printState ()
    {
        System.out.println("Exhibition: " + title);
        System.out.println("Organiser: " + organiser);
        System.out.println("Visitors Present: " + numberOfVisitors);
        System.out.println("Fee: " + totalFees);
        System.out.println("**********************");
    }   
    

}



