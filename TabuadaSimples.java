import java.util.Scanner;
public class TabuadaSimples
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int result;
    
    System.out.println("Tabuada do "+num+" :");
    for(int i = 1; i<=10; i++){
        result = i*num;        
        System.out.println(num+" × "+ i +" = "+result );
    }    
    }
}
