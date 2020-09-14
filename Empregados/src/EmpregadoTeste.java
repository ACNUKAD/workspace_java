import nucleo.Empregado;

public class EmpregadoTeste {
	public static void main(String[] args) {
		
		
		Empregado e1, e2, e3;
		
		e1 = new Empregado("Professor Isidro","Professor",3500.0);
		e2 = new Empregado("Deosdedite Ferreira","Diretora",5000.0);
		e3 = new Empregado("Margareth Pires da Fonseca","Supervisora",4000.0);
		
//		e1.setNome();
//		e1.setCargo();
//		e1.setSalario();
		
//		e2.setNome();
//		e2.setCargo();
//		e2.setSalario();
//		
//		e3.setNome();
//		e3.setCargo();
//		e3.setSalario();
		
		System.out.println("-------> Antes do aumento do ordenado....");
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
		System.out.println("-------> Depois do aumento do ordenado....");
		e1.aumentarSalario(10.0);
		e2.aumentarSalario(5.0);
		e3.aumentarSalario(15.0);
		e1.imprimir();
		e2.imprimir();
		e3.imprimir();
//		
//		System.out.println("Imposto do empregao e1 = "+e1.calcularImposto());
		
//		System.out.println("Nome = "+e1.getNome()+ "/" +e1.getCargo()+" R$ "+e1.getSalario());
		
	}

}
