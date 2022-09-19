package questao21;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("digite a altura em que se deseja pregar o quadro:"));
		int z = Integer.parseInt(JOptionPane.showInputDialog("digite o tamanho da escada:"));
		double y = (z*z - x*x);
		String msg = "a distancia da escada da parede é:" +  Math.sqrt(y);
		JOptionPane.showInternalMessageDialog(null, msg);

		// TODO Auto-generated method stub

	}

}
