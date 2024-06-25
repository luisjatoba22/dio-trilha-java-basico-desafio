import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("::: Iniciando o Sistema do Banco :::");

        System.out.println("Digite o seu nome e sobrenome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite número da conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine(); //limpa buffer

        System.out.println("Digite número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o saldo da Conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
