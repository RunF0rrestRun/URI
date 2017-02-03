import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double carV = 12;
		double resultado;

		int hours = input.nextInt();
		int km = input.nextInt();

		resultado = (hours * km) / carV;

		System.out.printf("%.3f\n",resultado);
	}
}