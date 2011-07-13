
public class T3Clock{

private T3ControllerGame referenceController;
private T3FreezeDelayClock freezeClock;
private T3TickIntervalClock tickClock;

	public T3Clock(T3ControllerGame Controller){
		referenceController = Controller;
		tickClock = new T3TickIntervalClock(this);
		freezeClock = new T3FreezeDelayClock(this);
	}
	
	//tickMethods
	
	public void newGame(int tickInterval){
		tickClock.startTick(tickInterval);
	}
	
	public void endGame(){
		tickClock.stopTick();
	}
	
	public void setTickInterval(int newTickInterval){
		tickClock.stopTick();
		tickClock.startTick(newTickInterval);
	}
	
	public void tick(){
		referenceController.tick();
	}
	
	//freezeMethods
	public void startFreezeDelay(int delayTime){
		freezeClock.freezeDelay(delayTime);
	}
	
	public void freezeDelayEnd(){
		referenceController.freezeDelayEnd();
	}
}