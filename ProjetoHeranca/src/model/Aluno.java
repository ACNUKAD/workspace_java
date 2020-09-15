package model;

import core.Pessoa;

/*
 *  Crio a classe aluno que ESTENDE (HERDA) ou AMPLIA o conceito de Pessoa
 *  O que significa? Aluno tem tudo o que tem em pessoa (Automático) mais suas próprias
 *  informações
 */
public class Aluno extends Pessoa{
	private int numMatricula;
	private String curso;
	private int anoFormatura;
	
	

	public int getNumMatricula() {
		return numMatricula;
	}



	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public int getAnoFormatura() {
		return anoFormatura;
	}



	public void setAnoFormatura(int anoFormatura) {
		this.anoFormatura = anoFormatura;
	}



	public void mostrarInfo() {
		System.out.println("Aluno: "+nome+ " ("+email+") "+telefone+" - "+numMatricula + "/"+curso+"-"+anoFormatura);
	}
}
