import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAgencia;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Digite o número da agência: ");
        numeroAgencia = input.nextInt();
        System.out.print("Digite a agência: ");
        agencia = input.next();
        System.out.print("Digite o nome do responsável pela conta: ");
        nomeCliente = input.next();
        System.out.print("Digite o saldo da conta: ");
        saldo = input.nextDouble();

        System.out.print("Olá"+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
