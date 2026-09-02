public class Retangulo {
	private int base;
	private int altura;
	
	//getters
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	//setters
	public void setBase(int newValue){
		base = newValue;
	}
	public void setAltura(int newValue) {
		altura = newValue;
	}
	
	public int perimetro() {
		return (base * 2) + (altura * 2);
	}
	
	public boolean isSquare() {
		if (base == altura) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ehIgual(Retangulo r) {
		return (base == r.getBase() && altura == r.getAltura()) || (base == r.getAltura() && altura == r.getBase());
	}
}
