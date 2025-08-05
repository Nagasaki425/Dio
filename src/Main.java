//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2 ? ");
        var result = scanner.nextInt();
        var isRight = (result == 4) ? "sim" : "nao";


        System.out.println("O resultado é 4, você acertou? " + isRight);

        scanner.close();
        }
}