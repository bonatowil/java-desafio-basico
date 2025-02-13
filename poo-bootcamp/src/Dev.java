import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Dev {
    private String nome;
    private int xp;
    private int nivel;
    private final Map<Curso, Double> listaCursos = new HashMap<>();
    private final List<Bootcamp> listaBootcamps = new ArrayList<>();
    private final List<Mentoria> listaMentorias = new ArrayList<>();
    private final List<Certificado> listaCertificados = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
        this.xp = 0;
        this.nivel = 0;
    }

    public void adicionarCurso(Curso curso) {
        listaCursos.put(curso, 0d);
    }

    public void removerCurso(Curso curso) {
        listaCursos.remove(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        if (this == mentoria.getMentorado()) mentoria.getMentor().adicionarMentoria(mentoria);
        listaMentorias.add(mentoria);
    }

    public void removerMentoria(Mentoria mentoria) {
        listaMentorias.remove(mentoria);
    }

    public void adicionarBootcamp(Bootcamp bootcamp) {
        listaBootcamps.add(bootcamp);
    }

    public void removerBootcamp(Bootcamp bootcamp) {
        listaBootcamps.remove(bootcamp);
    }

    public void progredirCurso(Curso curso) {
        double progessoCurso = listaCursos.get(curso);
        if (progessoCurso < 1) {
            listaCursos.put(curso, progessoCurso + (5.0 / curso.getDuracao()));
            this.xp += 50;
            if (this.xp == 200) {
                this.xp = 0;
                this.nivel += 1;
            }
        }
        if (progessoCurso > 1) listaCursos.put(curso, 1.0); // Se tiver passado de 100% de progresso no if acima, mantém em 100
    }                                                       // É possível passar de 100%, pois é necessário adicionar o último xp, mesmo que tiver ido de 99,9 para 100

    public void exibirCursos() {
        System.out.println("Cursos do Dev " + this.nome+ ":");
        if (listaCursos.isEmpty()) System.out.println("Não há cursos.");
        for (Map.Entry<Curso, Double> curso: this.listaCursos.entrySet()) {
            System.out.println("Curso: " + curso.getKey().getDescricao() + " | Progresso: " + curso.getValue() * 100 + "%");
        }
    }

    public void gerarCertificado(Curso curso) {
        double progessoCurso = listaCursos.get(curso);
        if (progessoCurso != 1) {
            System.out.printf("Não é possível gerar o certificado pois ainda há %.2f%% do curso a ser realizado.", (1 - progessoCurso) * 100);
            System.out.println();
        } else {
            listaCertificados.add(new Certificado("Certificado em " + curso.getTecnologiaAbordada(), curso, this));
        }
    }

    public void exibirCertificados() {
        System.out.println("Lista de certificados do Dev " + this.nome + ":");
        if (listaCertificados.isEmpty()) System.out.println("Não há certificados.");
        for (Certificado certificado: listaCertificados) {
            System.out.println(certificado.getDescricao());
        }
    }

    public void exibirBootcamps() {
        System.out.println("Bootcamps do Dev " + this.nome+ ":");
        if (listaBootcamps.isEmpty()) System.out.println("Não há Bootcamps.");
        for (Bootcamp bootcamp: listaBootcamps) {
            System.out.println("Bootcamp: " + bootcamp.getDescricao());
        }
    }

    public void exibirMentorias() {
        System.out.println("Mentorias do Dev " + this.nome+ ":");
        if (listaMentorias.isEmpty()) System.out.println("Não há mentorias.");
        for (Mentoria mentoria: listaMentorias) {
            if (mentoria.getMentorado() == this) {
                System.out.println("Objetivo da mentoria: " + mentoria.getProposito() + " | Mentor: " + mentoria.getMentor().getNome());
            } else {
                System.out.println("Objetivo da mentoria: " + mentoria.getProposito() + " | Mentorado: " + mentoria.getMentorado().getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
