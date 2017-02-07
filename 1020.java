import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int age = input.nextInt();
		int years = 0;
		int mounthes = 0;
		int days = 0;
		boolean action = true;

		while(action){
			if(age > 364){
				age -= 365;
				years++;
			}
			else if(age > 29){
				age -= 30;
				mounthes++;
			}
			else if(age < 30){
				days = age; 
				action = false;
			}
		}
		System.out.println(years + " ano(s)");
		System.out.println(mounthes + " mes(es)");
		System.out.println(days + " dia(s)");
}
}