import java.util.Scanner;
public class segitiga
{
	public static void main(String[]args)
	{
		int a,b;
		float L;
		Scanner input=new Scanner(System.in);
		System.out.print("Masukkan alas = ");
		a= input.nextInt();
		System.out.print("Masukkan tinggi = ");
		b= input.nextInt();
		System.out.println("");
		L=(a*b)/2;
		System.out.println("Hasilnya adalah ="+L);
	}
}
		