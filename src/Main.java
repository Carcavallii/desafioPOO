import rodrigoDesafioPOO.Curso;
import rodrigoDesafioPOO.Mentoria;

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

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao(" descricao de mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
