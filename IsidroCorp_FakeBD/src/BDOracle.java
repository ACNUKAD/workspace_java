
public class BDOracle implements InterfaceBD {
	private String username;
	private String password;
	private String database;
	private boolean criptografia;
	
	public BDOracle(String username, String password, String database, boolean criptografia) {
		super();
		this.username = username;
		this.password = password;
		this.database = database;
		this.criptografia = criptografia;
	}

	@Override
	public void conectar() {
		System.out.println("Connected on "+database+" using credentials:"+username);
		
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnected!");
	}

	@Override
	public void executarComando(String cmd) {
		System.out.println("oracle> "+cmd);
	}
	
	

}
