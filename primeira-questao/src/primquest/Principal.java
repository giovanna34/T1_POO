package primquest;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 1"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 2"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 3"));
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero 4"));
		int soma = (num1 + num2 + num3 + num4);
		String msg = "a soma dos numeros é:" + soma;
		JOptionPane.showInternalMessageDialog(null, msg);
		
		// TODO Auto-generated method stub

	}

}
