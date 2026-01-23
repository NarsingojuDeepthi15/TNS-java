package com.tnsif.java.exception;
import java.io.FileReader;
class Sample{
	public void show() throws Exception{
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		}finally {
			System.out.println("This is finally block");
		}
	}
}

public class ThrowsException {

	public static void main(String[] args) throws Exception {
//		FileReader fr=new FileReader("sam");//checked Exception
		Sample s=new Sample();
		s.show();

	}
}
