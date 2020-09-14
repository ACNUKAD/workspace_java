
public class Livro {
	private String  titulo;
	private String  autor;
	private int     anoPublicacao;
	private String  categoria;
	private int     numEstante;
	private int     posPrateleira;
	private boolean disponivel;
	
	
	public Livro(String titulo, String autor, int anoPublicacao, String categoria, int numEstante, int posPrateleira,
			boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.numEstante = numEstante;
		this.posPrateleira = posPrateleira;
		this.disponivel = disponivel;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getNumEstante() {
		return numEstante;
	}
	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}
	public int getPosPrateleira() {
		return posPrateleira;
	}
	public void setPosPrateleira(int posPrateleira) {
		this.posPrateleira = posPrateleira;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void emprestar() {
		disponivel = false;
	}
	public void devolver() {
		disponivel = true;
	}
	public void mostrarInfo() {
		System.out.println("Titulo:"+titulo+" ("+anoPublicacao+")");
		System.out.println("   "+categoria+"   Autor: "+autor);
		System.out.println("   Localizacao: estante: "+numEstante+" prateleira:"+posPrateleira);
		if (disponivel) {
			System.out.println("   O Livro está DISPONÍVEL");
		}
		else {
			System.out.println("   Livro EMPRESTADO");
		}
	}
	
}
