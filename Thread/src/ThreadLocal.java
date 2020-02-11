import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocal {
	public static void main(String[] args) {
		System.out.println("Main started :");
		final long startTime = System.currentTimeMillis();
		/*
		 * ThreadLocal tl = new ThreadLocal(); System.out.println(tl.birthDate(1000));
		 */
		new Thread(() -> {
			String userBDate = new ThreadLocal().birthDate(100);
			System.out.println(userBDate);
		}).start();
		
		Thread b = new Thread(() -> {
			String userBDate = new ThreadLocal().birthDate(120);
			System.out.println(userBDate);
			System.out.println(" ");
		});
		b.start();
		
		synchronized(b){
		 try{
             System.out.println("Waiting for b to complete...");
             b.wait();
         }catch(InterruptedException e){
             e.printStackTrace();
         }
		}
		System.out.println("Main stopped :");
	}
	
	public String birthDate(int userId) {
		System.out.println("The User id we got is :"+userId);
		Date birthDate = new Date();
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
		return df.format(birthDate);
	}
}
