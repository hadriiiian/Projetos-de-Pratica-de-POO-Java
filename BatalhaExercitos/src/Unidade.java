public abstract class Unidade {

	public abstract boolean ganhaQuandoAtacadoPor(Unidade u);

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
			return true;
		}
	
	public int hashCode() {
		return getClass().hashCode();
	}
}
