public class T3Clock
{
    private int freezeDelay;
    private T3ControllerGame controller;    
    private boolean tickPause;
    private T3TickIntervalClock tickIntervalClock;
    private T3FreezeDelayClock freezeDelayClock;
    
    public T3Clock(T3ControllerGame newController)
    {
        controller = newController;
    }
    
    public void newGame(int newTickInterval)
    {           
        tickIntervalClock = new T3TickIntervalClock();
        tickIntervalClock.setClock(this);
        tickIntervalClock.setTickInterval(newTickInterval);
        tickIntervalClock.start();
        tickPause = false;             
    }
    
    public void setTickInterval(int newTickInterval)
    {
               
        if (newTickInterval == 0)
        {
            tickPause = true;
        }
        else
        {
            tickPause = false;
            tickIntervalClock.setTickInterval(newTickInterval);
        }        
    }
    
    public void tick()
    {
        if (tickPause == false)
        {
            controller.tick();
        }
    }
    
    public void endTick()
    {
        tickIntervalClock.setTickInterval(0);
        tickIntervalClock = null;
        freezeDelayClock = null;
    }
    
    public void startFreezeDelay(int newFreezeDelay)
    {
        freezeDelayClock = new T3FreezeDelayClock();
        freezeDelayClock.setClock(this);
        freezeDelayClock.setFreezeDelay(newFreezeDelay);
        freezeDelayClock.start();
    }
    
    public void freezeDelayEnd()
    {
        controller.freezeDelayEnd();
    }
    
}