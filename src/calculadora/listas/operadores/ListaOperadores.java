package calculadora.listas.operadores;

import java.util.ArrayList;
import java.util.List;

public class ListaOperadores {
    private List<String> ArmazenamentoOperadores =  new ArrayList<String>();

    public void addList (String operador){
        ArmazenamentoOperadores.add(operador);
    }

    public List<String> getArmazenamentoOperadores() {
        return ArmazenamentoOperadores;
    }

    public void excluirNumero (double operador){
        ArmazenamentoOperadores.remove(operador);
    }

}
