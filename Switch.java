import java.util.Scanner;
public class Main{
     public static void main (String[] args) {
        
        System.out.println("Informe um numero de 1 a 12");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        
        switch(mes){
            case 1: 
                System.out.println("Este numero representa o mes de Janeiro");
                break;
            case 2:
                System.out.println("Este numero representa o mes de Fevereiro");
                break;
                case 3:
                System.out.println("Este numero representa o mes de Março");
                break;
                case 4:
                System.out.println("Este numero representa o mes de Abril");
                break;
                case 5:
                System.out.println("Este numero representa o mes de Maio");
                break;
                case 6:
                System.out.println("Este numero representa o mes de Junho");
                break;
                case 7:
                System.out.println("Este numero representa o mes de Julho");
                break;
                case 8:
                System.out.println("Este numero representa o mes de Agosto");
                break;
                case 9:
                System.out.println("Este numero representa o mes de Setembro");
                break;
                case 10:
                System.out.println("Este numero representa o mes de Outubro");
                break;
                case 11:
                System.out.println("Este numero representa o mes de Novembro");
                break;
                case 12:
                System.out.println("Este numero representa o mes de Dezembro");
                break;
                default:
                System.out.println("Valor nao aceito.");
        }
    }
}