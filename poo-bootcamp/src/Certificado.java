public class Certificado {
    String descricao;
    Curso curso;
    Dev dev;

    public Certificado(String descricao, Curso curso, Dev dev) {
        this.descricao = descricao;
        this.curso = curso;
        this.dev = dev;
    }

    public void exibirInfo() {
        System.out.println("Este certificado comprova que o desenvolvedor: " + this.dev.getNome() + " concluiu o curso: " + this.curso.getDescricao() + " com duração de " + this.curso.getDuracao() + " minutos.");
        System.out.println("O curso abordou a seguinte tecnologia: " + this.curso.getTecnologiaAbordada());
        System.out.println();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }
}
