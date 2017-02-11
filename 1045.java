import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("0.0");
		double[] numbers = new double[3];
		double A, B, C, t1, t2, t3, t4, t5;
		numbers[0] = input.nextDouble();
		numbers[1] = input.nextDouble();
		numbers[2] = input.nextDouble();

		Arrays.sort(numbers);

		A = numbers[2];
		B = numbers[1];
		C = numbers[0];

		if(A >= B + C){
			System.out.println("NAO FORMA TRIANGULO");
		}else if(A * A == B * B + C * C){
			System.out.println("TRIANGULO RETANGULO");
		}else if(A * A > B * B + C * C){
			System.out.println("TRIANGULO OBTUSANGULO");
		}else if(A * A < B * B + C * C){
			System.out.println("TRIANGULO ACUTANGULO");
		}if(A == B && B == C){
			System.out.println("TRIANGULO EQUILATERO");
		}else if(A == B && C != B || A == C && B != C || B == C && A != C){
			System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
//|b - c| < a < b + c