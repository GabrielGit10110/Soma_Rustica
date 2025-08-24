package view;

import controller.*;
import javax.swing.JOptionPane;

public class SomaRustica {
	public static void main(String[] args) {
		int numA = Integer.parseInt(JOptionPane.showInputDialog(null,
			"Digite o primeiro numero: "));
		int numB = Integer.parseInt(JOptionPane.showInputDialog(null,
			"Digite o segundo numero: "));

		int sum = SomaRusticaController.rusticSum(numA, numB);

		JOptionPane.showMessageDialog(null, sum);

	}
	
}
