/* o propósito de termos uma interface é justamente termos um "contrato" entre
 * a classe que chama e a classe que implementa, ou seja:
 * 
 * a classe que chama as funcionalidades sabe O QUE CHAMAR
 * a classe que implementa as funcionalidades sabe COMO FUNCIONAM aquilo que foi chamado
 * 
 * Neste exemplo: a InterfaceBD define 3 métodos para manipular uma base de dados
 *  - conectar
 *  - desconectar
 *  - executarComando
 */

public interface InterfaceBD {
	public void conectar();
	public void desconectar();
	public void executarComando(String cmd);
}
