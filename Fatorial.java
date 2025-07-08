import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
        int fact=1;

        System.out.println("Informe um valor: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i<=num ; i++){
           fact*=i;
        }
		 System.out.println("A fatorial de "+num+" e "+fact);
	}
}
