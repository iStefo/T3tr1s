

public class T3FreezeDelayClock extends Thread
{
    private int freezeDelay;
    private T3Clock clock;
    
    
    
    public void setClock(T3Clock newClock)
    {
        this.clock = newClock;
    }
    
    public void setFreezeDelay(int newFreezeDelay)
    {
        freezeDelay = newFreezeDelay;
    }
    
    public void run()
    {
        
        long t0, t1;
        t0 =  System.currentTimeMillis();
            
        do
        {
            t1 = System.currentTimeMillis();
        }while (t1 - t0 < freezeDelay);
        clock.freezeDelayEnd();
        
        
        try
        {
            sleep(50);
        }
        catch(InterruptedException ie)
        {
            // ...
        }

    }
    
}
