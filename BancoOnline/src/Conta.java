public class Conta implements IConta {
    protected double saldo;
    protected Cliente titular;
    protected int agencia;
    protected int conta;
    protected Banco banco;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Conta(double saldo, Cliente titular, int agencia, int conta, Banco banco) {
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.banco = banco;
    }

    @Override
    public void depositarDinheiro(double quantia) {
        if (quantia > 0) {
            this.saldo += quantia;
            System.out.println("Depósito efetuado com sucesso!");
        } else {
            System.out.println("A quantia depositada não pode ser negativa!");
        }
    }

    @Override
    public void sacarDinheiro(double quantia) {
        if (this.saldo - quantia < 0) {
            System.out.println("Não há quantidade suficiente para o saque!");
        } else {
            this.saldo -= quantia;
            System.out.println("Saque realizado com sucesso");
        }
    }

    @Override
    public void transferirDinheiro(double quantia, Conta contaDestino) {
        if (this.saldo - quantia < 0) {
            System.out.println("Não há quantidade suficiente para a transferência!");
        } else {
            double taxa = this.banco.getTaxaTransferencia();
            if (quantia + taxa > this.saldo) {
                quantia = quantia - taxa;
                System.out.println("Valor da transferência reduzida devido a taxa");
            }
            this.saldo -= (quantia + taxa);
            contaDestino.saldo += quantia;
            System.out.println("Transferência realizada com sucesso");
        }
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + this.saldo);
    }
}