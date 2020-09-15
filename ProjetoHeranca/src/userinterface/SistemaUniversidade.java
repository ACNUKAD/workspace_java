package userinterface;
import core.Pessoa;
import model.Aluno;
import model.Professor;

public class SistemaUniversidade {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Aluno  a = new Aluno();
		Professor r = new Professor();
		
		p.setNome("Nome da Pessoa");
		p.setEmail("Email da Pessoa");
		p.setEmail("Telefone da Pessoa");
		
		a.setNome("Nome do Aluno");
		a.setEmail("Email do Aluno");
		a.setTelefone("Telefone do Aluno");
		a.setNumMatricula(123);
		a.setCurso("Computação");
		a.setAnoFormatura(2020);
		
		r.setNome("Nome do Professor");
		r.setEmail("Email do Professor");
		r.setTelefone("Telefone do Professor");
		r.setDisciplina("Java");
		r.setAreaFormacao("Engenharia de Software");
		
		p.mostrarInfo();
		a.mostrarInfo();
		r.mostrarInfo();
	}

}
