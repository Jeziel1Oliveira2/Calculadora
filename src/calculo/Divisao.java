package calculo;

import numeros.Numeros;

public class Divisao extends Numeros {

    public int divisaoRessultado (int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

    public int divisaoResto (int num1, int num2) {
        int resultado = num1 % num2;
        return resultado;
    }
}
