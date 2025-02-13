public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Formação Java Developer", "Java", 10);
        Curso cursoPython = new Curso("Formação Python", "Python", 10);
        Dev devEu = new Dev("Wilson");
        Dev devMentor = new Dev("Fulano");
        Mentoria mentoria = new Mentoria(devMentor, devEu, "Aprender Java");
        Bootcamp bootcampJavaSprint = new Bootcamp("Java Spring", 100);

        devEu.adicionarCurso(cursoJava);
        devEu.adicionarCurso(cursoPython);
        devEu.adicionarMentoria(mentoria);
        devEu.adicionarBootcamp(bootcampJavaSprint);

        devEu.exibirCursos();
        devEu.progredirCurso(cursoJava);
        devEu.gerarCertificado(cursoJava);
        devEu.progredirCurso(cursoJava);
        devEu.gerarCertificado(cursoJava);
        devEu.exibirCertificados();
        devEu.exibirCursos();

        devMentor.exibirMentorias();
        devEu.exibirMentorias();
        devEu.exibirBootcamps();
    }
}