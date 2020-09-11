package nucleo;

public class Empregado {
	// atributos
	private String nome;
	private String cargo;
	private double salario;

	// vou entao criar métodos para acessar esses atributos
	// 1 método para modificar o valor (ex: eu posso criar rotinas de validação)
	// 1 método para consultar o valor (ex: formatar o salario com 2 digitos)

	// "atribuir" em inglês = set
	// "consultar" em inglês = get
	public void setNome(String novoNome) {
		nome = novoNome;
	}

	public String getNome() {
		return nome;
	}

	public void setCargo(String novoCargo) {
		cargo = novoCargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(double novoSalario) {
		salario = novoSalario;
	}

	public double getSalario() {
		return salario;
	}

	public void imprimir() {
		System.out.println("Nome   : " + nome);
		System.out.println("Cargo  : " + cargo);
		System.out.printf("Salario: R$ %.2f\n", salario);
		System.out.printf("Imposto: R$ %.2f\n", calcularImposto());
	}

	/*
	 * todo método tem o seguinte cabeçalho (assinatura)
	 * 
	 * TIPO_RETORNO nomeMetodo (LISTA_PARAMETROS_DE_ENTRADA) TIPO NOME, TIPO NOME2,
	 * TIPO NOME, ...
	 */
	// o intuito deste método é modificar o valor do atributo SALARIO
	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}

	public double calcularImposto() {
		/*
		 * salario <= 2000 --> 0 salario >2000 <= 4500 --> 10% salario > 4500 ---> 1200
		 * 
		 */
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 4500.0) {
			imposto = salario * 0.1;
		} else {
			imposto = 1200.0;
		}
		return imposto;

	}

}
