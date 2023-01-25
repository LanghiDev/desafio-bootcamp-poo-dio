import br.com.langhidev.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Introdução à Linguagem Java");
        cursoJava.setDescricao("Aprenda os conceitos básicos da linguagem de programação Java");
        cursoJava.setCargaHoraria(4);

        Curso cursoGit = new Curso();
        cursoGit.setTitulo("Introdução ao Git e GitHub");
        cursoGit.setDescricao("Saiba criar seu repositório e ajudar na comunidade!");
        cursoGit.setCargaHoraria(2);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Introdução à Linguagem JavaScript");
        cursoJs.setDescricao("Aprenda a dominar JavaScript e crie sites únicos");
        cursoJs.setCargaHoraria(4);

        Conteudo conteudo = new Curso(); // Polimorfismo

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Tire suas dúvidas conosco nesta mentoria explicativa sobre Java");
        mentoriaJava.setData(LocalDate.now());

        // Devs que vão se inscrever num bootcamp

        Bootcamp bootcampInter = new Bootcamp();
        bootcampInter.setNome("Bootcamp Orange Tech - BackEnd");
        bootcampInter.setDescricao("O que falta para você se tornar um desenvolvedor Java e começar 2023 com uma formação completa? Inscreva-se já no Orange Tech+ Back-End e tenha mais de 80 horas para transformar sua carreira e conquistar as melhores vagas do mercado tech em 2023! Tenha acesso a módulos sobre a linguagem Java que vão desde o básico e introdução ao ambiente até códigos mais avançados e frameworks mais usados.");
        bootcampInter.getConteudos().add(cursoGit);
        bootcampInter.getConteudos().add(cursoJava);
        bootcampInter.getConteudos().add(mentoriaJava);

        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcampInter);

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcampInter);

        System.out.println("Conteúdos Inscritos de Nicolas: " + devNicolas.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos de Pablo: "+ devPablo.getConteudosInscritos());

        System.out.println("DEPOIS DE UM TEMPO...");

        devPablo.progredir();
        devNicolas.progredir();
        devPablo.progredir();

        System.out.println("Conteúdos Concluídos de Nicolas: " + devNicolas.getConteudosConcluidos());
        System.out.println("XP de Nicolas: "+devNicolas.calcularTotalXp());

        System.out.println("Conteúdos Concluídos de Pablo: "+ devPablo.getConteudosConcluidos());
        System.out.println("XP de Pablo: "+devPablo.calcularTotalXp());

    }
}
