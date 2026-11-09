package visitor;

public class Caminhao implements Veiculo {

    private String modelo;
    private int eixos;

    public Caminhao(String modelo, int eixos) {
        this.modelo = modelo;
        this.eixos = eixos;
    }

    public String getModelo() {
        return modelo;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.revisarCaminhao(this);
    }
}