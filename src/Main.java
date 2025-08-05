import java.util.Scanner;

    public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe seu nome: ";


    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        var name = scanner.next();
        
        System.out.println("Informe a sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Olá " +name+ " sua idade é " +age+ " anos." );

        System.out.println("Quanto é 2 + 2 ? ");
        var result = scanner.nextInt();
        var isRight = (result == 4) ? "sim" : "nao";


        System.out.println("O resultado é 4, você acertou? " + isRight);

        scanner.close();

    }
}