import java.util.Scanner;

public class Teste{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double number = input.nextDouble();
		number = Double.valueOf(String.format(Locale.US, "%.2f", Math.floor(number)));
	}
}