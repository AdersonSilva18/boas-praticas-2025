package DSOLID.Exemplo2;

public class ServicoPagamento {
    private final ILogger logger;

    public ServicoPagamento(Logger logger) {
        this.logger = logger;
    }

    public void pagar(double valor) {
        logger.log("Pagamento de R$" + valor + " realizado com sucesso!");
    }
}