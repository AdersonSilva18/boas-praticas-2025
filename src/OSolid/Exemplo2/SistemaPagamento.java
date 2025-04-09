package OSolid.Exemplo2;

public class SistemaPagamento {

    public void realizarPagamento(double valor, IMetodoPagamento metodo) {
        metodo.realizarPagamento(valor);
    }
}