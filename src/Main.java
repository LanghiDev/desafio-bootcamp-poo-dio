import br.com.langhidev.desafio.dominio.Curso;
import br.com.langhidev.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Introdução à Linguagem Java");
        cursoJava.setDescricao("Aprenda os conceitos básicos da linguagem de programação Java");
        cursoJava.setCargaHoraria(4);

        Curso cursoJS = new Curso("Introdução à Linguagem JavaScript", "Aprenda a dominar JavaScript e crie sites únicos", 4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Tire suas dúvidas conosco nesta mentoria explicativa sobre Java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoJS);
        System.out.println(mentoriaJava);
    }
}
