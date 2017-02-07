import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double A,B,C,root,rOne,rTwo;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		rOne = ((-1) * B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
		rTwo = ((-1) * B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);	

		if(Math.sqrt(B * B - 4 * A * C) > 0 && A != 0 && B != 0 && C != 0){
			System.out.printf("R1 = " + "%.5f\n", rOne);
			System.out.printf("R2 = " + "%.5f\n", rTwo);
		}else{
			System.out.println("Impossivel calcular");
		}	

	}
}