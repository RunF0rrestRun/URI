import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		DecimalFormat ft = new DecimalFormat("0.0");

		int begin,end;
		int tempo;
		begin = input.nextInt();
		end = input.nextInt();
		int[] hours = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] hours2 = {};
		//System.out.println(hours[2%24]);
		if(end <= 24){
			for(int i = begin;i <= end;i++){

			}
		}else{	
			for(int i = 0;i <= end;i++){

			}
		}
	}
}
//|b - c| < a < b + c
