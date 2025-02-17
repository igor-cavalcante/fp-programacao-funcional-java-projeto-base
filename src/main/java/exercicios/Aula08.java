package exercicios;

import exercicios.base.Aula;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Aula08 extends Aula {

    public  Aula08(){


        var estudante1 = estudantes.getFirst();


        var estudante = estudantes
                .stream()
                .reduce(estudante1, (e1, e2) -> e1.getNota() > e2.getNota() ? e1 : e2 );

        System.out.println(estudante);
    }

    public static void main(String[] args) {
    new Aula08();
    }

}
