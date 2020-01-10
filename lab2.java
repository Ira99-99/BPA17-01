import java.util.Scanner;


public class Main
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите количество тестовых примеров :");

		int t = sc.nextInt();

		int [] A;

		A = new int[t];
 
		for (int j =0; j<=t-1; j++){

			System.out.println("Введите количество циклов :");

        		A[j] = sc.nextInt();  
		
		}
		
        
		sc.close();

        
        
		for (int k =0; k<=t-1; k++){

       			double a=1;

        		for (int i =1; i<=A[k]/2; i++){

            			a=a*2;

            			a++;

        		}

    
        		if (A[k]%2==1) {

        			a=a*2;

        		}
 
       
        		System.out.println("Высота"+a);

        	
}
		
        		
	
	}

}
