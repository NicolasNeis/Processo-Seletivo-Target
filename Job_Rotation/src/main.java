import Exercicios.soma;
import Exercicios.fibonacci;
import Exercicios.inverter;

public class main {
    public static void main(String[] args) {

        System.out.println("-------------------ex1------------------------");
        soma.ex1();
        System.out.println("-------------------ex2------------------------");
        System.out.println(fibonacci.ex2());
        System.out.println("-------------------ex3------------------------");
        System.out.println(9);
        System.out.println(128);
        System.out.println(49);
        System.out.println(100);
        System.out.println(13);
        System.out.println(20);
        System.out.println("-------------------ex4------------------------");
        System.out.println("Ao se cruzarem, eles estariam lado a lado, entao, estariam com a mesma distancia de Ribeirao Preto.");
        System.out.println("Porem, o carro leva 1h30min para fazer o percurso completo, ja o caminhao levaria 2h18min (contando 10 min do pedagio).");
        System.out.println("Ou seja, se os dois saissem juntos a partir do ponto que se cruzaram, o carro chegaria antes.");
        System.out.println("-------------------ex5------------------------");
        inverter.invertendo();
    }
}
