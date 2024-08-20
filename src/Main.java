import calculo.Multiplicacao;
import calculo.Divisao;
import calculo.Soma;
import calculo.Subtracao;

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

        //criando as variaveis
        int numero1;
        int numero2;

        //criando as mensagens colocando para ler as variaveis
        System.out.println(
                "Digite o primeiro numero para calcular"
        );
        numero1 = scanner.nextInt();
        System.out.println(
                "Digite o segundo numero para calcular"
        );
        numero2 = scanner.nextInt();

        //soma
        System.out.println(
                somando.somando(
                        numero1,
                        numero2
                )
        );
        //subtração
        System.out.println(
                subtracao.subtracao(
                        numero1,
                        numero2
                )
        );
        //multiplicação
        System.out.println(
                multiplicacao.multiplicacao(
                        numero1,
                        numero2
                )
        );
        //divisão
        System.out.println(
                divisao.divisaoRessultado(
                        numero1,
                        numero2
                )
        );
    }
}