package lab4_1;
import java.util.Scanner;
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
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество тестовых примеров :");
		int t = sc.nextInt();
		int [] A;
		A = new int[t];
		for (int j =0; j<=t-1; j++){
		System.out.println("¬ведите количество циклов :");
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
	
	}