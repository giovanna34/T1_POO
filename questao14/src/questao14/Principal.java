package questao14;
import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
			int ano_atual, ano_nascimento, idade_atual, idade_2005;
			ano_nascimento= Integer.parseInt(JOptionPane.showInputDialog("Você nasceu em que ano?"));
			ano_atual= Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
			idade_atual= ano_atual- ano_nascimento;
			idade_2005= 2005- ano_nascimento;
			System.out.println("Em 2005 voce terá  " +  idade_2005 + " anos, você tem "+ idade_atual + " anos");
			
		// TODO Auto-generated method stub

	}

}
