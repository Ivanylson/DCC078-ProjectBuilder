import java.util.Date;
public class RespondaBuilder {
    private Responda responda;


    public RespondaBuilder(){
        responda = new Responda();
    }

    public Responda build() {
        if(responda.getIdProcurar().equals("")){
            throw new IllegalArgumentException("Pesquisa inválida");
        }
        if (responda.getNumeracaoPontoSolucao() < 0 ) {
            throw new IllegalArgumentException("NPS precisa ser positivo");
        }
        if(responda.getNumeracaoPontoSolucao() > 10){
            throw new IllegalArgumentException("NPS precisa ser menor que onze");
        }
        return responda;
    }

    public RespondaBuilder setIdCliente(String client_id) {
        responda.setIdCliente(client_id);
        return  this;
    }



    public RespondaBuilder setIdProcurar(String search_id) {
        responda.setIdProcurar((search_id));
        return  this;
    }
    public RespondaBuilder setNps(int nps) {
        responda.setNumeracaoPontoSolucao(nps);
        return this;
    }

    public RespondaBuilder setQuestaoDiscursivas(String discursive_question) {
        responda.setQuestaoDiscursivas(discursive_question);
        return this;
    }
    public RespondaBuilder setIdPagina(String page_id) {
        responda.setIdPagina(page_id);
        return this;
    }
    public RespondaBuilder setCriadoEm(Date created_at) {
        responda.setCriadoEm(created_at);
        return this;
    }
}
