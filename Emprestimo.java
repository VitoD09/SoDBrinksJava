import java.util.Scanner;
public class Emprestimo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario,emprestimo,prestacao;
        
        System.out.println("Informe o valor do salario: ");
        salario = sc.nextFloat();
        System.out.println("Informe o valor da prestaçao: ");
        prestacao  = sc.nextFloat();
        
        if(prestacao > 0.2 * salario ){
            System.out.println("Emprestimo nao concedido!");
        }else{
            System.out.println("Emprestimo concedido!");
        }
    }
}
