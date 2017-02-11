import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("0.0");

		int A, B;
		A = input.nextInt();
		B = input.nextInt();

		if(A > B && A % B == 0 || B > A && B % A == 0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
	}
}