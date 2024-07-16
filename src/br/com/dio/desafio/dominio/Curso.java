package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

//    métodos

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

//    getters e setters

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

//    to string

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
