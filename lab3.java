package lab3_1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� �������� �������� :");
		int t = sc.nextInt();
		int [] A;
		A = new int[t];
		for (int j =0; j<=t-1; j++){
			System.out.println("������� ���������� ������ :");
        		A[j] = sc.nextInt();  
		}
		sc.close();
		int a=1;
    		a=OOP.height(t, a, A);
	}
}