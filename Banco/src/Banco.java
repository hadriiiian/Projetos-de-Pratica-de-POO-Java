public class Banco {
	private ContaCorrente[] contasSalvas = new ContaCorrente[10];
	private int qtdContasSalvas = 0;
	
	//getters
	public ContaCorrente[] getContasSalvas() {
		return contasSalvas;
	}
	public int getQtdContasSalvas() {
		return qtdContasSalvas;
	}
	
	//setters
	public void setContasSalvas(ContaCorrente[] c) {
		contasSalvas = c;
	}
	public void setQtdContasSalvas(int i) {
		qtdContasSalvas = i;
	}
	
	public boolean salvarConta(ContaCorrente c) {
		if (qtdContasSalvas >= 10) {
	        return false;
	    }
		
		for (int i = 0; i < qtdContasSalvas; i++) {
	        if (contasSalvas[i].ehIgual(c)) {
	            return false;
	        }
	    }
		
		contasSalvas[qtdContasSalvas++] = c;
	    return true;
	}
	
	public ContaCorrente recuperarConta(String num) {
		for (ContaCorrente conta: contasSalvas) {
			if (conta != null) {
				if (conta.getNumero().equals(num))
					return conta;
			}
		}
		
		return null;
	}
}
