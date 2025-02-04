public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo, Cliente titular, int agencia, int conta, Banco banco) {
        super(saldo, titular, agencia, conta, banco);
    }

    public void renderSaldo() {
        double rendimentoCDI = this.banco.getRendimentoCDI();
        this.saldo += saldo * rendimentoCDI;
    }

    @Override
    public void sacarDinheiro(double quantia) {
        System.out.println("Não é possível utilizado o saldo da conta poupança para saques, transfira para um conta corrente e tente novamente!");
    }
}
