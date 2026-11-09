package visitor;

public class RevisaoVisitor implements Visitor {

    public String revisar(Veiculo veiculo) {
        return veiculo.aceitar(this);
    }

    @Override
    public String revisarCarro(Carro carro) {
        return "Revisao do carro: " +
                carro.getModelo() +
                " | Portas: " +
                carro.getPortas();
    }

    @Override
    public String revisarMoto(Moto moto) {
        return "Revisao da moto: " +
                moto.getModelo() +
                " | Cilindradas: " +
                moto.getCilindradas();
    }

    @Override
    public String revisarCaminhao(Caminhao caminhao) {
        return "Revisao do caminhao: " +
                caminhao.getModelo() +
                " | Eixos: " +
                caminhao.getEixos();
    }
}