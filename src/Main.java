import br.com.langhidev.desafio.dominio.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        Curso cursoAlgoritmos = new Curso();
        cursoAlgoritmos.setTitulo("Pensamento Computacional");
        cursoAlgoritmos.setCargaHoraria(2);

        Conteudo conteudo = new Curso(); // Polimorfismo

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Tire suas dúvidas conosco nesta mentoria explicativa sobre Java");
        mentoriaJava.setMentor("Camila Cavalcante");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaKotlin = new Mentoria();
        mentoriaKotlin.setTitulo("Mentoria de Kotlin");
        mentoriaKotlin.setDescricao("Veja algumas dicas e macetes incríveis sobre a linguagem Kotlin");
        mentoriaKotlin.setMentor("Venilton Falvo");
        mentoriaKotlin.setData(LocalDate.now());

        // Devs que vão se inscrever num bootcamp

        Bootcamp bootcampInter = new Bootcamp();
        bootcampInter.setNome("Orange Tech - BackEnd");
        bootcampInter.setDescricao("O que falta para você se tornar um desenvolvedor Java e começar 2023 com uma formação completa? Inscreva-se já no Orange Tech+ Back-End e tenha mais de 80 horas para transformar sua carreira e conquistar as melhores vagas do mercado tech em 2023! Tenha acesso a módulos sobre a linguagem Java que vão desde o básico e introdução ao ambiente até códigos mais avançados e frameworks mais usados.");
        bootcampInter.getConteudos().add(cursoGit);
        bootcampInter.getConteudos().add(cursoJava);
        bootcampInter.getConteudos().add(mentoriaJava);

        Bootcamp bootcampSportheca = new Bootcamp();
        bootcampSportheca.setNome("Sportheca Mobile Developer");
        bootcampSportheca.setDescricao("Hey dev! Já pensou em trabalhar com desenvolvimento para os maiores clubes de futebol do país como Flamengo, Corinthians, Atlético-MG, Fortaleza e muitos outros? Se inscreva no bootcamp Sportheca Mobile Developer, tenha uma trilha completa sobre Java, Kotlin e Android para se tornar um dev mobile de ponta");
        bootcampSportheca.getConteudos().add(cursoAlgoritmos);
        bootcampSportheca.getConteudos().add(cursoGit);
        bootcampSportheca.getConteudos().add(cursoJava);

        Set<Curso> listaCursos = new HashSet<>(){{
            add(cursoJava);
            add(cursoGit);
            add(cursoJs);
            add(cursoAlgoritmos);
        }};
        Set<Mentoria> listaMentorias = new HashSet<>(){{
            add(mentoriaJava);
            add(mentoriaKotlin);
        }};

        List<Bootcamp> listaBootcamps = new ArrayList<>(){{
            add(bootcampInter);
            add(bootcampSportheca);
        }};

        // Developers
        Dev devNicolas = new Dev();
        devNicolas.setNome("Nicolas");
        devNicolas.inscreverBootcamp(bootcampInter);

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcampInter);

//        System.out.println("Conteúdos Inscritos de Nicolas: " + devNicolas.getConteudosInscritos());
//        System.out.println("Conteúdos Inscritos de Pablo: "+ devPablo.getConteudosInscritos());
//
//        System.out.println("DEPOIS DE UM TEMPO...");

        devPablo.progredir();
        devNicolas.progredir();
        devPablo.progredir();

//        System.out.println("Conteúdos Concluídos de Nicolas: " + devNicolas.getConteudosConcluidos());
//        System.out.println("XP de Nicolas: "+devNicolas.calcularTotalXp());
//
//        System.out.println("Conteúdos Concluídos de Pablo: "+ devPablo.getConteudosConcluidos());
//        System.out.println("XP de Pablo: "+devPablo.calcularTotalXp());

        String nomeDev = JOptionPane.showInputDialog("Seu nome como Dev");

        Dev devUser = new Dev();
        devUser.setNome(nomeDev);

        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo(a) "+nomeDev);

        while(devUser.getNome()!=null) {
            try {
                String num = JOptionPane.showInputDialog("Escolha o conteúdo que deseja visualizar: \n[1] Ver Bootcamps\n[2] Ver cursos\n[3] Ver mentorias");
                String num2 = "";
                int cont = 0;
                if (num.equals("1")) {
                    for (Bootcamp bootcamp : listaBootcamps) {
                        cont++;
                        System.out.println(cont + " - " + bootcamp.getNome()+" ~ "+bootcamp.getDataInicial()+" até "+bootcamp.getDataFinal()+
                                "\n          "+bootcamp.getDescricao()+
                                "\n    Conteúdos -> "+bootcamp.getConteudos()+"\n    Já se inscreveram "+bootcamp.getDevsInscritos().size()+" devs");
                    }
                    num2 = JOptionPane.showInputDialog("Escolha o conteúdo que deseja se inscrever: \n");
                    devUser.inscreverBootcamp(listaBootcamps.get((Integer.parseInt(num2) - 1)));
                } else if (num.equals("2")) {
                    for (Curso curso : listaCursos) {
                        cont++;
                        System.out.println(cont + " - " + curso.getTitulo() + " ~ "+ curso.getCargaHoraria() + " ~ "+curso.getDescricao());
                    }
                } else
                    for (Mentoria mentoria : listaMentorias) {
                        cont++;
                        System.out.println(cont + " - " + mentoria.getTitulo());
                    }

                System.out.println("Você está inscrito nos seguintes Conteúdos:");
                for (Conteudo conteudo1 : devUser.getConteudosInscritos()) {
                    System.out.println(conteudo1);
                }
                JOptionPane.showMessageDialog(null, "Você está inscrito nos seguintes conteúdos (console)");
                num2 = JOptionPane.showInputDialog("[1] Progredir\n[2] Voltar");

                if (num2.equals("1")) {
                    devUser.progredir();
                    System.out.println("Seu XP: " + devUser.calcularTotalXp());
                }
            }catch (NullPointerException e){
                System.out.println("Fim do programa.");
                break;
            }catch (NumberFormatException ex){
                System.out.println("\nPor favor, digite um número válido.\n");
            }
        }

    }
}
