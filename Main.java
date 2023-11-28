import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		// creando o painel
		Window f1= new Window();
		
		//criando a cobra
		f1.setTitle("Cobrinha");
		f1.setSize(300,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
