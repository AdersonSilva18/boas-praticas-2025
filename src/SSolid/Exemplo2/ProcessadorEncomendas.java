package SSolid.Exemplo2;

import java.util.Scanner;

public class ProcessadorEncomendas {
    private CalculadoraFrete calculadoraFrete;
    private EncomendaRepository repository;

    public ProcessadorEncomendas(CalculadoraFrete calculadoraFrete, EncomendaRepository repository) {
        this.calculadoraFrete = calculadoraFrete;
        this.repository = repository;
    }

    public void processar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String idEncomenda = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            // Cria objeto da encomenda
            Encomenda encomenda = new Encomenda(idEncomenda, peso);
            
            // Calcula o frete
            double valorFrete = calculadoraFrete.calcular(peso);
            encomenda.setValorFrete(valorFrete);
            System.out.println("Valor do frete calculado: " + valorFrete);

            // Salva a encomenda
            repository.salvar(encomenda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}