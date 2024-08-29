import calculadora.VerificarNumOpe;
import calculadora.listas.operadores.ListaOperadores;
import calculadora.operacoes.Multiplicacao;
import calculadora.operacoes.Divisao;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtracao;
import calculadora.listas.numeros.ListaNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //craindo o scanner
        Scanner scanner = new Scanner(System.in);

        //criei a variavel de numeros
        ListaNumeros numeros = new ListaNumeros();
        ListaOperadores operadores = new ListaOperadores();
        //criando as variaveis para pegar os imports dos calculo

        //criando as mensagens colocando para ler as variaveis
        System.out.println(
                "Digite o primeiro numero para calcular"
        );
        numeros.addList(scanner.nextDouble());

        System.out.println(
                "Digite o operador para calcular"
        );
        operadores.addList(scanner.next());

        System.out.println(
                "Digite o segundo numero para calcular"
        );
        numeros.addList(scanner.nextDouble());

        //pegando os numeros das listas que foram digitados
        VerificarNumOpe verificarNumOpe = new VerificarNumOpe();
        verificarNumOpe.verificacaoNumerosOperadores(
                numeros.getArmazenamentoNumeros().get(0),
                numeros.getArmazenamentoNumeros().get(0),
                operadores.getArmazenamentoOperadores().get(0)
        );
    }
}