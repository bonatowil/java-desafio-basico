public interface IConta {
    public abstract void depositarDinheiro(double quantia);
    public abstract void sacarDinheiro(double quantia);
    public abstract void transferirDinheiro(double quantia, Conta contaDestino);
    public abstract void exibirSaldo();
}
