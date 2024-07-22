import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        int conta = scan.nextInt();
        scan.nextLine(); // Consume the newline character left after nextInt()

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o nome completo: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scan.nextDouble();
        scan.nextLine(); // Consume the newline character left after nextDouble()

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", conta " + conta + ", e seu saldo " + saldo + " já está disponível para saque!");
    }
}