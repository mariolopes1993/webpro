package aula8;

public class Contador {
	
	private static int cont;
	
	public static void novoAcesso() {
		cont += 1;
	}
	public static int getQtdAcessos() {
		return cont;
	}
	
}
