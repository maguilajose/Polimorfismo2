package Polimorfismo;

import aula28_08.Cachorro;
import aula28_08.Tigre;

public class Principal {
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Nego", "M", "Qualquer");
		lobo.emitirSom();
	
	Leao leao = new Leao("Ursolino", "M", "Qualquer");
	leao.emitirSom();
	
	Tigre tigre = new Tigre("Ursolina", "M", "Qualquer");
	tigre.emitirSom();
	
	Cachorro cachorro = new Cachorro("Ursolão", "M", "Qualquer");
	cachorro.emitirSom();
	
	Gato gato = new Gato("juca", "M", "Qualquer");
	gato.emitirSom();
	}
}
	

