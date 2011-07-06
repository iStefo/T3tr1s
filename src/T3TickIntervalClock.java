
public class T3TickIntervalClock extends Thread
{
    private int tickInterval;
    private T3Clock clock;
    
    public T3TickIntervalClock()
    {
    }
    
    
    public void setClock(T3Clock newClock)
    {
        clock = newClock;
    }
    
    public void setTickInterval(int newTickInterval)
    {        
        tickInterval = newTickInterval;      
    }
    
    public int getTickInterval()
    {
        return tickInterval;
    }
    
    public void run()
    {
        while(tickInterval > 0)
        {
            long t0, t1;
            t0 =  System.currentTimeMillis();
            
            do
            {
                t1 = System.currentTimeMillis();
            }while (t1 - t0 < tickInterval);
            clock.tick();
        }
        
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
