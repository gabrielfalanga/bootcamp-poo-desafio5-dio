import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Descrição do curso de Java.");
        cursoJava.setCargaHoraria(8);
        System.out.println(cursoJava);

        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso de Python");
        cursoPython.setDescricao("Descrição do curso de Python.");
        cursoPython.setCargaHoraria(10);
        System.out.println(cursoPython);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição da mentoria de Java.");
        mentoriaJava.setData(LocalDate.now());
        System.out.println(mentoriaJava);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Open Academy");
        bootcamp.setDescricao("Descrição do Bootcamp Santander Open Academy");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devFalanga = new Dev();
        devFalanga.setNome("Falanga");
        devFalanga.inscreverBootcamp(bootcamp);
        devFalanga.progredir();
        System.out.println("Conteúdos inscritos de Falanga: " + devFalanga.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Falanga: " + devFalanga.getConteudosConcluidos());
        System.out.println("XP de Falanga: " + devFalanga.calcularTotalXp());

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Matheus: " + devMatheus.getConteudosConcluidos());
        System.out.println("XP de Matheus: " + devMatheus.calcularTotalXp());
    }
}
