public class Main {
    public static void main(String[] args) {
        Cliente wilson = new Cliente("Wilson Bonato", "111.222.333-19", "São Paulo");
        Banco nubank = new Banco(270, "Nubank", 5, 0.10);
        ContaCorrente contaCorrente = new ContaCorrente(0, wilson, 1, 1234567, nubank);
        ContaPoupanca contaPoupanca = new ContaPoupanca(0, wilson, 1, 1234567, nubank);

        System.out.println("Conta corrente:");
        contaCorrente.depositarDinheiro(500);
        contaCorrente.sacarDinheiro(1000);
        contaCorrente.exibirSaldo();
        contaCorrente.sacarDinheiro(400);
        contaCorrente.exibirSaldo();

        System.out.println("Conta poupança:");
        contaCorrente.transferirDinheiro(100, contaPoupanca);
        contaPoupanca.exibirSaldo();
        contaPoupanca.depositarDinheiro(100);
        contaPoupanca.sacarDinheiro(200);
        contaPoupanca.renderSaldo();
        contaPoupanca.exibirSaldo();
        contaPoupanca.transferirDinheiro(contaPoupanca.getSaldo(), contaCorrente);

        System.out.print("Saldo final conta corrente:");
        contaCorrente.exibirSaldo();

        System.out.print("Saldo final conta poupança:");
        contaPoupanca.exibirSaldo();
    }
}
