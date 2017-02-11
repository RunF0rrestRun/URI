import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("0.0");

		double A, B, C, t1, t2;
		double perimeter = 0;
		double area = 0;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		t1 = B - C;
		t2 = B + C;

		if(t1 < A && A < t2){
			perimeter = A + B + C;
			System.out.println("Perimetro = " + ft.format(perimeter));
		}else{
			area = ((A + B) * C) / 2;
			System.out.println("Area = " + ft.format(area));
		}
	}
}