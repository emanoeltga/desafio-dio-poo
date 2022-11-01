package com.dio.desafio;
import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Orientação Objeto avançado");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Js Avamçado");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Mentoria java Orientado");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer Avançado.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luiz:" + devLuiz.getConteudosConcluidos());
        System.out.println("XP:" + devLuiz.calcularTotalXp());

        System.out.println("-------");

        Dev devEmanoel = new Dev();
        devEmanoel.setNome("Emanoel");
        devEmanoel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Emanoel:" + devEmanoel.getConteudosInscritos());
        devEmanoel.progredir();
        devEmanoel.progredir();
        devEmanoel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Emanoel:" + devEmanoel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Emanoel:" + devEmanoel.getConteudosConcluidos());
        System.out.println("XP:" + devEmanoel.calcularTotalXp());

    }

}