
public class Biblioteca {
	public static void main(String[] args) {
		Livro l1, l2, l3;
		
		l1 = new Livro("Java Basico","Prof. Isidro",2020, "Comedia ", 1, 3, true);
		l2 = new Livro("Java OO    ","Prof. Isidro",2020, "Terror  ", 1, 4, false);
		l3 = new Livro("Java WEB   ","Prof. Isidro",2020, "Suspense", 2, 1, true);
		
		l1.mostrarInfo();
		l2.mostrarInfo();
		l3.mostrarInfo();
		
		l1.emprestar();
		System.out.println("---> acabei de emprestar L1");
		
		l1.mostrarInfo();
		l2.mostrarInfo();
		l3.mostrarInfo();
		
		System.out.println("----> devolvi tudão!!!");
		l1.devolver();
		l2.devolver();
		
		l1.mostrarInfo();
		l2.mostrarInfo();
		l3.mostrarInfo();
	}

}
