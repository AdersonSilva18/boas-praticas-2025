package LSOLID.Exemplo2;

public class ContaCorrente extends ContaBancaria implements ContaComSaque {
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}