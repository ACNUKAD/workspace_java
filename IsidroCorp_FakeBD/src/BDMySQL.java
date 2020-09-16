/* quando uma classe IMPLEMENTS uma Interface, significa que ela se compromete a
 * colocar lógica nos métodos que foram definidos na interface
 */

public class BDMySQL implements InterfaceBD{

	private String username;
	private String password;
	private String database;
	
	
	public BDMySQL(String username, String password, String database) {
		super();
		this.username = username;
		this.password = password;
		this.database = database;
	}

	@Override
	public void conectar() {
		System.out.println("Conectando na base "+database+" com username:"+username);
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando da base "+database);
	}

	@Override
	public void executarComando(String cmd) {
		System.out.println("mysql> "+cmd);
	}

}
