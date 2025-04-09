package SSolid.Exemplo2;

public class Main {
    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();
        EncomendaRepository repository = new EncomendaRepository();
        ProcessadorEncomendas processador = new ProcessadorEncomendas(calculadora, repository);
        processador.processar();
    }
}