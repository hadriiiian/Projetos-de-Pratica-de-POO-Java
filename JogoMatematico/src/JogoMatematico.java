public class JogoMatematico {
	private String calculo;
	private int resposta;
	
	//getters
	public String getCalculo() {
		return calculo;
	}
	public int getResposta() {
		return resposta;
	}
	
	public void sortearCalculo() {
		int n1 = (int) (Math.random() * 101);
		int n2 = (int) (Math.random() * 101);
		
		int escolha = 1 + (int) (Math.random() * 4);
		String operacao = "";
		int resultado = 0;
		
		switch (escolha) {
		case 1:
			operacao = "+";
			resultado = n1 + n2;
			break;
		case 2:
			operacao = "-";
			resultado = n1 - n2;
			break;
		case 3:
			operacao = "*";
			resultado = n1 * n2;
			break;
		case 4:
			operacao = "/";
			resultado = (n2 != 0) ? n1/n2 : n1/(n2+=1);
			break;
		}
		
		calculo = String.format("%d %s %d", n1, operacao, n2);
		
		resposta = resultado;
	}
	
	public boolean checarResposta(int i) {
		return (resposta == i);
	}
}
