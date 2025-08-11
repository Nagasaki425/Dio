import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Adicionar
         * comentários
         * de varias
         * linhas
         */
        // Adicionar comentário de uma linha

        var scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem ?");
        var age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Você é emancipado ?");
            var resposta = scanner.next().trim().toLowerCase();

            if (resposta.equals("sim") && age >= 16) {
                System.out.println("Você pode dirigir !");

            } else {
                System.out.println("Você não pode dirigir !");
            }

        }

        else {
            System.out.println("Você pode dirigir !");
        }

    }
}