package planejadorDeViagens;

public class Carro {
	private String modelo;
	private float autonomia;
	private int capacidadeDoTanque;
	
	//getters
	
	public String getModelo() {
		return modelo;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}
	
	//setters
	
	public void setModelo(String newValue) {
		modelo = newValue;
	}
	public void setAutonomia(float newValue) {
		autonomia = newValue;
	}
	public void setCapacidadeDoTanque(int newValue) {
		capacidadeDoTanque = newValue;
	}
}
