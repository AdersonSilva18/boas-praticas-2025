package ISOLID.Exemplo2;

public class Carro implements IVeiculoTerrestre {
    @Override
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada...");
    }
}