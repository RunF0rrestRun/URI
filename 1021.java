import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int A,B,C,D;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();	

		if(B > C && D > A){
			if((C + D) > (A + B)){
				if (C % 2 == 0 && D % 2 == 0 && A % 2 ==0) {
					System.out.println("Valores aceitos");	
				}
			}
		}else{
			System.out.println("Valores nao aceitos");
		}
	}
}