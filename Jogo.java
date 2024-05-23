java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        new Random().nextInt(100);
        int numberRandom = new Random().nextInt(100);

        Scanner tentativa = new Scanner(System.in);

        int quantidadeDeTentativas = 0;
        int chute = 0;


        for (quantidadeDeTentativas = 0; quantidadeDeTentativas < 20; quantidadeDeTentativas++) {
            System.out.println("Digite seu chute: ");
            chute = tentativa.nextInt();

            if (chute == numberRandom) {
                System.out.println("Você acertou!");
                break;
            } else if (chute > numberRandom) {
                System.out.println("Você digitou um número maior que o procurado");
            } else if (chute < numberRandom) {
                System.out.println("Você digitou um número menor que o procurado");
            }

        }

        if (quantidadeDeTentativas == 5 && chute != numberRandom) {
            System.out.println("Você usou todas suas tentativas");
            System.out.println("FIM DE JOGO");
        } else {
            System.out.println("Obrigado por jogar!");
        }



    }
}
