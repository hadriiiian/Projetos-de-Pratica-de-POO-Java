
public class AtendenteDaEnfermaria {
	public boolean avaliarDoador(Pessoa p, boolean tat, boolean alc) {
		 if ((p.getIdade()>=19) && (p.getIdade()<=69)) {
			 if (p.getPeso()>=50) {
				 if (tat == false) {
					 if (alc == false) {
						 return true;
					 } else {
						 return false;
					 }
				 } else {
					 return false;
				 }
			 } else {
				 return false;
			 }
		 } else {
			 return false;
		 }
	}
}
