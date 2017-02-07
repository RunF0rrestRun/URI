import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int notesHundred = 0;
		int notesFifty = 0;
		int notesTwenty = 0;
		int notesTen = 0;
		int notesFive = 0;
		int notesTwo = 0;
		int notesOne = 0;
		int number = input.nextInt();
		System.out.println(number);
		while(number != 0){
			if(number > 99){
				number -= 100;
				notesHundred++;
			}
			else if(number > 49){
				number -= 50;
				notesFifty++;
			}
			else if(number > 19){
				number -= 20;
				notesTwenty++;
			}
			else if(number > 9){
				number -= 10;
				notesTen++;
			}
			else if(number > 4){
				number -= 5;
				notesFive++;
			}				
			else if(number > 1){
				number -= 2;
				notesTwo++;
			}	
			else if(number > 0){
				number -= 1;
				notesOne++;
			}	
			else{

			}	
		}	
		
		System.out.println(notesHundred + " nota(s) de R$ 100,00");
		System.out.println(notesFifty + " nota(s) de R$ 50,00");
		System.out.println(notesTwenty + " nota(s) de R$ 20,00");
		System.out.println(notesTen + " nota(s) de R$ 10,00");
		System.out.println(notesFive + " nota(s) de R$ 5,00");
		System.out.println(notesTwo + " nota(s) de R$ 2,00");
		System.out.println(notesOne + " nota(s) de R$ 1,00");
	}
}