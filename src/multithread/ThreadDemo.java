package multithread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++) {
			Multithread mt=new Multithread();
			mt.start();
			Thread.sleep(5000);
		}
	}
}
