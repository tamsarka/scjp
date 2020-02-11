import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor {
	public static void main(String[] args) {
		ScheduledExecutorService execService = Executors.newScheduledThreadPool(7);
//		execService.schedule(new Task(), 10, TimeUnit.SECONDS);
		System.out.println(new Date().toString());
		execService.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
	}

}

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("From Task :"+new Date().toString());

	}
}
