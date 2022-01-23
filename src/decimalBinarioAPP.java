import javax.swing.JOptionPane;

public class decimalBinarioAPP {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
		System.out.println("El binario de " + number + " es: " + numBinary(number));

	}

	public static String numBinary(int number) {
		String result = "";
		int resto = number % 2;
		int resultadoDivision = number / 2;
		result = resto + ""; // MANERA RAPIDA DE CONVERTIR INT A STRING
		while (resultadoDivision >= 1) {
			resto = resultadoDivision % 2;
			resultadoDivision = resultadoDivision / 2;
			result = resto + result;
		}
		return result;
	}

}
