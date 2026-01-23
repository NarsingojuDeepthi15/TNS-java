package multithread;

public class RunDemo {

	public static void main(String[] args) {
		RunThread rd=new RunThread();
		Thread t=new Thread(rd);
		t.start();
		
		

	}

}
