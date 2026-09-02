public class Nutricionista {
	public String avaliarIMC(Paciente p) {
		float imc = (float) (p.getPeso()/(Math.pow(p.getAltura(), 2)));
		
		if (imc < 18.5) {
			return "com baixo peso.";
		} else if (imc >= 18.5 && imc <= 24.99) {
			return "normal.";
		} else if (imc >= 25 && imc <= 29.99) {
			return "com sobrepeso.";
		} else {
			return "com obesidade.";
		}
	}
}
