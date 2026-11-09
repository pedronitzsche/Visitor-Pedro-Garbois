package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RevisaoVisitorTest {

    @Test
    void deveRevisarCarro() {
        Carro carro = new Carro("Civic", 4);

        RevisaoVisitor visitor = new RevisaoVisitor();

        assertEquals(
                "Revisao do carro: Civic | Portas: 4",
                visitor.revisar(carro)
        );
    }

    @Test
    void deveRevisarMoto() {
        Moto moto = new Moto("CB 500", 500);

        RevisaoVisitor visitor = new RevisaoVisitor();

        assertEquals(
                "Revisao da moto: CB 500 | Cilindradas: 500",
                visitor.revisar(moto)
        );
    }

    @Test
    void deveRevisarCaminhao() {
        Caminhao caminhao = new Caminhao("Actros", 3);

        RevisaoVisitor visitor = new RevisaoVisitor();

        assertEquals(
                "Revisao do caminhao: Actros | Eixos: 3",
                visitor.revisar(caminhao)
        );
    }
}