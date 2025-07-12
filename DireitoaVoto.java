import java.util.Scanner;
public class DireitoaVoto
{
    public static void main(String[] args) {
        int idade;
        String nome;
        
        System.out.println("Informe seu nome: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        
        if ((idade >= 18)&&(idade<=70)){
            System.out.println("Você deve votar!");
        }else if((idade >= 16) && (idade<18) || (idade>70)){
            System.out.println("Você pode votar!(opicional)");
        }
        else{
            System.out.println("Você não pode votar!");
        }
    }
}
