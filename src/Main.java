import java.util.Scanner;

    public class Main {

    private final static String WELCOME_MESSAGE = "Olá, informe seu nome: ";


    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        var name = scanner.next();
        System.out.println("Informe a sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Olá " +name+ " sua idade é " +age+ " anos." );
    }
}