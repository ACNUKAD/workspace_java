import java.util.HashMap;

public class TesteBenchmark {
	public static void main(String[] args) {
		
		HashMap<Integer, Produto> mapa;
		mapa = new HashMap<Integer, Produto>();
		
		for (int i=1; i<1000000; i++) {
			mapa.put(i, new Produto(i, "Produto"+i, i));
		}
		
		long ini, fim;
		int idBusca=-1;
		ini = System.currentTimeMillis();
		for (int vezes = 1; vezes<=1000; vezes++) {
			// eu troco o percurso pela operação GET do HashMap
			Produto p = mapa.get(idBusca);
			if (p != null) {
				System.out.println("ACHEI!");
			}
		}
		fim = System.currentTimeMillis();
		System.out.println("Demorei "+(fim-ini)+" milissegundos");
		
		
		
		/*
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		
		
		// inserindo 10000 objetos do tipo Produto
		for (int i=1; i<10000; i++) {
			lista.add(new Produto(i,"Produto"+i,i));
		}
		
		// quero medir tempo!!!
		long ini, fim;
		
		ini = System.currentTimeMillis();
		int idBusca = -1;
		// pequeno teste de Stress
		for (int vezes = 1; vezes<=1000; vezes++) {
			
			//. como eu faço pra procurar?? percorro a lista, elemento a elmemento, tentando
			// encontrar o valor
			for (int i=0; i<lista.size();i++) {
				if (idBusca == lista.get(i).getId()) {
					System.out.println("Achei!");
					break;
				}
			}
		}
		fim = System.currentTimeMillis();
		System.out.println("Demorei "+ (fim-ini)+" milissegundos");
		*/
	}

}
