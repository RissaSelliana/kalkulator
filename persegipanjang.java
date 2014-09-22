import java.util.Scanner;
public class persegipanjang
{
	public static void main(String[]args)
	{
		int a,b;
		float L;
		Scanner input=new Scanner(System.in);
		System.out.print("Masukkan panjang = ");
		a= input.nextInt();
		System.out.print("Masukkan lebar = ");
		b= input.nextInt();
		System.out.println("");
		L=a*b;
		System.out.println("Hasilnya adalah ="+L);
	}
}
		