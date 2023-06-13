package exercicios;
import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int soma = 0;
		
		while (i <=100) {
			soma = soma +i;
			i++;
		}
		 JOptionPane.showMessageDialog(null, "A soma de todos os numeros de 0 - 100 e igual a " + soma);
	}

}
