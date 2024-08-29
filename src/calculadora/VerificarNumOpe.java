package calculadora;

import calculadora.listas.numeros.ListaNumeros;
import calculadora.listas.operadores.ListaOperadores;
import calculadora.operacoes.Divisao;
import calculadora.operacoes.Multiplicacao;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtracao;

public class VerificarNumOpe {

    //pegando as classes
    ListaNumeros listaNumeros = new ListaNumeros();
    ListaOperadores listaOperadores = new ListaOperadores();
    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();
    Multiplicacao multiplicacao = new Multiplicacao();
    Divisao divisao = new Divisao();

    //verificacao para depois chamar as classes de operadores
    public void verificacaoNumerosOperadores (double num1, double num2, String operador){
        //colocando um if para saber qual operador chamar
        if(operador.equals("+")){
            double resultado = soma.somando( num1, num2);
            System.out.println(resultado);
        } else if(operador.equals("-")){
            double resultado = subtracao.subtracao(num1, num2);
            System.out.println(resultado);
        } else if(operador.equals("*")){
            double resultado = multiplicacao.multiplicacao(num1, num2);
            System.out.println(resultado);
        } else if(operador.equals("/")){
            double resultado = divisao.divisaoRessultado(num1, num2);
            System.out.println(resultado);
        }
    }
}
