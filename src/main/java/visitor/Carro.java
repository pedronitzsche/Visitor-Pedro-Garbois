package visitor;

public class Carro implements Veiculo {

    private String modelo;
    private int portas;

    public Carro(String modelo, int portas) {
        this.modelo = modelo;
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.revisarCarro(this);
    }
}