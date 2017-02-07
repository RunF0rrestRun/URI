import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int years = 0;
		int mounthes = 0;
		int days = 0;
		boolean action = true;

		while(action){
			if(input > 364){
				input -= 365;
				years++;
			}
			else if(input > 29){
				input -= 30;
				mounth++;
			}
			else if(input < 30){
				days = input; 
				action = false;
			}
		}
		System.out.ptintln(years + " ano(s)");
		System.out.ptintln(mounthes + " mes(s)");
		System.out.ptintln(days + " dia(s)");
}