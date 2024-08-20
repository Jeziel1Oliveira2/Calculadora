import calculo.Multiplicacao;
import calculo.Divisao;
import calculo.Soma;
import calculo.Subtracao;

public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        numero1 = 6;
        numero2 = 6;

        Soma somando = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(somando.somando(numero1, numero2));
        System.out.println(subtracao.subtracao(numero1, numero2));
        System.out.println(multiplicacao.multiplicacao(numero1, numero2));
        System.out.println(divisao.divisaoRessultado(numero1, numero2));
        
    }
}