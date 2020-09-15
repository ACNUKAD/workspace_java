package model;

public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;
	public QuestaoSimples(String enunciado, String resposta) {
		super();
		this.enunciado = enunciado;
		this.resposta = resposta;
	}
	
	public String aplicarQuestao() {
		return "Q:"+enunciado;
	}
	public boolean corrigir(String respAluno) {
		return this.resposta.equalsIgnoreCase(respAluno);
	}

}
