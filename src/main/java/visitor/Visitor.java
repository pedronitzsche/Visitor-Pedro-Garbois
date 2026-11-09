package visitor;

public interface Visitor {

    String revisarCarro(Carro carro);

    String revisarMoto(Moto moto);

    String revisarCaminhao(Caminhao caminhao);
}