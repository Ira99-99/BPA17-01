package lab5_1;
import java.util.Scanner; 
import java.util.function.Supplier;
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.io.IOException; 
class potok
implements Runnable{
	public void run() {
		int a=OOP.height(Main.t, Main.A);
	}
}
public class Main {
		static potok mThing;
		static int t;
		static int A[];
		public static void main(String[] args) throws SecurityException, IOException{
		Logger logger= Logger.getLogger( Main.class.getName()); 
		Supplier <String> StrSupplier = () -> new String("Logger logs");
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� �������� �������� :");
		try{
			int t = sc.nextInt();
		
		int [] A;
		A = new int[t];
		for (int j =0; j<=t-1; j++){
		System.out.println("������� ���������� ������ :");
	    A[j] = sc.nextInt();  
	}
	sc.close();
	mThing = new potok();
	Thread mypot = new Thread(mThing);
	mypot.start();
	Runnable runnable = () ->{ int a = OOP.height(Main.t, Main.A);

};
	Thread tr = new Thread (runnable); 
	tr.start();

	int a=OOP.height(t, A);
	}
	catch (Exception e){
	System.out.println("������� ������ ������������� ��������");
	}finally{
	sc.close();
	}
	FileHandler handler = new FileHandler("logs.txt"); 
	logger.addHandler(handler); 
	logger.info("This is Info Messsage "); 
	logger.log(Level.WARNING, "Warning Message"); 
	System.out.println("������� ������ ������������� ��������");
	logger.log(Level.SEVERE, 
	new RuntimeException("Error"), StrSupplier); 
	}

}
����