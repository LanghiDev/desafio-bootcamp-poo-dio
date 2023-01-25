package br.com.langhidev.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private String mentor;
    private LocalDate data;

    public Mentoria(){}

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
