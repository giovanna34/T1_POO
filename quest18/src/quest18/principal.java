package quest18;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int peso_saco, ração_gato1, ração_gato2, total_final;
		peso_saco= Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do saco?"));
		ração_gato1=Integer.parseInt(JOptionPane.showInputDialog("Quanto custa a ração do gato 1?"));
		ração_gato2=Integer.parseInt(JOptionPane.showInputDialog("Quanto custa a ração do gato 2?"));
		ração_gato1= ração_gato1/ 1000;
		ração_gato2= ração_gato2/1000;
		total_final= peso_saco - 5* (ração_gato1 + ração_gato2);
		System.out.println("Restará  após 5 dias o total de "+total_final+" gramas de ração no saco para os seus gatinhos!");
		// TODO Auto-generated method stub

	}

}
