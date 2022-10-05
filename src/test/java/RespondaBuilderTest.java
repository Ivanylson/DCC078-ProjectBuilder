import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RespondaBuilderTest {
    @Test
    void returnExpectionIfSearchIsNull() {
        try {
            RespondaBuilder answerBuilder = new RespondaBuilder();
            Responda responda = answerBuilder
                    .setNps(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pesquisa inválida", e.getMessage());
        }
    }

    @Test
    void returnExpectionIfNpsIsNegative() {
        try {
            RespondaBuilder answerBuilder = new RespondaBuilder();
            Responda responda = answerBuilder
                    .setNps(-1)
                    .setIdProcurar("idProcurar")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("NPS precisa ser positivo", e.getMessage());
        }
    }

    @Test
    void returnExceptionIfNpsIsMoreThenTen() {
        try {
            RespondaBuilder answerBuilder = new RespondaBuilder();
            Responda responda = answerBuilder
                    .setNps(11)
                    .setIdProcurar("idProcurar")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("NPS precisa ser menor que onze", e.getMessage());
        }
    }

    @Test
    void returnValidAnswer(){
        RespondaBuilder answerBuilder = new RespondaBuilder();
        Responda responda = answerBuilder
                .setNps(9)
                .setIdCliente("idCliente")
                .setIdPagina("idPagina")
                .setIdPagina("idProcurar")
                .build();
        assertNotNull(responda);
    }
}