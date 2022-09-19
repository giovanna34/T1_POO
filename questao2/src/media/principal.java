package media;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		int nota1 = Integer.parseInt(JOptionPane.showInputDialog("digite a nota 1"));
		int nota2 = Integer.parseInt(JOptionPane.showInputDialog("digite a nota 2"));
		int nota3 = Integer.parseInt(JOptionPane.showInputDialog("digite a nota 3"));
		int media = (nota1 + nota2 + nota3)/3;
		String msg = "a media das notas é:" + media;
		JOptionPane.showInternalMessageDialog(null, msg);
		// TODO Auto-generated method stub

	}

}
