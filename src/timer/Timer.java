package timer;

/**
 *
 * @author Aveyer
 */
public final class Timer implements Runnable
{
    //fields
    private int seconds;
    
    /**
     * Constructor
     * @param seconds Timer time, in seconds
     */
    public Timer(int seconds)
    {
        System.out.println("---------------------------");
        System.out.println("| Timer set for " + seconds + " seconds |");
        System.out.println("---------------------------");
        this.seconds = seconds;
        run();
    }
    
    /**
     * Overridable Runnable interface
     */
    @Override
    public void run()
    {
        Thread thread1 = new Thread();
        thread1.start();
        try
        {
            while(seconds > 0)
            {
                System.out.println(seconds + "s");
                thread1.sleep(1000);
                seconds--;
            }
            System.out.println("Times up!");
        }
        
        catch(InterruptedException e)
        {
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Timer timer1 = new Timer(5);
        //timer1.run();
        //timer1.getTimerTime();
    }
}