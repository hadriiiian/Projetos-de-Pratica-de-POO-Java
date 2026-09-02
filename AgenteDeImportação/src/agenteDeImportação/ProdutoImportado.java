package agenteDeImportação;

public class ProdutoImportado {
	private String tipo;
	private float preco;
	
	//getters
	
	public String getTipo() {
		return tipo;
	}
	public float getPreco() {
		return preco;
	}
	
	//setters
	
	public void setTipo(String newValue) {
		tipo=newValue;
	}
	public void setPreco(float newValue) {
		preco=newValue;
	}
}
