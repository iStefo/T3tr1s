import java.util.Timer;
import java.util.TimerTask;

public class T3FreezeDelayClock{

private Timer timer;
private T3Clock clock;
public long delay;

	public T3FreezeDelayClock(T3Clock masterClock){
		clock = masterClock;
	}

	public void freezeDelay(int delayTime){
		timer = new Timer();
		timer.schedule(new FreezeTask(), delayTime);
	}
	
	class FreezeTask extends TimerTask{
		public void run(){
			clock.freezeDelayEnd();
			timer.cancel();
		}
	}
}
