public class Programa {
	public static void main(String[] args) {
		Pookemon venusaur = new Pookemon("Venusaur", "Grass", 56);

		venusaur.aprenderAtk(new FolhaNavalha());
		venusaur.aprenderAtk(new Corte());

		System.out.println("--- Dois ataques ---");
		usarTodos(venusaur);

		venusaur.aprenderAtk(new Terremoto());

		System.out.println("--- Tres ataques ---");
		usarTodos(venusaur);

		venusaur.substituirAtk(1, new Terremoto());

		System.out.println("--- Depois de substituir o slot A ---");
		usarTodos(venusaur);
	}

	private static void usarTodos(Pookemon p) {
		p.ataqueA();
		p.ataqueB();
		p.ataqueC();
		p.ataqueD();
	}
}
