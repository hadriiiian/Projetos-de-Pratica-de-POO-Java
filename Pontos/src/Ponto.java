public class Ponto {
	private int x;
	private int y;
	
	//getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//setters
	public void setX(int newValue) {
		x = newValue;
	}
	public void setY(int newValue) {
		y = newValue;
	}
	
	public String quadrante() {
		if (x == 0 || y == 0) {
			return "Origem";
		}
		if (x>0) {
			if (y>0) {
				return "1° quadrante";
			} else {
				return "4° quadrante";
			}
		} else {
			if (y>0) {
				return "2° quadrante";
			} else {
				return "3° quadrante";
			}
		}
		
	}
	
	public boolean ehIgual(Ponto other) {
		if (x == other.getX() && y == other.getY()) {
			return true;
		} else {
			return false;
		}
	}
}
