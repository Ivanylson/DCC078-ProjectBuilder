import java.util.Date;

public class Responda {
    private String idCliente;
    private String idProcurar;
    private int nps;
    private String questaoDiscursivas;
    private String idPagina;
    private Date criadoEm;

    public Responda(){
        this.idProcurar = "";
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdProcurar() {
        return idProcurar;
    }

    public void setIdProcurar(String idProcurar) {
        this.idProcurar = idProcurar;
    }

    public int getNps() {
        return nps;
    }

    public void setNps(int nps) {
        this.nps = nps;
    }

    public String getQuestaoDiscursivas() {
        return questaoDiscursivas;
    }

    public void setQuestaoDiscursivas(String questaoDiscursivas) {
        this.questaoDiscursivas = questaoDiscursivas;
    }

    public String getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(String idPagina) {
        this.idPagina = idPagina;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }
}
