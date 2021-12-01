import javax.swing.JOptionPane;


public class alert {

	public static void main(String[] args) {
		
		String Login, Senha;
		
		Login = JOptionPane.showInputDialog("Digite seu login");
		Senha = JOptionPane.showInputDialog("Digite a Senha");
		
		System.out.println("nome:" + Login + "senha" + Senha);
	}

}
