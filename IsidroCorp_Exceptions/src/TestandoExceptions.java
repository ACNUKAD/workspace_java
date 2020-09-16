import java.util.InputMismatchException;
import java.util.Scanner;

public class TestandoExceptions {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String strId;
		String strDescricao;
		String strPreco;
		String strOpcao;

		int opcao = 1;

		do {
			// vamos cadastrar um produto com tratamento de exceções
			try {
				Produto p = new Produto();

				System.out.println("Digite o ID");
				strId = teclado.nextLine();
				p.setId(Integer.parseInt(strId));

				System.out.println("Digite a Descricao");
				strDescricao = teclado.nextLine();
				p.setDescricao(strDescricao);

				System.out.println("Digite o Preço");
				strPreco = teclado.nextLine();
				p.setPreco(Float.parseFloat(strPreco));

				System.out.println("Produto Cadastrado!");
				
				System.out.println("Deseja continuar? 1- sim / 0- nao");
				strOpcao = teclado.nextLine();
				opcao = Integer.parseInt(strOpcao);
			} 
			catch (IsiException ex) {
				System.out.println("Erro de cadastro: "+ex.getMessage());
			}
			catch (NumberFormatException ex) {
				System.out.println("Tipo de Informação Inválida - Verifique");
			}
			catch (Exception ex) {
				System.out.println("Erro Desconhecido: " + ex.getMessage());
				System.out.println("    TIPO: "+ex.getClass().getName());
			}

		} while (opcao != 0);

	}

}
