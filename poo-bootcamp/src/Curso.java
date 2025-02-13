import java.util.Objects;

public class Curso {
    private String descricao;
    private String tecnologiaAbordada;
    private int duracao;

    public Curso(String descricao, String tecnologiaAbordada, int duracao) {
        this.descricao = descricao;
        this.tecnologiaAbordada = tecnologiaAbordada;
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTecnologiaAbordada() {
        return tecnologiaAbordada;
    }

    public void setTecnologiaAbordada(String tecnologiaAbordada) {
        this.tecnologiaAbordada = tecnologiaAbordada;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return duracao == curso.duracao && Objects.equals(descricao, curso.descricao) && Objects.equals(tecnologiaAbordada, curso.tecnologiaAbordada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, tecnologiaAbordada, duracao);
    }

}
