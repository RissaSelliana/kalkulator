import java.util.Scanner;
public class bagi
{
	public static void main(String[]args)
	{
		int a,b;
		float L;
		Scanner input=new Scanner(System.in);
		System.out.print("Masukkan a = ");
		a= input.nextInt();
		System.out.print("Masukkan b = ");
		b= input.nextInt();
		System.out.println("");
		L=a/b;
		System.out.println("Hasilnya adalah ="+L);
	}
}
		