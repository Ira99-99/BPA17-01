package lab3_1;

public class OOP {
	public static int height (int t, int a, int A[] ) {
		for (int k =0; k<=t-1; k++){
			a=1;
			for (int i =1; i<=A[k]/2; i++){
				a=a*2;
				a++;
			}
			if (A[k]%2==1) {
				a=a*2;
			}
			System.out.println("������="+a);
			
		}
		return a;
	}
}