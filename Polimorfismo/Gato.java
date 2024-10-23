package Polimorfismo;

public class Gato extends Animal {
	private static String sexo_;
	public Gato(String nome, String sexo, String raca) {
		super(nome, raca, sexo_);
	}
	@Override
	public void emitirSom() {
		System.out.println("Miauuuu");
	}

}
