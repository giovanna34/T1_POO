package questao18;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peso_saco, ra��o_gato1, ra��o_gato2, total_final;
		peso_saco= Integer.parseInt(JOptionPane.showInputDialog("Qual o peso do saco?"));
		ra��o_gato1=Integer.parseInt(JOptionPane.showInputDialog("Quanto custa a ra��o do gato 1?"));
		ra��o_gato2=Integer.parseInt(JOptionPane.showInputDialog("Quanto custa a ra��o do gato 2?"));
		ra��o_gato1= ra��o_gato1/ 1000;
		ra��o_gato2= ra��o_gato2/1000;
		total_final= peso_saco - 5* (ra��o_gato1 + ra��o_gato2);
		System.out.println("Restar�  ap�s 5 dias o total de "+total_final+" gramas de ra��o no saco para os seus gatinhos!");
	}

}
