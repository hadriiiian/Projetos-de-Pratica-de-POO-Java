public class NutricionistaEnum {
	public ResultadoIMC avaliarIMC(Paciente p) {
		float imc = (float) (p.getPeso()/(Math.pow(p.getAltura(), 2)));
		
		if (imc < 18.5) {
			return ResultadoIMC.BAIXO_PESO;
		} else if (imc >= 18.5 && imc <= 24.99) {
			return ResultadoIMC.NORMAL;
		} else if (imc >= 25 && imc <= 29.99) {
			return ResultadoIMC.SOBREPESO;
		} else {
			return ResultadoIMC.OBESIDADE;
		}
	}
}
