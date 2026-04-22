public class Chamado {
    private int id;
    private String descricao;
    private String status;

    public Chamado(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.status = "Aberto";
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
