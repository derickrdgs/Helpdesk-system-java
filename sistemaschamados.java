import java.util.ArrayList;

public class SistemaChamados {

    private ArrayList<Chamado> chamados = new ArrayList<>();
    private int contador = 1;

    public void criarChamado(String descricao) {
        Chamado chamado = new Chamado(contador++, descricao);
        chamados.add(chamado);
        System.out.println("Chamado criado com sucesso!");
    }

    public void listarChamados() {
        if (chamados.isEmpty()) {
            System.out.println("Nenhum chamado encontrado.");
            return;
        }

        for (Chamado c : chamados) {
            System.out.println("ID: " + c.getId() +
                    " | Descrição: " + c.getDescricao() +
                    " | Status: " + c.getStatus());
        }
    }

    public void atualizarStatus(int id, String novoStatus) {
        for (Chamado c : chamados) {
            if (c.getId() == id) {
                c.setStatus(novoStatus);
                System.out.println("Status atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Chamado não encontrado.");
    }
}
