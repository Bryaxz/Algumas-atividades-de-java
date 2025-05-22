import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bom dia!");
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Quantos anos você tem, " + nome + "? ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Olá, " + nome + "!");

        if (idade < 18) {
            System.out.println("Você ainda é jovemm!");
        } else {
            System.out.println("Nunca é tarde para aprender.");
        }
        System.out.print("Deseja que eu repita a saudação 10 vezes? (sim/não): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " - Olá, " + nome + "!");
            }
        } else {
            System.out.println("Tudo bem, até a próxima!");
        }
        scanner.close();
    }
}
