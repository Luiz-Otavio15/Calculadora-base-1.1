import java.util.Scanner;
public class Matematica {
    Scanner input = new Scanner(System.in);

    String soma;
    String multiplicacao;
    String divisao;
    String subtracao;
    String pergunta;


    void matematica() {
        if (pergunta.equals("Soma")) {
            System.out.println("Digite o numero que deseja somar: ");
            int numero1 = input.nextInt();
            System.out.println("Digite o numero que deseja somar: ");
            int numero2 = input.nextInt();
            int soma;
            soma = (numero1 + numero2);
            System.out.println("=============================================");
            System.out.println("Resultado final é " + soma);
        } else if (pergunta.equals("Multiplicação")) {
            System.out.println("Digite o numero que deseja multiplicar: ");
            int numero1 = input.nextInt();
            System.out.println("Digite o numero que deseja multiplicar: ");
            int numero2 = input.nextInt();
            int soma;
            soma = (numero1 * numero2);
            System.out.println("=============================================");
            System.out.println("Resultado final é " + soma);
        } else if (pergunta.equals("Divisão")) {
            System.out.println("Digite o numero que deseja dividir: ");
            double numero1 = input.nextInt();
            System.out.println("Digite o numero que deseja dividir: ");
            double numero2 = input.nextInt();
            double soma;
            soma = (numero1 / numero2);
            System.out.println("=============================================");
            System.out.println("Resultado final é " + soma);
        } else if (pergunta.equals("Subtrair")) {
            System.out.println("Digite o numero que deseja subtrair: ");
            int numero1 = input.nextInt();
            System.out.println("Digite o numero que deseja subtrair: ");
            int numero2 = input.nextInt();
            int soma;
            soma = (numero1 - numero2);
            System.out.println("=============================================");
            System.out.println("Resultado final é " + soma);
        } else {
            System.out.println("Error... O que você digitou " + "\" " + pergunta + " \"" + " estar incorreto. Tente novamente!");
            System.out.println("=============================================");
            return;
        }
    }
}