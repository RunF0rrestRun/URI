import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int begin = input.nextInt();
		int end = input.nextInt();
		int[] hours = new int[24];
		int result = 0;
		int result2 = 0;
		if(begin == end){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}else if(begin < end){
			result = end - begin;
			System.out.println("O JOGO DUROU " + result +" HORA(S)");
		}else if(begin > end){
			result = 24 - begin;
			result2 = end + result;
			System.out.println("O JOGO DUROU " + result2 +" HORA(S)");
		}
	}
}
//|b - c| < a < b + c
