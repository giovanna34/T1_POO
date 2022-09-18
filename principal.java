package questao22;
import javax.swing.JOptionPane;
public class principal {

	public static void main(String[] args) {
		int vlr_sal,qtd_kw,vlr_kw,vlr_reais,desc,vlr_desc;
		vlr_sal= Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do seu salario?"));
		qtd_kw= Integer.parseInt(JOptionPane.showInputDialog("Qual quantidade de quilowatts consumidos?"));
		vlr_kw= vlr_sal /5;
		vlr_reais= vlr_kw* qtd_kw;
		desc=vlr_reais *15/100;
		vlr_desc=vlr_reais- desc;
		System.out.println("O valor em reais de cada quilowatt é de:"+vlr_kw+"! ");
		System.out.println("O valor em reais a ser pago é de:"+vlr_reais+"! ");
		System.out.println("O valor do seu desconto é de:"+vlr_desc+"! ");
		// TODO Auto-generated method stub

	}

}
