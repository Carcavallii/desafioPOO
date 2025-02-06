import rodrigoDesafioPOO.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao(" descricao de mentoria de java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao(" Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev rodrigo = new Dev();
        rodrigo.setNome("Rodrigo");
        rodrigo.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos inscritos Rodrigo: " + rodrigo.getConteudosInscritos());
        rodrigo.progredir();
        System.out.println(" Conteudos inscritos Rodrigo: " + rodrigo.getConteudosInscritos());
        System.out.println(" Conteudos concluidos Rodrigo: " + rodrigo.getConteudosConcluidos());
        System.out.println("XP: " + rodrigo.calcularXpTotal());

        System.out.println("--------------");

        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp);
        System.out.println(" Conteudos inscritos Joao: " + joao.getConteudosInscritos());
        joao.progredir();
        System.out.println(" Conteudos inscritos Joao: " + joao.getConteudosInscritos());
        System.out.println(" Conteudos concluidos Joao: " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularXpTotal());


    }
}
