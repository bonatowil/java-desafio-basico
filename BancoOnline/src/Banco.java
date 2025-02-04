public class Banco {
    private int numBanco;
    private String nomeBanco;
    private double taxaTransferencia;
    private double rendimentoCDI;

    public Banco(int numBanco, String nomeBanco, double taxaTransferencia, double rendimentoCDI) {
        this.numBanco = numBanco;
        this.nomeBanco = nomeBanco;
        this.taxaTransferencia = taxaTransferencia;
        this.rendimentoCDI = rendimentoCDI;
    }

    public double getRendimentoCDI() {
        return rendimentoCDI;
    }

    public void setRendimentoCDI(double rendimentoCDI) {
        this.rendimentoCDI = rendimentoCDI;
    }

    public double getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public void setTaxaTransferencia(double taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }

    public int getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
