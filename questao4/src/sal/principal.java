package sal;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		int sal = Integer.parseInt(JOptionPane.showInputDialog("digite seu salario antigo:"));
		int salnovo = (sal+sal *25/100);
		String msg = "seu salário novo é:" + salnovo;
		JOptionPane.showMessageDialog(null,msg);
		// TODO Auto-generated method stub

	}

}
