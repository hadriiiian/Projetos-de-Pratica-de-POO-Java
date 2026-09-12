public class Peca {
	private int ladoA;
	private int ladoB;
	
	//construtor
	public Peca(int a, int b) {
		setLadoA(a);
		setLadoB(b);
	}
	
	//getters
	public int getLadoA() {
		return ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	
	//setters
	public void setLadoA(int i) {
		if (i >= 0 && i <= 6)
	        ladoA = i;
	}
	public void setLadoB(int i) {
		if (i >= 0 && i <= 6)
	        ladoB = i;
	}
	
	public boolean validarJuncao(Peca p) {
		if (p == null) {
			return false;
		}
		
		return ladoA == p.getLadoA() || ladoA == p.getLadoB() || ladoB == p.getLadoA() || ladoB == p.getLadoB();
	}
	
	public String toString() {
		return String.format("[%d, %d]", ladoA, ladoB);
	}
	public boolean equals(Object obj) {
	    if (obj instanceof Peca) {
	        Peca p = (Peca) obj;
	        return (ladoA == p.ladoA && this.ladoB == p.ladoB) || (this.ladoA == p.ladoB && this.ladoB == p.ladoA);
	    }
	    return false;
	}
}
