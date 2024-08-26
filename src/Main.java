import calculo.Multiplicacao;
import calculo.Divisao;
import calculo.Soma;
import calculo.Subtracao;
import numeros.Numeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //craindo o scanner
        Scanner scanner = new Scanner(System.in);

        //criando as variaveis para pegar os imports dos calculos
        Soma somando = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
Numeros numeros = new Numeros();

        //criando as variaveis
        int numero1;
        int numero2;

        //criando as mensagens colocando para ler as variaveis
        System.out.println(
                "Digite o primeiro numero para calcular"
        );
        numeros.setNum1(scanner.nextInt());
        System.out.println(
                "Digite o segundo numero para calcular"
        );
        numeros.setNum2(scanner.nextInt());

        //soma
        System.out.println(
                numeros.getNum1() +
                        " + " +
                numeros.getNum2() +
                        " = " +
                somando.somando(
                        numeros.getNum1(),
                        numeros.getNum2()
                )
        );
        //subtração
        System.out.println(
                numeros.getNum1() +
                        " - " +
                numeros.getNum2() +
                        " = " +
                subtracao.subtracao(
                        numeros.getNum1(),
                        numeros.getNum2()
                )
        );
        //multiplicação
        System.out.println(
                numeros.getNum1() +
                        " * " +
                numeros.getNum2() +
                        " = " +
                multiplicacao.multiplicacao(
                        numeros.getNum1(),
                        numeros.getNum2()
                )
        );
        //divisão
        System.out.println(
                numeros.getNum1() +
                        " / " +
                numeros.getNum2() +
                        " = " +
                divisao.divisaoRessultado(
                        numeros.getNum1(),
                        numeros.getNum2()
                )
        );
    }
}