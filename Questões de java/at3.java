import java.util.Scanner;
public class at3 {
    public static void main(String[] args) {
        
        System.out.println("Bom dia!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);
        scanner.close();
        for (int i = 0; i < 10; i++) {
            System.out.println("Olá, " + nome);
        }
        
    }
}