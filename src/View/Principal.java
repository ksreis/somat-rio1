package View;

import Controller.somatorio;

public class Principal {
	public static void main(String[] args) {
		somatorio Som = new somatorio();
		
		int n = 8;
		
		int soma = Som.soma(n);
		
		 System.out.println("O valor é " + soma );
    }
}
