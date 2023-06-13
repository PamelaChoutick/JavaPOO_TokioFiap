package homework;
import javax.swing.JOptionPane;

public class Fatorial {
	
	public static void main(String[] args) {
	
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:")); 
		int fat = 1;
		
		for ( int i = 1; i <= valor; i++) {
			fat *= i ;
		}
		
		System.out.println(valor + " - " + fat);
		
}
}
