package controller;

public class SomaRusticaController {

	public static int rusticSum(int numA, int numB) {

		if (numB == 0) {
			return numA;
		}

		if (numB > 0) {
			return rusticSum(numA + 1, numB - 1);
		} else {
			System.out.println("Valor Invalido");
			return 0;
		}

	}
}
