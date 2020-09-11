import nucleo.Empregado;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1, e2, e3;
		
		e1 = new Empregado();
		e2 = new Empregado();
		e3 = new Empregado();
		
		e1.setNome("Professor Isidro");
		e1.setCargo("Professor");
		e1.setSalario(3500.0);
		
		e2.setNome("Deosdedite Ferreira");
		e2.setCargo("Diretora");
		e2.setSalario(5000.0);
		
		e3.setNome("Margareth Pires da Fonseca");
		e3.setCargo("Supervisora");
		e3.setSalario(4000.0);
		
//		System.out.println("-------> Antes do aumento do ordenado....");
//		e1.imprimir();
//		e2.imprimir();
//		e3.imprimir();
//		System.out.println("-------> Depois do aumento do ordenado....");
//		e1.aumentarSalario(10.0);
//		e2.aumentarSalario(5.0);
//		e3.aumentarSalario(15.0);
//		e1.imprimir();
//		e2.imprimir();
//		e3.imprimir();
//		
//		System.out.println("Imposto do empregao e1 = "+e1.calcularImposto());
		
		System.out.println("Nome = "+e1.getNome()+ "/" +e1.getCargo()+" R$ "+e1.getSalario());
		
	}

}
