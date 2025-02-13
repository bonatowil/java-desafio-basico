public class Mentoria {
    private Dev mentor;
    private Dev mentorado;
    private String proposito;

    public Mentoria(Dev mentor, Dev mentorado, String proposito) {
        this.mentor = mentor;
        this.mentorado = mentorado;
        this.proposito = proposito;
    }

    public Dev getMentor() {
        return mentor;
    }

    public void setMentor(Dev mentor) {
        this.mentor = mentor;
    }

    public Dev getMentorado() {
        return mentorado;
    }

    public void setMentorado(Dev mentorado) {
        this.mentorado = mentorado;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }
}
