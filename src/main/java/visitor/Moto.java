package visitor;

public class Moto implements Veiculo {

    private String modelo;
    private int cilindradas;

    public Moto(String modelo, int cilindradas) {
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.revisarMoto(this);
    }
}