
public class SistemaPrincipal {
	public static void main(String[] args) {
		/*  um objeto (classe) que me permita conectar no banco
		 *  executar comandos nesse banco de dados
		 *  desconectar
		 */
		
		InterfaceBD bd = new BDOracle("admin","1234","minhabase", true);
		
		bd.conectar();
		bd.executarComando("SELECT * from TABELA");
		bd.desconectar();
	}

}
