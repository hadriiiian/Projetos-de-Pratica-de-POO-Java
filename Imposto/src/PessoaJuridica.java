public class PessoaJuridica {
	private String nome;
	private String cnpj;
	private int qtdFunc;
	private Pessoa responsavel;
	
	//construtor
	public PessoaJuridica(String n, String c, int q, Pessoa r) {
		nome = n;
		cnpj = c;
		qtdFunc = q;
		responsavel = r;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public int getQtdFunc() {
		return qtdFunc;
	}
	public Pessoa getResponsavel() {
		return responsavel;
	}
	
}
