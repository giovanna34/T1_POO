package questao25;
import  javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int custo_espetaculo, preço_convite, qtd_convites;
		custo_espetaculo= Integer.parseInt(JOptionPane.showInputDialog("Quanto custa o espetáculo teatral?"));
		preço_convite= Integer.parseInt(JOptionPane.showInputDialog("Quanto custa o convite?"));
		qtd_convites= custo_espetaculo /preço_convite;
		System.out.println("A quantidade de convites que você precisa vender para pagar o espetáculo é: "+qtd_convites+" convites, vai dar certo! ");
	}

}
