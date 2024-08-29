package calculadora.listas.numeros;

import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    private List<Double> ArmazenamentoNumeros =  new ArrayList<Double>();

    public void addList (double numero){
        ArmazenamentoNumeros.add(numero);
    }

    public List<Double> getArmazenamentoNumeros() {
        return ArmazenamentoNumeros;
    }

    public void excluirNumero (double numero){
        ArmazenamentoNumeros.remove(numero);
    }

}
