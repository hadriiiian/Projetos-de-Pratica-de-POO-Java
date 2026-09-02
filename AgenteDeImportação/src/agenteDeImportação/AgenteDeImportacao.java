package agenteDeImportação;

public class AgenteDeImportacao {
	public float converter(ProdutoImportado pi) {
		float convertido = (float) (pi.getPreco() * 5.13);
		return convertido;
	}
	public float calcularImposto(ProdutoImportado pi) {
		float imposto = (float) ((pi.getPreco() * 0.6)*5.13);
		return imposto;
	}
}
