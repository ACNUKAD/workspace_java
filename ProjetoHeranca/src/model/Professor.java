package model;

import core.Pessoa;

public class Professor extends Pessoa {
	private String disciplina;
	private String areaFormacao;
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getAreaFormacao() {
		return areaFormacao;
	}

	public void setAreaFormacao(String areaFormacao) {
		this.areaFormacao = areaFormacao;
	}

	public void mostrarInfo() {
		System.out.println("Professor: "+nome+" ("+email+") "+telefone + " - "+disciplina+"/"+areaFormacao);
	}
	

}
