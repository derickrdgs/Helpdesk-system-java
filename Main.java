import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SistemaChamados sistema = new SistemaChamados();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE CHAMADOS =====");
            System.out.println("1 - Criar chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Atualizar status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição do chamado: ");
                    String descricao = scanner.nextLine();
                    sistema.criarChamado(descricao);
                    break;

                case 2:
                    sistema.listarChamados();
                    break;

                case 3:
                    System.out.print("Digite o ID do chamado: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo status (Aberto / Em andamento / Resolvido): ");
                    String status = scanner.nextLine();

                    sistema.atualizarStatus(id, status);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
