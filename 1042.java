import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int numbers[] = new int[3];
		int numbers2[] = new int[3];

		numbers[0] = input.nextInt();
		numbers[1] = input.nextInt();
		numbers[2] = input.nextInt();

		for(int i = 0;i < numbers.length;i++){
			numbers2[i] = numbers[i];
		}
		Arrays.sort(numbers);

		for(int i : numbers)System.out.println(i);
		System.out.println();
		for(int i : numbers2)System.out.println(i);
	}
}