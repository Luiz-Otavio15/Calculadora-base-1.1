import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Matematica s1 = new Matematica();
        s1.soma = "Soma";
        s1.multiplicacao = "Multiplicação";
        s1.divisao = "Divisão";
        s1.subtracao = "Subtrair";


        System.out.println("Olá, seja bem vindo a calculadora: ");
        System.out.println(s1.soma);
        System.out.println(s1.multiplicacao);
        System.out.println(s1.divisao);
        System.out.println(s1.subtracao);
        System.out.println("=============================================");
        s1.pergunta = input.nextLine();
        System.out.println("=============================================");
        s1.matematica();
        System.out.println("Deseja fazer alguma outra operação ? (Não / Sim)");
        String pergunta = input.nextLine();

        while (pergunta.equalsIgnoreCase("Sim")) {
            System.out.println("Olá, seja bem vindo a calculadora: ");
            System.out.println(s1.soma);
            System.out.println(s1.multiplicacao);
            System.out.println(s1.divisao);
            System.out.println(s1.subtracao);
            System.out.println("=============================================");
            s1.pergunta = input.nextLine();
            System.out.println("=============================================");
            s1.matematica();
            System.out.println("Deseja fazer alguma outra operação ? (Não / Sim)");
            String pergunta1 = input.nextLine();
            if (pergunta1.equalsIgnoreCase("Não")) {
                System.out.println("Fechando...");
                break;
        }
        }
        if (pergunta.equalsIgnoreCase("Não")) {
            System.out.println("Fechando ...");
        }
    }
}