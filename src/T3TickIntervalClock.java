import java.util.Timer;
import java.util.TimerTask;


public class T3TickIntervalClock{

private Timer timer;
private T3Clock clock;

	public T3TickIntervalClock(T3Clock masterClock){
		clock = masterClock;
		}
	
	public void startTick(int tickIntervall){
		timer = new Timer();
		timer.scheduleAtFixedRate(new TickTask(), 0, tickIntervall);
	}
	
	public void stopTick(){
		timer.cancel();
	}
	
	class TickTask extends TimerTask{
		public void run(){
			clock.tick();
		}
	}

}
