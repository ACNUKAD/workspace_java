
public class Produto {
	private int    id;
	private String descricao;
	private float  preco;
	
	public Produto(int id, String descricao, float preco) throws IsiException {
		super();
		setId(id);
		setDescricao(descricao);
		setPreco(preco);
	}
	
	public Produto() {
		super();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("ID invalido");
		}
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) throws IsiException {
		if (descricao == null || descricao.length() == 0) {
			throw new IsiException("Descricao sem conteudo");
		}
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) throws IsiException {
		if (preco < 0 ) {
			throw new IsiException("Preco nao pode ser negativo");
		}
		this.preco = preco;
	}
}
