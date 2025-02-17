package exercicios;

import exercicios.base.Aula;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;

public class Aula07 extends Aula {

//    private List<Estudante> alunos = this.estudantes ;


    public Aula07(){

//        alunos.forEach(System.out::println);


          estudantes.stream()
                .filter(e -> e.getNota() < 10)
                .mapToDouble(Estudante::getNota)
                .max()
                  .ifPresent(Aula07::consumer);

//        double maiornota = maxOptional.orElseThrow(Aula07::teste);
//
//        System.out.println(maiornota);


    }

    public static void consumer (double e ){
        System.out.println(e);
    }


    public static RuntimeException teste(){
        return new NoSuchElementException("Nenhum estudante encontrado");
    }

    public static double  getNotaAleatoria (){
        System.out.println("Chamando função nota aleatoria");
        var x = Math.random();
        var y = Math.random();

        return x + y;
    };

    public static void main(String[] args) {
        new Aula07();
    }


}
