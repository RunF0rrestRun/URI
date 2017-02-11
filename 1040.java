import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double n1,n2,n3,n4,n5,media;
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		n4 = input.nextDouble();

		media = n1*2+n2*3+n3*4+n4*1;
		media /= (2+3+4+1);

		
		if(media < 5){
			System.out.println("Media: " + df.format(media));
			System.out.println("Aluno reprovado.");			
		}
		else if(media >= 7){
			System.out.println("Media: " + df.format(media));
			System.out.println("Aluno aprovado.");
		}
		else if(media >= 5 && media <= 6.9){
			n5 = input.nextDouble();
			System.out.println("Media: " + df.format(media));
			System.out.println("Aluno em exame.");		
			System.out.println("Nota do exame: " + df.format(n5));			
			media = (media + n5) / 2;
			if(media >= 5){
				System.out.println("Aluno aprovado.");
				System.out.println("Media final: " + df.format(media));
			}else if(media <= 4.9){
				System.out.println("Aluno reprovado");
				System.out.println("Media final: " + df.format(media));
			}
			
		}

	}
}